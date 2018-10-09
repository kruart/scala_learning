package scala_impatient_2e.ch04_maps_and_tuples.s01_constructing_a_map

object Demo extends App {
  // This constructs an immutable Map[String, Int] whose contents can't be changed
  val scores1 = Map("Alice" -> 10, "Bob" -> 3, "Cindy" -> 8)
  println(scores1("Alice"))

  //mutable map
  val scores2 = scala.collection.mutable.Map("Alice" -> 10, "Bob" -> 3, "Cindy" -> 8)
  scores2("Alice") = 11
  println(scores2("Alice"))

  val scores3 = new scala.collection.mutable.HashMap[String, Int] //blank map

  println(("Alice" -> 10).getClass) //scala.Tuple2

  //"Alice" -> 10 == ("Alice", 10)
  val scores4 = Map(("Alice", 10), ("Bob", 3), ("Cindy", 8))


}
