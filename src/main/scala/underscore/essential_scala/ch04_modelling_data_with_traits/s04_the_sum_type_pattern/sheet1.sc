//is-a and
trait B
trait C
trait A extends B with C


//has-a or
//first way
//trait A {
//  def d: D
//}
//sealed trait D
//final case class B() extends D
//final case class C() extends D

//or second way
//sealed trait A
//final case class D(b: B) extends A
//final case class E(c: C) extends A

//exercises
//1 Stop on a Dime
sealed trait TrafficLight
case object Red extends TrafficLight
case object Green extends TrafficLight
case object Yellow extends TrafficLight

//2 Calculator
sealed trait Calculation
final case class Success(result: Int) extends Calculation
final case class Failure(reason: String) extends Calculation

//3 Water, Water, Everywhere
sealed trait Source
case object Well extends Source
case object Spring extends Source
case object Tap extends Source
final case class BottledWater(size: Int, source: Source, carbonated: Boolean)