package scala_impatient_2e.ch05_classes.s09_exercises

/**
  * In the Person class of Section 5.1, “Simple Classes and Parameterless Methods,” on page 55,
  * provide a primary constructor that turns negative ages to 0.
  */
class Person(var age: Int) {
  if (age < 0) age = 0
}

object Ex06 extends App {
  val person = new Person(-5)
  println(person.age)
}

