package scala_impatient_2e.ch04_maps_and_tuples.s09_exercises

import java.io.File
import java.util.Scanner

/*Write a program that reads words from a file.
Use a mutable map to count how often each word appears.
 */
object Ex02 extends App {
  val file = new File(getClass.getClassLoader.getResource("testfile.txt").getPath)
  val m = scala.collection.mutable.Map[String, Int]().withDefaultValue(0)
  val scan = new Scanner(file)

  while (scan.hasNext()) {
    val word = scan.next()
    m.update(word, m(word) + 1)
  }
  scan.close()

  println(m)
}
