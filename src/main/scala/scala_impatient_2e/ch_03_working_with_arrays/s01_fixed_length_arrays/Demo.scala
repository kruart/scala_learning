package scala_impatient_2e.ch_03_working_with_arrays.s01_fixed_length_arrays

object Demo extends App {
  //fixed-length Arrays
  val nums = new Array[Int](10) // Inside the JVM, a Scala Array is implemented as a Java array.
  val s = new Array[String](10) // A string array with ten elements, all initialized with null

  val s1 = Array("Hello", "World") // length 2
  s1(0) = "Goodbye"

  println(s1.mkString(" "))
}
