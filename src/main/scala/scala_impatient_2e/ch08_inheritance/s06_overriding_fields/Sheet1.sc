class Person(val name: String) {
  override def toString = getClass.getName + "[name=" + name + "]"
}

class SecretAgent(codename: String) extends Person(codename) {
  override val name = "secret" // Don’t want to reveal name . . .
  override val toString = "secret" // . . . or class name
}

val fred = new Person("Fred")
fred.name
val james = new SecretAgent("007")
james.name

// It is more common to override an abstract def with a val
abstract class Person2 { // See Section 8.8 for abstract classes
  def id: Int // Each person has an ID that is computed in some way
}

class Student2(override val id: Int) extends Person2

class SecretAgent2 extends Person2 {
  override val id = scala.util.Random.nextInt
}

val fredy = new Student2(1729)
fredy.id
val johnny = new SecretAgent2
johnny.id