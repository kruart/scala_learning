package scala_impatient_2e.ch03_working_with_arrays.s09_exercises

/** Repeat the preceding assignment, but produce a new array with the swapped values. Use for/yield. */
object Ex03 extends App {
  val nums1 = Array(1, 2, 3, 4, 5)
  val nums2 = Array(1, 2, 3, 4)

  def swapAdjacentElements(arr: Array[Int]): Unit = {
    val result = for (i <- arr.indices) yield {
      if (i % 2 == 1) arr(i-1)
      else if (i == arr.length-1) arr(i)
      else arr(i+1)
    }
    println(result.mkString(" "))
  }

  swapAdjacentElements(nums1) // 2 1 4 3 5
  swapAdjacentElements(nums2) // 2 1 4 3
}