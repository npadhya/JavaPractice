package com.nikul.javapractice.events;

import java.util.Vector;
import java.util.Date;
import java.util.Enumeration;
import java.awt.Button;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.Serializable;

/** A sample event source - this class fires SunEvents
  *   to anyone watching. A simple GUI is provided
  *   with "rise" and "set" buttons that cause the
  *   SunEvents to be fired.
  */
public class WeatherStation extends Frame implements Serializable {
  private transient Vector listeners;

  /** Provide a simple GUI that triggers our SunEvents
    */
  public WeatherStation() {
    super("Sun Watcher");
    setLayout(new GridLayout(1,0));
    Button riseButton = new Button("Rise");
    Button setButton = new Button("Set");
    add(riseButton);
    add(setButton);

    // make the "Rise" button fire "rise" SunEvents
    riseButton.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) {
        fireSunMoved(true);
      }
    });

    // make the "Rise" button fire "set" SunEvents
    setButton.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) {
        fireSunMoved(false);
      }
    });

    // Provide a means to close the application
    addWindowListener(new WindowAdapter() {
      public void windowClosing(WindowEvent e) {
        System.exit(0);
      }
    });
    
    pack();
  }

  /** Register a listener for SunEvents */
  synchronized public void addSunListener(SunListener l) {
    if (listeners == null)
      listeners = new Vector();
    listeners.addElement(l);
  }  

  /** Remove a listener for SunEvents */
  synchronized public void removeSunListener(SunListener l) {
    if (listeners == null)
      listeners = new Vector();
    listeners.removeElement(l);
  }

  /** Fire a SunEvent to all registered listeners */
  protected void fireSunMoved(boolean rose) {
    // if we have no listeners, do nothing...
    if (listeners != null && !listeners.isEmpty()) {
      // create the event object to send
      SunEvent event = 
        new SunEvent(this, rose, new Date());

      // make a copy of the listener list in case
      //   anyone adds/removes listeners
      Vector targets;
      synchronized (this) {
        targets = (Vector) listeners.clone();
      }

      // walk through the listener list and
      //   call the sunMoved method in each
      Enumeration e = targets.elements();
      while (e.hasMoreElements()) {
        SunListener l = (SunListener) e.nextElement();
        l.sunMoved(event);
      }
    }
  }
}