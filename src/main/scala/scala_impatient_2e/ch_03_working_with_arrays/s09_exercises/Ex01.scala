package scala_impatient_2e.ch_03_working_with_arrays.s09_exercises

import scala.util.Random

// Write a code snippet that sets a to an array of n random integers between 0 (inclusive) and n (exclusive).
object Ex01 extends App {
  val arr = new Array[Int](Random.nextInt(50))
  for (i <- arr.indices) {
    arr(i) = Random.nextInt(arr.length)
  }

  println(arr.mkString(" "))
}