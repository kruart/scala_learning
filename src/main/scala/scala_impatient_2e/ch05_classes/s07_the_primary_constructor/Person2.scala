package scala_impatient_2e.ch05_classes.s07_the_primary_constructor

class Person2(var name: String, var age: Int) {
  def description = name + " is " + age + " years old"
}

/*
$ scalac Person2.scala
$ javap -private Person2
Compiled from "Person2.scala"
public class Person2 {
  private java.lang.String name;
  private int age;
  public java.lang.String name();
  public void name_$eq(java.lang.String);
  public int age();
  public void age_$eq(int);
  public java.lang.String description();
  public Person2(java.lang.String, int);
}

*/
