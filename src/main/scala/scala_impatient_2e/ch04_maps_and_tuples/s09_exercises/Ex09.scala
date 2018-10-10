package scala_impatient_2e.ch04_maps_and_tuples.s09_exercises

/**
  * Write a function lteqgt(values: Array[Int], v: Int)
  * that returns a triple containing the counts of values less than v, equal to v, and greater than v.
*/
object Ex09 extends App {

  //way 1
  def lteqgt(values: Array[Int], v: Int) = (values.count(_ < v), values.count(_ == v), values.count(_ > v))

  //way 2
  def lteqgt2(values: Array[Int], v: Int) = {
    val (greater, others) = values.partition(_ > v)
    val (equal, less) = others.partition(_== v)
    (less.length, equal.length, greater.length)
  }
  println(lteqgt(Array(9, 13, 15, 21, 21, 33, 45, 75, 99), 21))  //(3, 2, 4)
  println(lteqgt2(Array(9, 13, 15, 21, 21, 33, 45, 75, 99), 21)) //(3, 2, 4)
}
