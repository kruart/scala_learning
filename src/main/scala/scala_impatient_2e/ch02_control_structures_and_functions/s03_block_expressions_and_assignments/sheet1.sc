import scala.math._

val x0 = 1.0
val y0 = 1.0
var x = 4.0
var y = 5.0

val distance = {
  val dx = x - x0
  val dy = y - y0
  sqrt(dx * dx + dy * dy)
}


var r = 1
var n = 10
n -= 1

{ r = r * n; n -= 1 } // Has value Unit

//  x = y = 1 // No--can't assign Unit to x