import java.io.File

import scala.io.Source

val file = new File(getClass.getClassLoader.getResource("testfile.txt").getPath)
var source = Source.fromFile(file, "UTF-8")

val iter = source.buffered
while(iter.hasNext) {
  print(iter.head + "-")
  iter.next
}

source.close()