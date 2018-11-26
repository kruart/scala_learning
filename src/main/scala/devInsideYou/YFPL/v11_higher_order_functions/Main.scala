package devInsideYou.YFPL.v11_higher_order_functions

import scala.annotation.tailrec

object Main {
  def main(args: Array[String]): Unit = {
    println("*" * 50)
    code(args)
    println("*" * 50)
  }

  def code(args: Array[String]) : Unit = {
    def showRange(functionName: String, args: Range, function: Int => Int): Unit =
      args.foreach {arg =>
        show(functionName, arg, function)
      }

    def show(functionName: String, arg: Int, function: Int => Int): Unit =
      println(higherOrderRendered(functionName, arg, function))

    def lowerOrderRendered(functionName: String, arg: Int, result: Int): String =
      s"Function: $functionName\tArgument: $arg\tResult: $result"

    def higherOrderRendered(functionName: String, arg: Int, function: Int => Int): String =
      lowerOrderRendered(functionName, arg, function(arg))

    show("+ 5", 10, input => input + 5)
    show("/ 2", 20, input => input / 2)
    // the same
    show("+ 5", 10, _ + 5)
    show("/ 2", 20, _ / 2)
    show("* 3", 9, _ * 3)

    //    val mod: Int => Int = _ % 2
    def mod(x: Int): Int = x % 2
    show("mod 2", 9, mod)
    show("mod 2", 10, mod)

    println("-" * 20 + "factorial" + "-" * 20)

    def factorial(n: Int): Int = {
      @tailrec
      def loop(x: Int, acc: Int): Int = {
        if(x == 0) acc
        else loop(x - 1, acc * x)
      }
      loop(n, 1)
    }

    show("factorial", 5, factorial)
    showRange("factorial", 0 to 10, factorial)


    println("-" * 20 + "fibonacci" + "-" * 20)

    def fib(n: Int): Int = {
      @tailrec
      def fib_tail(x: Int, current: Int, next: Int): Int = {
        if(x == 0) current
        else fib_tail(x - 1, next, current + next)
      }
      fib_tail(n, 0, 1)
    }

    show("fibonacci", 10, fib)
    showRange("fibonacci", 0 to 10, fib)
  }

  def code2(args: Array[String]) : Unit = {
    println("*" * 20 + "code2 method" + "*" * 20)
  }
}
