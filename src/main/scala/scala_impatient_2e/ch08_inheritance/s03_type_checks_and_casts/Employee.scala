package scala_impatient_2e.ch08_inheritance.s03_type_checks_and_casts

//  Scala               | Java
//  obj.isIntanceOf[Cl] | obj instanceof Cl
//  obj.asIntanceOf[Cl] | (Cl)obj
//  classOf[Cl]         | Cl.class
class Person {
  var name = ""
  override def toString = s"[${getClass.getName}name=$name]"
}

class Employee extends Person {
  var salary = 0.0
  override def toString = s"${super.toString}[salary=$salary]"
}

class Manager extends Employee

object Main extends App {
  val r = scala.math.random
  val p = if (r < 0.33) new Person 
    else if (r < 0.67) new Employee 
    else new Manager  
  if (p.isInstanceOf[Employee]) {     
    val s = p.asInstanceOf[Employee] // s has type Employee
    println("It's an employee.")
    s.salary = 50000
    if (p.getClass == classOf[Manager]) {
      println("Actually, it's a manager")
      s.salary *= 2
    }
  }
  println(p)
}

