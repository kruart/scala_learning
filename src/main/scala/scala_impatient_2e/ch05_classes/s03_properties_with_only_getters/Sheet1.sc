class Message {
  //read-only property with a getter but no setter
  val timeStamp = new java.util.Date
}

val msg = new Message
msg.timeStamp

//By Scala convention we drop the parentheses for methods that have no side effects and keep them when there are side effects.
// In other words, accessor with (), mutator without ()
class Counter {
  private var value = 0
  def increment() { value += 1 }
  def current = value // No () in declaration
}

val myCounter = new Counter
myCounter.increment()
myCounter.current // Calling myCounter.current() is a syntax error
