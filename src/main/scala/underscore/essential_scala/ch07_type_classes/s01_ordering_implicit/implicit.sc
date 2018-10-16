implicit val ordering = Ordering.fromLessThan[Int](_ < _)

//instead of
List(3, 4, 2).sorted(ordering) //List(2, 3, 4)
//we can do like this
List(2, 4, 3).sorted  //List(2, 3, 4)
List(1, 7, 5).sorted  //List(1, 5, 7)

////We do this by annotating a value with implicit, as in the declaration implicit val ordering
//The method must also indicate that it accepts implicit values.
//sorted method signature
//def sorted[B >: A](implicit ord: Ordering[B]): Repr = {..}



