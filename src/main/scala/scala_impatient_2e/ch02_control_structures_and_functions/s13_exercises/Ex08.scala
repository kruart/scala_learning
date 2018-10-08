package scala_impatient_2e.ch02_control_structures_and_functions.s13_exercises

/**
  * Write a function product(s : String) that computes the product, as described in the preceding exercises.
  */
object Ex08 extends App {
  def product(s: String) = {
    var product: BigInt = 1
    for (c <- s) product *= c.toInt
    product
  }

  println(product("Hello")) // 9415087488
}
