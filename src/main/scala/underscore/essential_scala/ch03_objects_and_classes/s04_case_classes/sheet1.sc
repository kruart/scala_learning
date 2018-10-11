// Whenever we declare a case class, Scala automatically generates a class and companion object
case class Person(firstName: String, lastName: String) {
  def name = firstName + " " + lastName
}

Person
val dave = new Person("Dave", "Gurnell")
dave.firstName
dave

new Person("Noel", "Welsh").equals(new Person("Noel", "Welsh"))
new Person("Noel", "Welsh") == new Person("Noel", "Welsh")

dave.copy()
dave.copy(firstName = "Dave2")

//companion object contains an apply method
Person("Dave", "Gurnell") == Person("Noel", "Welsh")
Person("Dave", "Gurnell") == Person("Dave", "Gurnell")

//If you find yourself defining a case class with no constructor arguments
// you can instead a define a case object.
// A case object is defined just like a regular singleton object,
// but has a more meaningful toString method and extends the Product and Serializable traits:
case object Citizen {
  def firstName = "John"
  def lastName  = "Doe"
  def name = firstName + " " + lastName
}

Citizen.toString

