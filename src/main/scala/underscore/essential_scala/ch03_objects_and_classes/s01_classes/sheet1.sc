class Person(val firstName: String = "Teddy", val lastName: String = "Bear") {
  def name = firstName + " " + lastName


}

val noel = new Person("Noel", "Welsh")
val dave = new Person("Dave", "Gurnell")
val teddy = new Person


object alien {
  def greet(p: Person) = {
    "Greetings, " + p.firstName + " " + p.lastName
  }
  def greet(title: String = "Citizen", firstName: String = "Some", lastName: String = "Body") =
    "Greetings, " + title + " " + firstName + " " + lastName + "!"
}

alien.greet(noel)
alien.greet(dave)
alien.greet(teddy)

alien.greet("Busy")
alien.greet(firstName = "Busy")


//Nothing an null
def badness = throw new Exception("Error") // badness: Nothing
def otherbadness = null // otherbadness: Null
val bar = if(true) 123 else badness // bar: Int = 123
val baz = if(false) "it worked" else otherbadness // baz: String = null