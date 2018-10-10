package scala_impatient_2e.ch04_maps_and_tuples.s05_sorted_maps

object Demo extends App {
  //If you need to visit the keys in sorted order, use a SortedMap
  val scores = scala.collection.immutable.SortedMap("Alice" -> 10, "Fred" -> 7, "Bob" -> 3, "Cindy" -> 8)
  println(scores)

  //If you want to visit the keys in insertion order, use a LinkedHashMap
  val months = scala.collection.mutable.LinkedHashMap("January" -> 1,
    "February" -> 2, "March" -> 3, "April" -> 4, "May" -> 5,
    "June" -> 6, "July" -> 7, "August" -> 8, "September" -> 9,
    "October" -> 10, "November" -> 11, "December" -> 12)
  println(months)

  // Contrast with a sorted map
  var months2 = scala.collection.mutable.SortedMap("January" -> 1,
    "February" -> 2, "March" -> 3, "April" -> 4, "May" -> 5,
    "June" -> 6, "July" -> 7, "August" -> 8, "September" -> 9,
    "October" -> 10, "November" -> 11, "December" -> 12)
  println(months2)

  // or a hash map
  var months3 = Map("January" -> 1,
    "February" -> 2, "March" -> 3, "April" -> 4, "May" -> 5,
    "June" -> 6, "July" -> 7, "August" -> 8, "September" -> 9,
    "October" -> 10, "November" -> 11, "December" -> 12)
  println(months3)  //unpredictable order
}
