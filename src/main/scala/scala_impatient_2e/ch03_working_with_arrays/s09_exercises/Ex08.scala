package scala_impatient_2e.ch03_working_with_arrays.s09_exercises

import scala.collection.mutable.ArrayBuffer

/** Suppose you are given an array buffer of integers and want to remove all but the first negative number. */
object Ex08 extends App {
  def removeAllNegativeButTheFirst(arr: ArrayBuffer[Int]): Unit = {
    val result = for (i <- arr.indices if arr(i) < 0) yield i
    result.drop(1).reverse.foreach(arr.remove)
  }

  val sum1 = ArrayBuffer(1, 2, -3, -1, 2, -3)
  val sum2 = ArrayBuffer(-1, -2, -3, -1, -2, -3)
  val sum3 = ArrayBuffer[Int]()

  removeAllNegativeButTheFirst(sum1)
  removeAllNegativeButTheFirst(sum2)
  removeAllNegativeButTheFirst(sum3)

  println(sum1.mkString(" ")) // 1, 2, -3, 2
  println(sum2.mkString(" ")) // -1
  println(sum3.mkString(" ")) // empty string
}