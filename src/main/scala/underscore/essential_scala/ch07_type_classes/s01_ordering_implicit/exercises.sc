//exercises
//1
implicit val absOrdering = Ordering.fromLessThan[Int]{ (x, y) =>
  Math.abs(x) < Math.abs(y)
}
assert(List(-4, -1, 0, 2, 3).sorted == List(0, -1, 2, 3, -4))
assert(List(-4, -3, -2, -1).sorted == List(-1, -2, -3, -4))


//2
final case class Rational(numerator: Int, denominator: Int)

implicit val ordering = Ordering.fromLessThan[Rational]((x, y) =>
  (x.numerator.toDouble / x.denominator.toDouble) <
    (y.numerator.toDouble / y.denominator.toDouble)
)

assert(List(Rational(1, 2), Rational(3, 4), Rational(1, 3)).sorted ==
  List(Rational(1, 3), Rational(1, 2), Rational(3, 4)))