package com.nikul.javapractice.events;

import java.util.Date;
import java.util.EventObject;

class SunEvent extends EventObject {

	private boolean risen;
	private Date date;
	int stopped = 1;

	public SunEvent(Object source, boolean risen, Date date) {
		super(source);
		this.risen = risen;
		this.date = date;
		stopped = (stopped + 1) % 2 ;
	}

	/** return a String representation of the date */
	public String getDate() {
		// return only a String representation
		// so the user cannot modify the real date
		return date.toString();
	}

	/** return whether the sun rose or set */
	public boolean isRisen() {
		return risen;
	}

	public boolean isStop() {
		System.out.println(stopped);
		if(stopped == 0)
			return false;
		else
			return true;
	}
}