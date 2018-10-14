package scala_impatient_2e.ch09_files_and_regEx.s03_reading_tokens_and_numbers

import scala.io.StdIn

object test extends App {
  println("What is your name and age")
  val data = StdIn.readLine().split(" ")

  println(data(0))
  println(data(1))
}
