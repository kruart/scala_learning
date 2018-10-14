import scala.io.Source

val source1 = Source.fromURL("http://horstmann.com", "UTF-8")
val lineIterator = source1.getLines()
for (l <- lineIterator) println(l)

val source2 = Source.fromString("Hello, World!")
val source3 = Source.stdin