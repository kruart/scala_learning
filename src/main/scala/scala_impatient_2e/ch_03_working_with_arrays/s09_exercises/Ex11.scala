package scala_impatient_2e.ch_03_working_with_arrays.s09_exercises

import java.awt.datatransfer.SystemFlavorMap
import java.awt.datatransfer._

import scala.collection.JavaConverters._
import scala.collection.mutable

/** Import java.awt.datatransfer._ and make an object of type SystemFlavorMap with the call
  * val flavors = SystemFlavorMap.getDefaultFlavorMap().asInstanceOf[SystemFlavorMap]
  * Then call the getNativesForFlavor method with parameter DataFlavor.imageFlavor
  * and get the return value as a Scala buffer.
  * (Why this obscure class? It’s hard to find uses of java.util.List in the standard Java library.)*/
object Ex11 extends App {
  val flavorMap: SystemFlavorMap = SystemFlavorMap.getDefaultFlavorMap.asInstanceOf[SystemFlavorMap]
  private val scalaFlavorMap: mutable.Buffer[String] = flavorMap.getNativesForFlavor(DataFlavor.imageFlavor).asScala
  println(scalaFlavorMap)
}