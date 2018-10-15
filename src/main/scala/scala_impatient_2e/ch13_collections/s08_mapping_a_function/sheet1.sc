import scala.collection.mutable.ArrayBuffer

val names = List("Peter", "Paul", "Mary")
names.map(_.toUpperCase())

val buffer = ArrayBuffer("Peter", "Paul", "Mary")
buffer.transform(_.toUpperCase())
buffer

names.foreach(println)

"-3+4".collect({case '+' => 1; case '-' => -1})
