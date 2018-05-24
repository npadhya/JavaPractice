package com.npadhya.practice.bitwise;

public class BitwiseUtils {

    public void bitWiseNumbers(){
        int[] numArray =  {0,1,2,3,4,5,6,7,8,9};

        for(int i =0 ; i <20;i++){
            System.out.println("-------");
            System.out.println(i+" = " + i);
            System.out.println(i+" | 1 = " + (i | 1));
            System.out.println(i+" | 0 = " + (i | 0));
            System.out.println(i+" ^ 1 = " + (i ^ 1));
            System.out.println(i+" ^ 0 = " + (i ^ 0));
            System.out.println(i+" & 1 = " + (i & 1));
            System.out.println(i+" & 0 = " + (i & 0));
            System.out.println(i+" & -1 = " + (i & -1));
            System.out.println(i+" | -1 = " + (i | -1));
            System.out.println(i+" & -"+i+" = " + (i & -i));
            System.out.println(i+" | -"+i+" = " + (i | -i));

        }
    }

    public void nextExOr(){

        for(int i = 0; i < 20;i++){
            int ans1 = i ^ (i+1);
            int ans2 = (i+1) ^ i;
            int ans3 = i ^ (i+2);
            int ans4 = (i+2) ^ i;
            System.out.println(i+" xOR "+ (i + 1) +" = " + ans1);
            System.out.println((i + 1)+" xOR "+ i  +" = " + ans2);
            System.out.println(i+" xOR "+ (i + 2) +" = " + ans3);
            System.out.println((i + 2)+" xOR "+ i +" = " + ans4);
        }
    }

    int updateBits(int m, int n, int j, int i){
        int allOnes = ~0;
        int allOnes2 = 1;
        System.out.print(" M = ");
        printBitWise(m);
        System.out.print(" N = ");
        printBitWise(n);
        System.out.print(" J = ");
        printBitWise(j);
        System.out.print(" I = ");
        printBitWise(i);
        System.out.print(" allOnes = ");
        printBitWise(allOnes);
        System.out.print(" allOnes2 = ");
        printBitWise(allOnes2);

        int left = allOnes << (j + 1);
        System.out.print(" allOnes << (j + 1) = ");
        printBitWise(left);

        int right = ((1<<i) - 1);
        System.out.print(" ((1<<i) - 1) = ");
        printBitWise(right);

        int mask = left | right;
        System.out.print(" left | right = ");
        printBitWise(mask);

        int cleared = n & mask;
        System.out.print(" n & mask = ");
        printBitWise(cleared);

        int m_shifted = m << i;
        System.out.print(" m << i = ");
        printBitWise(m_shifted);

        System.out.print(" cleared | m_shifted = ");
        printBitWise(cleared | m_shifted);
        return cleared | m_shifted;
    }

    public void bitWiseAndOperation(){

        for(int i = 0; i < 1025; i++){
            boolean ans = ((i & -i) == i);
            printBitWise(i);
            System.out.println(i + " =" + ans);
        }
    }
    public void bitWiseNumberPrint(){
        /*printBitWise(2);
        printBitWise(-2);
        printBitWise(4);
        printBitWise(-4);
        printBitWise(8);
        printBitWise(-8);
        printBitWise(16);
        printBitWise(-16);
        printBitWise(32);
        printBitWise(-32);
        printBitWise(64);
        printBitWise(-64);
        printBitWise(128);
        printBitWise(-128);
        printBitWise(256);
        printBitWise(-256);
        printBitWise(512);
        printBitWise(-512);
        printBitWise(1024);
        printBitWise(-1024);
        printBitWise(2048);
        printBitWise(-2048);
        printBitWise(4096);
        printBitWise(-4096);
        printBitWise(8192);
        printBitWise(-8192);
        printBitWise(16384);
        printBitWise(-16384);
        printBitWise(32768);
        printBitWise(-32768);
        printBitWise(65536);
        printBitWise(-65536);*/
        /*printBitWise(131072);
        printBitWise(-131072);
        printBitWise(131073);
        printBitWise(-131073);
        printBitWise(131074);
        printBitWise(-131074);
        printBitWise(131075);
        printBitWise(-131075);
        printBitWise(131076);
        printBitWise(-131076);
        printBitWise(131077);
        printBitWise(-131077);
        printBitWise(68793278);
        printBitWise(-68793278);*/
        printBitWise(687932900);
        printBitWise(-687932900);
        printBitWise(687932900 & -687932900);
    }

    public void printBitWise(int n){
            int mask = 1 << 63;
            int count = 0;
            System.out.print(n + " = ");
            while(mask != 0) {
                if(count%4 == 0)
                    System.out.print(" ");
                if((mask&n) == 0)
                    System.out.print("0");
                else
                    System.out.print("1");
                count++;
                mask = mask >>> 1;
            }
            System.out.println();
    }
}
