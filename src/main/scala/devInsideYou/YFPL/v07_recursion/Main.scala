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
      println("-" * 20 + "factorial" + "-" * 20)

      def factorial(n: Int): Int = {
        @tailrec
        def loop(x: Int, acc: Int): Int = {
          if(x == 0) acc
          else loop(x - 1, acc * x)
        }
        loop(n, 1)
      }

      println(s"0! ${factorial(0)}")
      println(s"1! ${factorial(1)}")
      println(s"2! ${factorial(2)}")
      println(s"3! ${factorial(3)}")
      println(s"4! ${factorial(4)}")
      println(s"5! ${factorial(5)}")
      println("-" * 20 + "fibonacci" + "-" * 20)

      def fib(n: Int): Int = {
        @tailrec
        def fib_tail(x: Int, current: Int, next: Int): Int = {
          if(x == 0) current
          else fib_tail(x - 1, next, current + next)
        }
        fib_tail(n, 0, 1)
      }

      println(s"fib(5) ${fib(50)}")
    }


    println("*" * 50)
  }
}
