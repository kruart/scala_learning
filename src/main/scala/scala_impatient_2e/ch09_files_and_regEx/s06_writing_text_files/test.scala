package scala_impatient_2e.ch09_files_and_regEx.s06_writing_text_files

import java.io.{File, PrintWriter}

object test extends App {
  val file = new File("src/main/resources/testFileToWrite.txt")
  val out = new PrintWriter(file)
  for (ch <- 'a' to 'z') out.print(ch)
  out.close()
}
