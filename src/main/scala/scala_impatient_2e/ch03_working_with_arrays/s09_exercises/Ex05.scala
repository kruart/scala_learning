package scala_impatient_2e.ch03_working_with_arrays.s09_exercises

/** How do you compute the average of an Array[Double]? */
object Ex05 extends App {
  val arr = Array(21.7, 21.7, 21.7)

  val average = arr.sum / arr.length
  println(average)
}