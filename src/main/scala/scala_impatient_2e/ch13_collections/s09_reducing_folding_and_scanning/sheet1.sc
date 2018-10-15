List(1, 7, 2, 9).reduceLeft(_ - _) //-17
List(1, 7, 2, 9).reduceRight(_ - _) //-13

List(1, 7, 2, 9).foldLeft(0)(_ - _)   //-19
List(1, 7, 2, 9).foldRight(0)(_ - _)  //-13

val freq = scala.collection.mutable.Map[Char, Int]()
for (c <- "Mississippi") freq(c) = freq.getOrElse(c, 0) + 1
freq
