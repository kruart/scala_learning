package scala_impatient_2e.ch04_maps_and_tuples.s09_exercises

import scala.collection.JavaConverters._

/**
  * Write a function minmax(values: Array[Int])
  * that returns a pair containing the smallest and the largest values in the array.
*/
object Ex08 extends App {
  def minmax(values: Array[Int]) = (values.min, values.max)
  println(minmax(Array(33, 11, 77, 55)))  //11 77
}
