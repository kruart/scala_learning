package scala_impatient_2e.ch_03_working_with_arrays.s04_transforming_arrays

import scala.collection.mutable.ArrayBuffer

object Demo extends App {
  // transformations don’t modify the original array but yield a new one.
  var a = ArrayBuffer(2, 3, 5, -7, 11)
  var result = for (elem <- a) yield 2 * elem
  println(result.mkString(" "))

  result = for (elem <- a if elem % 2 == 0) yield 2 * elem
  println(result.mkString(" ")) // 4

  // Alternatively, you could write
  a.filter(_ % 2 == 0).map(2 * _)

  // traditional solution to remove all negative numbers
  def removeAllNegatives(a: ArrayBuffer[Int]): Unit = {
    var n = a.length
    var i = 0
    while (i < n) {
      if (a(i) >= 0) i += 1
      else { a.remove(i); n -= 1 }
    }
  }

  //way with for/yield
  result = for (elem <- a if elem >= 0) yield elem

  //  Suppose that we want to modify the original array buffer instead, removing the unwanted elements.
  // Then we can collect their positions
  val positionsToRemove = for (i <- a.indices if a(i) < 0) yield i

  // Now remove the elements at those positions, starting from the back
  for (i <- positionsToRemove.reverse) a.remove(i)

  //Or better, remember the positions to keep, copy them over, and then shorten the buffer
  a = ArrayBuffer(2, 3, 5, -7, 11)
  val positionsToKeep = for (i <- a.indices if a(i) >= 0) yield i
  for (j <- positionsToKeep.indices) a(j) = a(positionsToKeep(j))
  a.trimEnd(a.length - positionsToKeep.length)
  println(a)
}
