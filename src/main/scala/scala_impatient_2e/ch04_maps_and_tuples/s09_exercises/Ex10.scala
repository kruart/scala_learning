package scala_impatient_2e.ch04_maps_and_tuples.s09_exercises

/**
  * What happens when you zip together two strings,
  * such as "Hello".zip("World")? Come up with a plausible use case.
*/
object Ex10 extends App {
  println("Hello".zip("World")  == Vector(('H','W'), ('e','o'), ('l','r'), ('l','l'), ('o','d')))

  // use case
  def getFullNames(firstName: Array[String], secondName: Array[String]) = {
    firstName.zip(secondName)
  }

  val fullNames = getFullNames(Array("Alice", "James"), Array("Williams", "Bond"))
  fullNames.foreach(n => println(n._1 + " " + n._2))
}
