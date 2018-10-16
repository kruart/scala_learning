val minOrdering = Ordering.fromLessThan[Int](_ < _)
val maxOrdering = Ordering.fromLessThan[Int](_ > _)

List(3, 4, 2).sorted(minOrdering) //List(2, 3, 4)
List(3, 4, 2).sorted(maxOrdering) //List(4, 3, 2)