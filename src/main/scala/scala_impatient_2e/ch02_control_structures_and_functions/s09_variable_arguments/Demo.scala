package scala_impatient_2e.ch02_control_structures_and_functions.s09_variable_arguments

object Demo extends App {
  //  varargs in Scala Int*
  def sum(args: Int*) = {
    var result = 0
    for (arg <- args) result += arg
    result
  }

  //You can call sum() function with as many arguments as you like
  println(sum(5, 5))
  println(sum(3, 3, 3))

  //  val s = sum(1 to 5) // Error, pass Range obj
  val s2 = sum(1 to 5: _*)  // Consider 1 to 5 as an argument sequence
  println(s2)

  // This call syntax is needed in a recursive definition
  def recursiveSum(args: Int*) : Int = {
    if (args.length == 0) 0
    else args.head + recursiveSum(args.tail : _*)
  }

  println(recursiveSum(1, 2, 3, 4, 5))


  import java.text.MessageFormat

  // When you call a Java method with variable arguments of type Object,
  // such as PrintStream.printf or MessageFormat.format, you need to convert any primitive types by hand
  val str = MessageFormat.format("The answer to {0} is {1}",
    "everything", 42.asInstanceOf[AnyRef])
  println(str)
}
