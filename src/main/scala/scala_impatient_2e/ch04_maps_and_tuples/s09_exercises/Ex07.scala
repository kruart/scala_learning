package scala_impatient_2e.ch04_maps_and_tuples.s09_exercises

import scala.collection.JavaConverters._

/**
  * Print a table of all Java properties reported by the getProperties method of the java.lang.System class, like this:
  * java.runtime.name | Java(TM) SE Runtime Environment
  * sun.boot.library.path | /home/apps/jdk1.6.0_21/jre/lib/i386
  * java.vm.version | 17.0-b16
  * java.vm.vendor | Sun Microsystems Inc.
  * java.vendor.url | http://java.sun.com/
  * path.separator | :
  * java.vm.name | Java HotSpot(TM) Server VM
  * You need to find the length of the longest key before you can print the table.
*/
object Ex07 extends App {
  val props = System.getProperties.asScala
  var max = props.keys.map(_.length).max
  for ((k, v) <- props) println(("%-" + max +"s | " + v).format(k))
}
