package scala_impatient_2e.ch10_traits.s06_overriding_abstract_methods_in_traits

trait Logger {
  def log(msg: String) // This method is abstract
}

trait TimestampLogger extends Logger {
  abstract override def log(msg: String) { // Overrides an abstract method
    super.log(s"${java.time.Instant.now()} $msg") // Is super.log defined?
  }
}
