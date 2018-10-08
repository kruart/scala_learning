package scala_impatient_2e.ch02_control_structures_and_functions.s13_exercises

/**
  * Solve the preceding exercise without writing a loop. (Hint: Look at the StringOps Scaladoc.)
  */
object Ex07 extends App {
  println("Hello".map(BigInt(_)).product)  // 9415087488
}
