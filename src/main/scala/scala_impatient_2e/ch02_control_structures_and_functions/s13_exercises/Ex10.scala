package scala_impatient_2e.ch02_control_structures_and_functions.s13_exercises

/**
  * Write a function that computes xn, where n is an integer. Use the following recursive definition:
  *
  * xn = y * y if n is even and positive, where y = xn / 2.
  * • xn = x * xn – 1 if n is odd and positive.
  * • x0 = 1.
  * • xn = 1 / x–n if n is negative.
  * Don’t use a return statement.
  */
object Ex10 extends App {

  // we must define return type when we use recursion
  def compute(x: BigDecimal, n: Int): BigDecimal = {
    if (n == 0) 1
    else if (n < 0) 1 / compute(x, -n)
    else if (n % 2 == 0) {
      val i = compute(x, n / 2)
      i * i
    }
    else x * compute(x, n - 1)
  }
}
