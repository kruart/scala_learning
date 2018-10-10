package scala_impatient_2e.ch04_maps_and_tuples.s06_interoperating_with_java

import scala.collection.JavaConverters._

object Demo extends App {
  val scores: collection.mutable.Map[String, Int] = new java.util.TreeMap[String, Int].asScala
  scores += ("Bob" -> 3, "Cindy" -> 8, "Alice" -> 10)
  println(scores)

  val props: scala.collection.Map[String, String] = System.getProperties().asScala
  println(props)

  import java.awt.font.TextAttribute._
  val attrs = Map(FAMILY -> "Serif", SIZE -> 12) // A Scala map
  val font = new java.awt.Font(attrs.asJava)  // Expects a Java map
  println(font)
}
