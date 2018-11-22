package devInsideYou.YFPL.v03_exploring_is_the_new_learning

import scala.util.Random

object Main {
  def main(args: Array[String]): Unit = {
    println("=============")

    {
      val num1 = {
        println("just print somithing")
        Random.nextInt()
      }
      println(s"First time: $num1")
      println(s"Second time: $num1")

      println("*****************")
      def num2 = {
        println("just print somithing")
        Random.nextInt()
      }
      println(s"First time: $num2")
      println(s"Second time: $num2")

      println("*****************")
      lazy val num3 = {   //never call. To call num3 uncomment println lines below
        println("just print somithing")
        Random.nextInt()
      }
//      println(s"First time: $num2")
//      println(s"Second time: $num2")
    }

    println("=============")
  }
}
// val is an immutable value (stored in memory)
// def is a definition (only the computation is stored)
// lazy val (behaves the first time like a def and like a val afterwards
// var is mutable variable (stored in memory)
