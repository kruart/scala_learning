package scala_impatient_2e.ch10_traits.s02_traits_as_interfaces

trait Logger {
  def log(msg: String)  //an abstract method
}

class ConsoleLogger extends Logger {
  def log(msg: String)  = println(msg)
}

//If you need more than one trait, add the others using the with keyword
class ConsoleLogger2 extends Logger with Cloneable with Serializable {
  override def log(msg: String): Unit = println(msg)
}
