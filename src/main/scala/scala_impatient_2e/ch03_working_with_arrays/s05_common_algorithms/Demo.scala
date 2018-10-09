package scala_impatient_2e.ch03_working_with_arrays.s05_common_algorithms

import scala.collection.mutable.ArrayBuffer
import scala.util.Sorting

object Demo extends App {
  Array(1, 7, 2, 9).sum //19
  ArrayBuffer("Marry", "had", "a", "little", "lamb").max  //little

  val b = ArrayBuffer(1, 7, 2, 9)
  val bSorted = ArrayBuffer(1, 7, 2, 9).sorted  //(1, 2, 7, 9)

  // You can also supply a comparison function, but then you should use the sortWith method
  val bDescending = b.sortWith(_ > _)  //(9, 7, 2, 1)

  //You can sort an array, but not an array buffer, in place
  val a = Array(2, 3, 3, 2)
  Sorting.quickSort(a)
  println(a. mkString(" ")) // 2 2 3 3

  a.mkString(" and ") // "1 and 2 and 7 and 9"
  a.mkString("<", ",", ">") // "<1,2,7,9>"

  println(a.toString) //[I@5ebec15
  println(b.toString) //ArrayBuffer(1, 7, 2, 9)
}
