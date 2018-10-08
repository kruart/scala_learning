package scala_impatient_2e.ch02_control_structures_and_functions.s13_exercises

/**
  * Write a Scala equivalent for the Java loop for (int i = 10; i >= 0; i--) System.out.println(i);
  */
object Ex04 extends App {
  for (i <- 10 to 1 by -1) println(i)       //way 1
  for (i <- 10 to (1, -1)) println(i)       //way 2
  for (i <- (1 to 10).reverse) println(i)   //way 3
}
