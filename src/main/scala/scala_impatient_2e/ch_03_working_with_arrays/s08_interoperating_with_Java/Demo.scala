package scala_impatient_2e.ch_03_working_with_arrays.s08_interoperating_with_Java

import scala.collection.Searching._
import scala.collection.JavaConverters._
import scala.collection.mutable
import scala.collection.mutable.{ArrayBuffer, Buffer}

object Demo extends App {
  val a = Array("Mary", "a", "had", "lamb", "little")
//  java.util.Arrays.binarySearch(a, "beef") // Does not work
  java.util.Arrays.binarySearch(a.asInstanceOf[Array[Object]], "beef") // Ok

  // how do binarySearch in Scala
  val result = a.search("beef")

  val command = ArrayBuffer("ls", "-al", "/home/")
  val pb = new ProcessBuilder(command.asJava) // Scala to Java
  val cmd : mutable.Buffer[String] = pb.command().asScala // Java to Scala
  cmd == command
}
