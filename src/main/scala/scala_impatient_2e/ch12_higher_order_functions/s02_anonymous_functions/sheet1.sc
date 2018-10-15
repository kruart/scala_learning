(x: Double) => 3 * x//anonymous function
val triple = (x: Double) => 3 * x //save function to variable

// it's equals to
def triple(x: Double) = 3 * x

Array(3.14, 1.42, 2.0).map((x: Double) => 3 * x)
//you can use braces instead of parentheses
Array(3.14, 1.42, 2.0).map{ (x: Double) => 3 * x }
// infix notation(without the dot)
Array(3.14, 1.42, 2.0) map { (x: Double) => 3 * x }

