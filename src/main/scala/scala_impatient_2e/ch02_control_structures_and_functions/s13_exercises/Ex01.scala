package scala_impatient_2e.ch02_control_structures_and_functions.s13_exercises

/**
  * The signum of a number is 1 if the number is positive, –1 if it is negative, and 0 if it is zero.
  * Write a function that computes this value.
  */
object Ex01 extends App {
  def signum(num: Int) = {
    if (num > 0) 1
    else if (num == 0) 0
    else -1
  }

  println(signum(10))
  println(signum(0))
  println(signum(-10))
}
