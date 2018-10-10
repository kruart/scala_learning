package scala_impatient_2e.ch05_classes.s09_exercises

/**
  * Improve the Counter class in Section 5.1, “Simple Classes and Parameterless Methods,”
  * so that it doesn’t turn negative at Int.MaxValue.
  */
class Counter (private var value: Int = 0) {

  def increment() {
    if (value == Int.MaxValue) value = 0  //reset the counter
    else value += 1
  }

  def current: Int = value
}

object Ex01 extends App {
  val counter = new Counter(Int.MaxValue)
  println(counter.current)
  counter.increment()
  println(counter.current)
}
