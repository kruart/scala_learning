package scala_impatient_2e.ch08_inheritance.s02_overriding_methods

class Person(var name: String = "") {
  override def toString =   s"${getClass.getName}[name=$name]"
}

class Employee extends Person {
  var salary = 0.0
  override def toString =  s"${super.toString}[salary=$salary]"
}

object Main extends App {
  val fred = new Employee
  fred.name = "Fred"
  fred.salary = 50000
  println(fred)
}

