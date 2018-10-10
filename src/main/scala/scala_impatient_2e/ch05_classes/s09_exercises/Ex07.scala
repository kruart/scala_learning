package scala_impatient_2e.ch05_classes.s09_exercises

/**
  * Write a class Person with a primary constructor that accepts
  * a string containing a first name, a space, and a last name, such as new Person("Fred Smith").
  * Supply read-only properties firstName and lastName.
  * Should the primary constructor parameter be a var, a val, or a plain parameter? Why?
  */
class Person1(var fullName: String) {
  private val splitName = fullName.split(" ")
  val (firstName, lastName) = (splitName(0), splitName(1))
}

object Ex07 extends App {
  val person = new Person1("Teddy Bear")
  println(person.firstName)
  println(person.lastName)
}

