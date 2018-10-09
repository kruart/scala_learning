package scala_impatient_2e.ch_03_working_with_arrays.s09_exercises

/** Write a loop that swaps adjacent elements of an array of integers.
    For example, Array(1, 2, 3, 4, 5) becomes Array(2, 1, 4, 3, 5). */
object Ex02 extends App {
  val nums1 = Array(1, 2, 3, 4, 5)
  val nums2 = Array(1, 2, 3, 4)

  def swapAdjacentElements(arr: Array[Int]): Unit = {
    for (i <- 1 until arr.length by 2) {
      val temp = arr(i)
      arr(i) = arr(i - 1)
      arr(i - 1) = temp
    }
    println(arr.mkString(" "))
  }

  swapAdjacentElements(nums1) // 2 1 4 3 5
  swapAdjacentElements(nums2) // 2 1 4 3
}