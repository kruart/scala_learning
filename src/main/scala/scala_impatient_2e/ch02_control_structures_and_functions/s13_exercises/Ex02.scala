package scala_impatient_2e.ch02_control_structures_and_functions.s13_exercises

/**
  * What is the value of an empty block expression {}? What is its type?
  */
object Ex02 extends App {
  val blankBlock = {}
  println(blankBlock.getClass)  //void
  println(blankBlock.isInstanceOf[Unit])  //true
}
