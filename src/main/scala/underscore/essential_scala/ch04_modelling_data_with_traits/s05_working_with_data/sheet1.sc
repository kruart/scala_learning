sealed trait A {
  def foo: String = "It's A!"
}
final case class B() extends A {
  override def foo: String = "It's B!"
}
final case class C() extends A {
  override def foo: String = "It's C!"
}

val anA: A = B() // anA: A = B()
anA.foo // res0: String = It's B!

val anA2: A = C() // anA: A = C()
anA2.foo  // res1: String = It's C!



sealed trait Food
case object Antelope extends Food
case object TigerFood extends Food
case object Licorice extends Food
final case class CatFood(food: String) extends Food

sealed trait Feline {
  def dinner: Food =
    this match {
      case Lion() => Antelope
      case Tiger() => TigerFood
      case Panther() => Licorice
      case Cat(favouriteFood) => CatFood(favouriteFood)
    }
}
final case class Lion() extends Feline {}
final case class Tiger() extends Feline {}
final case class Panther() extends Feline {}
final case class Cat(favouriteFood: String) extends Feline {}

