package devInsideYou.YFPL.v07_recursion

import scala.annotation.tailrec

object Main {
  def main(args: Array[String]): Unit = {
    println("*" * 50)

    {
      def method1: String = {
        var count = 1

        @tailrec
        def loop: String = {
          if (count % 5 != 0) {
            println(count)
            count += 1
            loop
          }
          else "Done"
        }
        loop
      }
      println(method1)
      println("-" * 50)

      def method2: String = {
        @tailrec
        def loop(currentIteration: Int): String = {
          if (currentIteration % 5 != 0) {
            println(currentIteration)

            loop(currentIteration + 1)
          }
          else "Done"
        }
        loop(1)
      }

      println(method2)
      println("-" * 50)

      def method3: String = {
        var currentIteration = 1

        def loop: String = {
          while (currentIteration % 5 != 0) {
            println(currentIteration)
            currentIteration += 1
          }
          "Done"
        }
        loop
      }
      println(method3)
    }
    println("*" * 50)
  }
}
