package devInsideYou.YFPL.v12_closures_and_function_currying

object Main {
  def main(args: Array[String]): Unit = {
    println("*" * 50)
    code(args)
    println("*" * 50)
  }

   def closedTerm1(y: Int): Int => Int = x => x + y

   def closedTerm2(y: Int): Int => Int = {

     def openTerm(x: Int): Int = x + y

     openTerm

   }

  def closedTerm3(y: Int)(x: Int): Int = x + y

  def code(args: Array[String]) : Unit = {
    println(closedTerm1(2)(5))
    println(closedTerm2(2)(5))
    println(closedTerm3(2)(5))
  }
}
