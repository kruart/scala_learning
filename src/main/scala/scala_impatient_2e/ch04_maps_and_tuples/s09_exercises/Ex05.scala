package scala_impatient_2e.ch04_maps_and_tuples.s09_exercises

import java.io.File
import java.util.Scanner

import scala.collection.JavaConverters._

/*Repeat the preceding exercise with a java.util.TreeMap that you adapt to the Scala API.*/
object Ex05 extends App {
  val file = new File(getClass.getClassLoader.getResource("testfile.txt").getPath)
  var m: scala.collection.mutable.Map[String, Int] = new java.util.TreeMap[String, Int].asScala
  val scan = new Scanner(file)

  while (scan.hasNext()) {
    val word = scan.next()
    m += (word -> (m.getOrElse(word, 0) + 1))
  }
  scan.close()

  println(m)
}
