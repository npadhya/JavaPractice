package com.nikul.javapractice.events;

/**
 * A simple test of the SunEvent source and listeners
 */
public class WeatherTest {
  /** Run a test on the weather station, using Scott's
   *    kids as sample students
   */
  public static void main(String[] args) {
    // create a new sun event source
    WeatherStation w = new WeatherStation();

    // add some students to listen for sun rise/set
    w.addSunListener(new Student("Nicole"));
    w.addSunListener(new Student("Alex"));
    w.addSunListener(new Student("Trevor"));
    w.addSunListener(new Student("Claire"));

    // display the GUI for the weather channel
    w.setVisible(true);
  }
}