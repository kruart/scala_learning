var n = 3
var r = 2

while (n > 0) {
  r *= n
  n -= 1
}

// for loop execution with a range
for( a <- 1 to 3) {
  println( "Value of a: " + a )
}

val s = "Hello"
var sum = 0
for (i <- 0 to s.length - 1) sum += s(i)
//  for (i <- 0 until s.length) sum += s(i) //the same
sum

sum = 0
for (ch <- "Hello") sum += ch
sum


import scala.util.control.Breaks._

//equals break in java
breakable {
  for (ch <- "Hello World") {
    if (ch == ' ') break; // Exits the breakable block Breaks.break()
    print(ch)
  }
}

//equals continue in java
for (ch <- "Hello World") {
  breakable {
    if (ch == ' ') break; // Exits the breakable block Breaks.break()
    print(ch)
  }
}