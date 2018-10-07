package scala_impatient_2e.ch02_control_structures_and_functions.s04_input_and_output

import scala.io.StdIn

object Demo extends App {
  print("Answer: ")
  println(42)

  println("Answer: " + 42)  //the same

  val name = "Freddie"
  val age = 25
  printf("Hello, %s! You are %d years old.\n", name, age)

  //or use string interpolation
  println(f"Hello, $name! You are ${age + 0.5}%7.2f years old.")


  val name1 = StdIn.readLine("Your name: ")

  print("Your age: ")
  val age1 = StdIn.readInt()

  println(s"Hello, ${name1}! Next year, you will be ${age1 + 1}.")
}
