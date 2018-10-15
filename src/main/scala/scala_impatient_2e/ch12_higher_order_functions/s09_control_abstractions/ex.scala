package scala_impatient_2e.ch12_higher_order_functions.s09_control_abstractions

object ex extends App {
  def runInThread(block: => Unit) {
    new Thread {
      override def run() { block }
    }.start()
  }

  runInThread { println("Hi"); Thread.sleep(5000); println("Bye") }

  //define an until statement that works like while
  def until(condition: => Boolean)(block: => Unit) {
    if (!condition) {
      block
      until(condition)(block)
    }
  }

  var x = 10
  until (x == 0) {
    x -= 1
    println(x)
  }
}
