class Person(val name: String, val age: Int) {
  override def toString = getClass.getName + "[name=" + name +
    ",age=" + age + "]"
}

class Employee(name: String, age: Int, val salary : Double) extends Person(name, age) {
  override def toString = s"${super.toString}[salary=$salary]"
}

new Employee("Fred", 42, 50000)

import java.io._
import java.nio.charset._
import java.nio.file._

class PathWriter(p: Path, cs: Charset) extends PrintWriter(Files.newBufferedWriter(p, cs))