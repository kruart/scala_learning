package scala_impatient_2e.ch_03_working_with_arrays.s09_exercises

/** Make a collection of all time zones returned by java.util.TimeZone.getAvailableIDs that are in America.
  * Strip off the "America/" prefix and sort the result. */
object Ex10 extends App {
  val timezones: Array[String] = java.util.TimeZone.getAvailableIDs()
  timezones
    .filter(_.startsWith("America/"))
    .map(_.stripPrefix("America/"))
    .sorted
    .foreach(println)
}