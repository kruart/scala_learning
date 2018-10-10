package scala_impatient_2e.ch04_maps_and_tuples.s09_exercises

/*Set up a map of prices for a number of gizmos that you covet.
Then produce a second map with the same keys and the prices at a 10 percent discount.
 */
object Ex01 extends App {
  val gizmos = Map("Laptop" -> 999.0, "Smartphone" -> 599.0, "SuperPower" -> 1000000.0)

  val discount = for ((k, v) <- gizmos) yield (k, v * 0.9)
  println(discount)
}
