package scala_impatient_2e.ch04_maps_and_tuples.s04_iterating_over_maps

object Demo extends App {
  val scores = Map("Alice" -> 10, "Bob" -> 3, "Cindy" -> 8)
  //The following amazingly simple loop iterates over all key/value pairs of a map
  for ((k, v) <- scores) println(k + " is mapped to " + v)

  for (k <- scores.keySet) println(k) // keys

  for (v <- scores.values) println(v) //only values

  //To reverse a map—that is, switch keys and values—use
  val reverseMap = for ((k, v) <- scores) yield (v, k)
  println(reverseMap)
}
