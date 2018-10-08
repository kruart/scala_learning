package scala_impatient_2e.ch02_control_structures_and_functions.s12_exceptions

import java.io.IOException
import java.net.{MalformedURLException, URL}

import scala.io.StdIn
import scala.math.sqrt
import scala.util.Try

object Demo extends App {
  // Unlike Java, Scala has no “checked” exceptions—you never have to declare that a function or method might throw an exception.
  // Scala exceptions work the same way as in Java or C++
  def root(x: Double) =
    if (x >= 0) { sqrt(x)
    } else throw new IllegalArgumentException("x should not be negative")

  try {
    println(root(4))
//    println(root(-4))
  } catch {
    case e: Exception => println(e)
  }



  def process(u: URL) {
    if (u.getFile.contains("tiny")) println("OK")
    else throw new MalformedURLException("error!")
  }

  var url = new URL("http://horstmann.com/fred-tiny.gif")
  try {
    process(url)
    url = new URL("http://horstmann.com/fred.gif")
//    process(url)
  } catch {
    case _: MalformedURLException => println(s"Bad URL: $url")
    case e: IOException => e.printStackTrace()
  }

  //Simple example. Try object
  val result =
    for (a <- Try { StdIn.readLine("a: ").toInt };
       b <- Try { StdIn.readLine("b: ").toInt })
    yield a / b

  println(if (result.isSuccess) "Good" else "Bad") //contain either Success object or Failure. More about Try object in 17 Chapter
}
