//1 Generic List

//2 Working With Generic Types
sealed trait LinkedList[A] {
  def contains(item: A): Boolean =
    this match {
      case Pair(hd, tl) =>
        if(hd == item)
          true
        else
          tl.contains(item)
      case End() => false
    }
}
final case class Pair[A](head: A, tail: LinkedList[A]) extends LinkedList[A]
final case class End[A]() extends LinkedList[A]

val example = Pair(1, Pair(2, Pair(3, End())))
assert(example.contains(3) == true)
assert(example.contains(4) == false)
assert(End().contains(0) == false)




