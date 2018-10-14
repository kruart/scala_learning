package scala_impatient_2e.ch09_files_and_regEx.s09_process_control
import scala.sys.process._
object test {
  def main(args: Array[String]): Unit = {
    println(System.getProperty("user.dir"))
    println("pwd".!!)
    println("ls -al".!)
  }
}
