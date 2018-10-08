package scala_impatient_2e.ch02_control_structures_and_functions.s07_functions

object Demo extends App {
  // as long as the function is not recursive, you need not specify the return type
  def abs(x: Double) = if (x >= 0) x else -x

  println(abs(-10))
  println(abs(10))

  // If the body of the function requires more than one expression, use a block
  def fac(n: Int) = {
    var r = 1
    for (i <- 1 to n) r *= i
    r
  }

  println(fac(5)) // 120

  // Without the return type, the Scala compiler couldn’t verify that the type of n * facRecursive(n - 1) is an Int.
  def facRecursive(n: Int): Int = if (n <= 0) 1 else n * facRecursive(n - 1)

  println(facRecursive(5))
}
