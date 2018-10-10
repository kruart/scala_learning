class Person(val name: String = "", val age: Int = 0) {
  //all definitions is part of primary constructor
  println("Just constructed another person")
  def description = name + " is " + age + " years old"
}

val p1 = new Person
val p2 = new Person("Fred")
val p3 = new Person("Fred", 42)
p1.description
p2.description
p3.description

import java.io.FileReader
import java.util.Properties

class MyProg {
  private val props = new Properties
  props.load(new FileReader("myprog.properties"))
  // The statement above is a part of the primary constructor
  // It is executed whenever an object is constructed
}

class Person2(val name: String, private var age: Int) {
  def description = name + " is " + age + " years old"
  def birthday() { age += 1 }
}

val p = new Person2("Fred", 42)
p.name
//p.age // Error--it's private
p.birthday()
p.description

// To make the primary constructor private, place the keyword private like this:
//A class user must then use an auxiliary constructor to construct a Person object.
class PersonPrivate private(val id: Int)


