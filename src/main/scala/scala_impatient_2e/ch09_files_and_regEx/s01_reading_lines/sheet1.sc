import java.io.File
import scala.io.Source

val file = new File(getClass.getClassLoader.getResource("testfile.txt").getPath)
var source = Source.fromFile(file, "UTF-8")

val lineIterator = source.getLines()
for (l <- lineIterator) println(l)

source = Source.fromFile(file, "UTF-8")
val contents= source.mkString

source.close()


