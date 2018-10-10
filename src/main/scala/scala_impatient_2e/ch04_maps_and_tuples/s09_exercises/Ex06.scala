package scala_impatient_2e.ch04_maps_and_tuples.s09_exercises

import java.io.File
import java.util.Scanner

import scala.collection.JavaConverters._

/*Define a linked hash map that maps "Monday" to java.util.Calendar.MONDAY, and similarly for the other weekdays.
Demonstrate that the elements are visited in insertion order.*/
object Ex06 extends App {
  var m = scala.collection.mutable.LinkedHashMap(
    "Monday" -> java.util.Calendar.MONDAY,
    "Tuesday" -> java.util.Calendar.TUESDAY,
    "Wednesday" -> java.util.Calendar.WEDNESDAY,
    "Thursday" -> java.util.Calendar.THURSDAY,
    "Friday" -> java.util.Calendar.FRIDAY,
    "Satuday" -> java.util.Calendar.SATURDAY,
    "Sunday" -> java.util.Calendar.SUNDAY,
  )
  println(m)
}
