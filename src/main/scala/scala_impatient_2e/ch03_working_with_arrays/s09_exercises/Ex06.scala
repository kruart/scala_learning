package scala_impatient_2e.ch03_working_with_arrays.s09_exercises

import scala.collection.mutable.ArrayBuffer

/** How do you rearrange the elements of an Array[Int] so that they appear in reverse sorted order?
  *  How do you do the same with an ArrayBuffer[Int]? */
object Ex06 extends App {
  val arr1 = Array(21, 22, 23)
  val arr2 = ArrayBuffer(21, 22, 23)

  println(arr1.reverse.mkString(" "))
  println(arr1.sortWith(_>_).mkString(" "))

  println(arr2.reverse.mkString(" "))
  println(arr2.sortWith(_>_).mkString(" "))
}