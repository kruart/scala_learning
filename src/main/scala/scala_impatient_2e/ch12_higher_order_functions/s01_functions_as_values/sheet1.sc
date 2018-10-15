import scala.math.ceil

val num = 3.14
val fun = ceil _  //(Double) => Double
fun(num)    //4.0

Array(3.14, 1.42, 2.0).map(fun) //Array(4.0, 2.0, 2.0)