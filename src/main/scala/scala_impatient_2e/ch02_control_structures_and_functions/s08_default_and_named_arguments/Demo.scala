package scala_impatient_2e.ch02_control_structures_and_functions.s08_default_and_named_arguments

object Demo extends App {
  def decorate(str: String, left: String = "[", right: String = "]") = left + str + right

  println(decorate("Hello"))  // [Hello]
  println(decorate("Hello", "{{", "}}")) // {{Hello}}
  println(decorate("Hello", ">>>["))  // >>>[Hello]

  //Named arguments can make a function call more readable
  // Note that the named arguments need not be in the same order as the parameters
  println(decorate(left = "{{", str = "Hello", right = "}}"))

  //You can mix unnamed and named arguments, provided the unnamed ones come first
  println(decorate("Hello", right = "]<<<"))
}
