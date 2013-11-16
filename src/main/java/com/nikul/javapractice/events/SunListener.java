package com.nikul.javapractice.events;

import java.util.EventListener;

/** A contract between a SunEvent source and
 *   listener classes
 */
public interface SunListener extends EventListener {
 /** Called whenever the sun changes position
   *   in a SunEvent source object 
   */
 public void sunMoved(SunEvent e);
}