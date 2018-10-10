package scala_impatient_2e.ch04_maps_and_tuples.s09_exercises

import java.io.File
import java.util.Scanner

import scala.collection.SortedMap

/*Repeat the preceding exercise with a sorted map, so that the words are printed in sorted order.*/
object Ex04 extends App {
  val file = new File(getClass.getClassLoader.getResource("testfile.txt").getPath)
  var m = SortedMap[String, Int]()
  val scan = new Scanner(file)

  while (scan.hasNext()) {
    val word = scan.next()
    m += (word -> (m.getOrElse(word, 0) + 1))
  }
  scan.close()

  println(m)
}
