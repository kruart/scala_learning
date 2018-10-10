package scala_impatient_2e.ch05_classes.s02_properties_with_getters_and_setters

/**
  * enter this commands in terminal from this folder to look at bytecode which jvm generate from scala file
  * scalac Person.scala
  * javap -private Person
  *
  *
  * you see something like that:
  *
  * Compiled from "Person.scala"
  * public class Person {
  *   private int age;
  *   public int age();
  *   public void age_$eq(int);
  *   public Person();
  * }
  */

class Person {
  var age = 0
}
