import scala.util.Random

var r = 10
var n = 5

if (n > 0) {r *= n; n -= 1}

val s, s0, v, v0, t: Int = Random.nextInt(100)

val result = s0 + (v - v0) * t +
0.5 * (v - v0) * t * t

if (n > 0) {
  r = r * n
  n -= 1
}