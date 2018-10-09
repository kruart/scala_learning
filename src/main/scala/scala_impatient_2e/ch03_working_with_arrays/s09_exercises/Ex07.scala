package scala_impatient_2e.ch03_working_with_arrays.s09_exercises

/** Write a code snippet that produces all values from an array with duplicates removed. (Hint: Look at Scaladoc.) */
object Ex07 extends App {
  val arr = Array(1, 2, 3, 1, 2, 3)
  //way 1
  val distinct = arr.distinct

  println(distinct.mkString(" ")) //1 2 3
}