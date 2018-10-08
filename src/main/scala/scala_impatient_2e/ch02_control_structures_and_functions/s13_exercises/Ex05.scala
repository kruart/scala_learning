package scala_impatient_2e.ch02_control_structures_and_functions.s13_exercises

/**
  * Write a procedure countdown(n: Int) that prints the numbers from n to 0
  */
object Ex05 extends App {
  def countdown(n: Int): Unit = {
    for (i <- n to (0, -1)) print(i + " ")
  }
}
