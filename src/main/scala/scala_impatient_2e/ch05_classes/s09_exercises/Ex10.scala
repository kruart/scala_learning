package scala_impatient_2e.ch05_classes.s09_exercises

/**
  * Consider the class
  * class Employee(val name: String, var salary: Double) {
  *   def this() { this("John Q. Public", 0.0) }
  * }
  * Rewrite it to use explicit fields and a default primary constructor. Which form do you prefer? Why?
  */
class Employee(val name: String = "John Q. Public", var salary: Double = 0.0)


