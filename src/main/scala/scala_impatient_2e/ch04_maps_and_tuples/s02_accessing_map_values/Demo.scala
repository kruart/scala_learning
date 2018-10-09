package scala_impatient_2e.ch04_maps_and_tuples.s02_accessing_map_values

object Demo extends App {
  val scores = Map("Alice" -> 10, "Bob" -> 3, "Cindy" -> 8)
  val bobsScore = scores("Bob") // Like scores.get("Bob") in Java

  val fredsScore = if (scores.contains("Fred")) scores("Fred") else 0
  scores.getOrElse("Bob", 0) //shortcut version

  scores.get("Bob") //returns an Option object
  scores.get("Fred") //returns an Option object

  val scores1 = scores.withDefaultValue(0)  //turn map into a map with a default value
  val zeldasScore1 = scores1.get("Zelda") // Yields 0 since "Zelda" is not present

  val scores2 = scores.withDefault(_.length)
  println(scores2.getClass)
  val zeldasScore2 = scores2.get("Zelda") // Yields 5, applying the length function to the key that is not present
}
