package scala_impatient_2e.ch02_control_structures_and_functions.s13_exercises

/**
  * Make the function of the preceding exercise a recursive function.
  */
object Ex09 extends App {

  // we must define return type when we use recursion
  def product(s: String): BigInt = {
    if (s.length == 0) 1
    else s.head * product(s.tail)
  }

  println(product("Hello")) // 9415087488
}
