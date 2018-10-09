package scala_impatient_2e.ch_03_working_with_arrays.s02_arrays_buffer

import scala.collection.mutable.ArrayBuffer

object Demo extends App {
  //The equivalent ArrayList in Scala is the ArrayBuffer
  val b = ArrayBuffer[Int]()
  val b2 = new ArrayBuffer[Int] // If you use new, the () is optional

  //Add elements at the end with +=
  b += 1  //ArrayBuffer(1)
  b += (1, 2, 3, 4, 5) // ArrayBuffer(1, 1, 2, 3, 4, 5)

  println(b.mkString(" "))

  // You can append any collection with the ++= operator
  b ++= ArrayBuffer(8, 13, 21)
  println(b.mkString(" "))

  b.trimEnd(5) //removes the last five elements
  b.insert(2, 6)  // Insert before index 2
  b.insert(2, 7, 8, 9)  // You can insert as many elements as you like
  b.remove(2)
  b.remove(2, 3)  // second param tells how many elements to remove

  val a1 = b.toArray //ArrayBuffer to Array
  val a2 = a1.toBuffer  //Array to ArrayBuffer
}
