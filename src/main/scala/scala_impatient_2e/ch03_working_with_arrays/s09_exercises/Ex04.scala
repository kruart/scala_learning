package scala_impatient_2e.ch03_working_with_arrays.s09_exercises

/** Given an array of integers, produce a new array that contains all positive values of the original array,
  * in their original order, followed by all values that are zero or negative, in their original order.. */
object Ex04 extends App {
  val arr = Array(34, 3, -2, 0, 4, -7, 19)
//  val positive = (for (i <- arr.indices if arr(i) > 0) yield arr(i)).toArray
//  val negative = (for (i <- arr.indices if arr(i) <= 0) yield arr(i)).toArray

  val (positive, negative) = arr.partition(_ > 0)
  println(positive.mkString(" "))
  println(negative.mkString(" "))

  val newArr = positive ++ negative
  println(newArr.mkString(" "))
}