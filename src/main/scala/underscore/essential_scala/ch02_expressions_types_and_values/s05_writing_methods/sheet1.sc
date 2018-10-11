object calc {
  def square(x: Double) = x*x
  def cube(x: Double) = x*square(x)
}

calc.square(2.0) == 4.0
calc.square(3.0) == 9.0
calc.square(-2.0) == 4.0

