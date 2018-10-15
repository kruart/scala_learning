sealed trait IntList
case object End extends IntList
final case class Pair(head: Int, tail: IntList) extends IntList

Pair(1, Pair(2, Pair(3, End)))

def sum(list: IntList): Int = {
  list match {
    case End => 0
    case Pair(hd, tl) => hd + sum(tl)
  }
}
