package scala_impatient_2e.ch05_classes.s09_exercises

/**
  * Reimplement the Time class from the preceding exercise
  * so that the internal representation is the number of minutes since midnight (between 0 and 24 × 60 – 1).
  * Do not change the public interface. That is, client code should be unaffected by your change.
  */
class Time1 (private var hours: Int, private var minutes: Int) {
  val minutesSinceMidnight: Int = hours * 60 + minutes

  def before(other: Time1): Boolean = {
    other.minutesSinceMidnight > this.minutesSinceMidnight
  }
}

object Ex04 extends App {
  val time = new Time1(17, 45)
  println(time.before(new Time1(16, 44)))  //false
  println(time.before(new Time1(17, 44)))  //false
  println(time.before(new Time1(17, 45)))  //false
  println(time.before(new Time1(17, 46)))  //true
  println(time.before(new Time1(18, 45)))  //true
}
