import scala.beans.BeanProperty

class Person {
  @BeanProperty var name : String = _
}

val fred = new Person
fred.setName("Fred")
fred.getName


//If you define a field as a primary constructor parameter
//and you want JavaBeans getters and setters, annotate the constructor parameter
class Person2(@BeanProperty var name: String)

val tom = new Person2("Tom")
tom.getName