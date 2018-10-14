package scala_impatient_2e.ch08_inheritance.s10_construction_order_and_early_definitions

class Creature {
  val range: Int = 10
  val env: Array[Int] = new Array[Int](range)
}

class Ant extends Creature {
  override val range = 2
}

/*The “early definition” syntax lets you initialize val fields of a subclass
  before the superclass is executed. The syntax is so ugly that only a mother could love it.
  You place the val fields in a block after the extends keyword, like this*/
class Bug extends {
  override val range = 3
} with Creature

class Cow extends Creature {
  override val range = 4
}

object Main extends App {
  val a = new Ant
  println(a.range)      //2
  println(a.env.length) //0 - unexpectedly

  val b = new Bug
  println(b.range)      //3
  println(b.env.length) //3
}
