package scala_impatient_2e.ch08_inheritance.s01_extending_a_class

class Person(var name: String = "Johnny") {
}

class Employee extends Person {
  var salary = 0.0
  def description = s"An employee with name $name and salary $salary"
}

object Main extends App {
  val fred = new Employee
  fred.name = "Fred"
  fred.salary = 50000
  println(fred.description)
}

