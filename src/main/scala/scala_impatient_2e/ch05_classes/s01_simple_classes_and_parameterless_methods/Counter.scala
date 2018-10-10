package scala_impatient_2e.ch05_classes.s01_simple_classes_and_parameterless_methods

class Counter {
  private var value = 0 // You must initialize the field

  def increment() {
    value += 1
  }

  def current(): Int = value
}

object Main {
  def main(args: Array[String]): Unit = {
    val myCounter = new Counter // Or new Counter
    myCounter.increment()
    println(myCounter.current)  //1
  }
}
