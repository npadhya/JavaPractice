package com.npadhya.practice.leetCode;

import java.util.*;

public class AllPathsFromSourceToTarget {



    public static List<List<Integer>> allPathsSourceTarget(int[][] graph) {

        Map<Integer,List<List<Integer>>> memoize = new HashMap<Integer, List<List<Integer>>>();
        List<List<Integer>> result = recursCount(graph,0, memoize);

        return result;
    }

    private static List<List<Integer>> recursCount(int[][] graph, int index,Map<Integer, List<List<Integer>>> memoize) {
        List<Integer> innerList = new ArrayList<Integer>();
        List<List<Integer>> outerList = new ArrayList<List<Integer>>();
        if(memoize.get(index) != null){
            return memoize.get(index);
        }

        if(graph[index].length == 0){
            innerList.add(index);
            outerList.add(innerList);
        } else {
            for (int nextNode : graph[index]) {
                List<List<Integer>> result = recursCount(graph, nextNode,memoize);
                for (List<Integer> path : result) {
                    LinkedList<Integer> newPath = new LinkedList<Integer>(path);
                    newPath.addFirst(index);
                    outerList.add(newPath);
                }
            }

        }

        memoize.put(index,outerList);
        return outerList;
    }
}