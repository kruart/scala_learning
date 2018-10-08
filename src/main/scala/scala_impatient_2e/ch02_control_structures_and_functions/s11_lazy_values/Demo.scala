package scala_impatient_2e.ch02_control_structures_and_functions.s11_lazy_values

object Demo extends App {
  //When a val is declared as lazy, its initialization is deferred until it is accessed for the first time
  //If the program never accesses words, the file is never opened
  lazy val words = scala.io.Source.fromFile("/usr/share/dict/words").mkString // Evaluated the first time words is used

  val words1 = scala.io.Source.fromFile("/usr/share/dict/words").mkString   // Evaluated as soon as words1 is defined
  def words2 = scala.io.Source.fromFile("/usr/share/dict/words").mkString // Evaluated every time words2 is used
}
