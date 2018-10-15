val digits = List(4, 5, 2)
digits.head   //4
digits.tail   //5, 2

//head :: tail
9 :: List(4, 2) //(9, 4, 2)
//equals to
9 :: 4 :: 2 :: Nil
9::(4::(2::(Nil)))

//recursive sum
def sum(lst: List[Int]): Int =
  if (lst == Nil) 0 else lst.head + sum(lst.tail)

def sumCase(lst: List[Int]): Int = lst match {
  case Nil => 0
  case h :: t => h + sum(t) // h - lst.head, t - lst.taii
}

List(9, 4, 2).sum
