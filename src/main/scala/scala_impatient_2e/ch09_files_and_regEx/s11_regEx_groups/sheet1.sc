val numitemPattern = "([0-9]+) ([a-z]+)".r
for (m <- numitemPattern.findAllMatchIn("99 bottles, 98 bottles")) println(m.group(1))

val numitemPattern(num, item) = "99 bottles"

for (numitemPattern(num, item) <- numitemPattern.findAllIn("99 bottles, 98 bottles")) println(s"$num $item")

