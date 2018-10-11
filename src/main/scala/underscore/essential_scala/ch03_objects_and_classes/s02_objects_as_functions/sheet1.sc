class Adder (amount: Int) {
  def apply(in: Int): Int = in + amount
}

val add3 = new Adder(3)
add3.apply(2)
add3(4)

//exercises
//1. When is a Function not a Function?

