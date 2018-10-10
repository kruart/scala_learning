package scala_impatient_2e.ch05_classes.s09_exercises

/**
  * Write a class Time with read-only properties hours and minutes
  * and a method before(other: Time): Boolean that checks whether this time comes before the other.
  * A Time object should be constructed as new Time(hrs, min), where hrs is in military time format (between 0 and 23).
  */
class Time (private var hours: Int, private var minutes: Int) {
  def before(other: Time): Boolean = {
    if (hours > other.hours || (hours == other.hours && minutes >= other.minutes)) false
    else true
  }
}

object Ex03 extends App {
  val time = new Time(17, 45)
  println(time.before(new Time(16, 44)))  //false
  println(time.before(new Time(17, 44)))  //false
  println(time.before(new Time(17, 45)))  //false
  println(time.before(new Time(17, 46)))  //true
  println(time.before(new Time(18, 45)))  //true
}
