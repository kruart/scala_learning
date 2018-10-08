package scala_impatient_2e.ch02_control_structures_and_functions.s13_exercises

import java.time.LocalDate

/**
  * Define a string interpolator date so that you can define a java.time.LocalDate as date"$year-$month-$day".
  */
object Ex11 extends App {

  implicit class DateInterpolator(val sc: StringContext) extends AnyVal {
    def date(args: Any*): LocalDate = {
      if (args.length != 3) throw new IllegalArgumentException("args length must be equals to 3")
      LocalDate.of(args(0).toString.toInt, args(1).toString.toInt, args(2).toString.toInt)
    }
  }
}
