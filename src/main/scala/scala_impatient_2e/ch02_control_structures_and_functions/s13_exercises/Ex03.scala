package scala_impatient_2e.ch02_control_structures_and_functions.s13_exercises

/**
  * Come up with one situation where the assignment x = y = 1 is valid in Scala.
  * (Hint: Pick a suitable type for x.)
  */
object Ex03 extends App {
  var y = 1           //> y  : Int = 0
  val x: Unit = y = 1 //> x  : Unit = ()
}
