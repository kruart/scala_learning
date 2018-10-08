package scala_impatient_2e.ch02_control_structures_and_functions.s13_exercises

/**
  * Write a for loop for computing the product of the Unicode codes of all letters in a string.
  * For example, the product of the characters in "Hello" is 9415087488L.
  */
object Ex06 extends App {
  var total: BigInt = 1
  for (c <- "Hello") total *= c.toInt
  println(total)  // 9415087488
}
