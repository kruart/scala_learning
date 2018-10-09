package scala_impatient_2e.ch_03_working_with_arrays.s03_traversing_arrays_and_array_buffer

object Demo extends App {
  val a = Array(1, 1, 2, 3, 5, 8, 13, 21, 34, 55)

  for (i <- 0 until a.length) println(s"$i: ${a(i)}")
  for (i <- a.indices) println(s"$i: ${a(i)}")    //the same

  ////To visit every second element
  for (i <- 0 until a.length by 2) println(s"$i: ${a(i)}")
  for (i <- a.indices by 2) println(s"$i: ${a(i)}") //the same

  //To visit the elements starting from the end of the array
  for (i <- (0 until a.length).reverse) println(s"$i: ${a(i)}")
  for (i <- a.indices.reverse) println(s"$i: ${a(i)}")  //the same

  //If you don’t need the array index in the loop body, visit the array elements directly:
  for (elem <- a) println(elem) //This is similar to the “enhanced” for loop in Java
}
