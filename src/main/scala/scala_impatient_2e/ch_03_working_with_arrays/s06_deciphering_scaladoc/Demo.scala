package scala_impatient_2e.ch_03_working_with_arrays.s06_deciphering_scaladoc

import java.util.{Calendar, GregorianCalendar}

import scala.collection.mutable.ArrayBuffer

object Demo extends App {

  val a = Array(1, -2, 3, -4, 5)
  val b = ArrayBuffer(1, 7, 2, 9)

  println(a.count(_ > 0))

  b.append(1, 7, 2, 9)
  b.appendAll(a)
  println(b)

  b += 4 -= 7
  println(b)

  b.copyToArray(a)

  val xs = Array(1, "Fred", 2, 9)
  b.copyToArray(xs)

  ArrayBuffer("Mary", "had", "a", "little", "lamb").max

  ArrayBuffer(new GregorianCalendar(2012, 0, 1),
              new GregorianCalendar(1999, 11, 31)).max[Calendar]
  // Calendar implements Comparable[Calendar]

  b.padTo(20, -1)

  (1 to 10).padTo(20, -1) // Note that the result is a Vector, not a Range
}
