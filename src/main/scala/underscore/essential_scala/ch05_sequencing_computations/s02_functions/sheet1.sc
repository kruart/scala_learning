val sayHi = () => "Hi!" // sayHi: () => String = <function0>
sayHi() // res0: String = Hi!

val add1 = (x: Int) => x + 1 // add1: Int => Int = <function1>
add1(10) // res1: Int = 11

val sum = (x: Int, y:Int) => x + y // sum: (Int, Int) => Int = <function2>
sum(10, 20) // res2: Int = 30

sealed trait IntList {
  def fold[A](end: A, f: (Int, A) => A): A =
    this match {
      case End => end
      case Pairr(hd, tl) => f(hd, tl.fold(end, f))
    }
  def length: Int = fold[Int](0, (_, tl) => 1 + tl)
  def product: Int = fold[Int](1, (hd, tl) => hd * tl)
  def sum: Int = fold[Int](0, (hd, tl) => hd + tl)
  def double: IntList = fold[IntList](End, (hd, tl) => Pairr(hd * 2, tl))
}
case object End extends IntList
final case class Pairr(head: Int, tail: IntList) extends IntList
