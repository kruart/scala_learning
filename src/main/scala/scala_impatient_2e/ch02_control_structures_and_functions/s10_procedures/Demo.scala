package scala_impatient_2e.ch02_control_structures_and_functions.s10_procedures

object Demo extends App {
  /*
  Scala has a special notation for a function that returns no value. If the function body is enclosed in braces
  without a preceding = symbol, then the return type is Unit. Such a function is called a procedure.
  A procedure returns no value, and you only call it for its side effect.
  Since the procedure doesn't return any value, we omit the = symbol */
  def box(s : String) { // Look carefully: no =
    val border = "-" * (s.length + 2)
    print(f"$border%n|$s|%n$border%n")
  }

  box("Freddie")

//  Example above semantically equivalent (and gets actually translated) to:
def box2(s : String): Unit = {
  val border = "-" * (s.length + 2)
  print(f"$border%n|$s|%n$border%n")
}

  box2("Freddie")
}
