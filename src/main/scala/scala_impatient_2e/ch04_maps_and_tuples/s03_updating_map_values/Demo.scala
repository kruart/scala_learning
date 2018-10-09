package scala_impatient_2e.ch04_maps_and_tuples.s03_updating_map_values

/** Created by kruart on 21.08.2017. */
object Demo extends App {
  val scores1 = scala.collection.mutable.Map("Alice" -> 10, "Bob" -> 3, "Cindy" -> 8)

  // Updates the existing value for the key "Bob" (assuming scores is mutable)
  scores1("Bob") = 10
  println(scores1("Bob")) //10
  // Adds a new key/value pair to scores (assuming it is mutable)
  scores1("Fred") = 7


  val scores2 = scala.collection.mutable.Map("Alice" -> 10, "Bob" -> 3, "Cindy" -> 8)
  //Alternatively, you can use the += operation to add multiple associations
  scores2 += ("Bob" -> 10, "Fred" -> 7)
  //To remove a key and its associated value, use the -= operator
  scores2 -= "Alice" //remove

  val scores3 = Map("Alice" -> 10, "Bob" -> 3, "Cindy" -> 8)

  val newScores = scores3 + ("Bob" -> 10, "Fred" -> 7) // New map with update

  var scores4 = Map("Alice" -> 10, "Bob" -> 3, "Cindy" -> 8)
  scores4 = scores4 + ("Bob" -> 10, "Fred" -> 7)

  scores4 -= "Alice"  //remove
}
