package com.nikul.javapractice.events;

/**
 * A sample SunListener, logging when the sun rises and sets
 */
public class Student implements SunListener {
	private String name;

	/** constructor -- get the student's name */
	public Student(String name) {
		this.name = name;
	}

	/** sunMoved method comment. */
	public void sunMoved(SunEvent e) {
		log(name + "	logs : " + (e.isRisen() ? "rose" : "set") + " at " + e.getDate());
	}

	/** A simple log method - just print the text */
	protected void log(String text) {
		System.out.println(text);
	}

	public void sunStopped(SunEvent e) {
		log(name + "	logs : " + (e.isStop() ? "rose" : "set") + " at " + e.getDate());

	}
}