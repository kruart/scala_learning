// 1. Write an object Conversions with methods inchesToCentimeters, gallonsToLiters, and milesToKilometers.
object Conversions {
  def inchesToCentimeters(inches: Double): Double =  inches * 2.54
  def gallonsToLiters(gallons: Double): Double = gallons * 3.78541178
  def milesToKilometers(miles: Double): Double = miles * 1.609344
}

/*2. The preceding problem wasn’t very object-oriented. Provide a general superclass UnitConversion and
 define objects InchesToCentimeters, GallonsToLiters, and MilesToKilometers that extend it. */
abstract class UnitConversion {
  def convert(value: Double): Double
}

object InchesToCentimeters extends UnitConversion {
  override def convert(value: Double): Double = value * 2.54
}

object GallonsToLiters extends UnitConversion {
  override def convert(value: Double): Double = value * 3.78541178
}

object MilesToKilometers extends UnitConversion {
  override def convert(value: Double): Double = value * 1.609344
}

// 3. Define an Origin object that extends java.awt.Point. Why is this not actually a good idea? (Have a close look at the methods of the Point class.)
object Origin extends java.awt.Point {}

// 4. Define a Point class with a companion object so that you can construct Point instances as Point(3, 4), without using new.
class Point(val x: String, val y: String)
object Point {
  def apply(x: String, y: String): Point = new Point(x, y)
}

/* 5. Write a Scala application, using the App trait, that prints its command-line arguments in reverse order, separated by spaces.
For example, scala Reverse Hello World should print World Hello.*/
object Reverse extends App {
  args.reverse.foreach(arg => print(s"$arg "))
}

//6. Write an enumeration describing the four playing card suits so that the toString method returns ♣, ♦, ♥, or ♠.
object Cards extends Enumeration {
  type Cards = Value
  val Club = Value("♣")
  val Diamond = Value("♦")
  val Heart = Value("♥")
  val Spade = Value("♠")
}

//7. Implement a function that checks whether a card suit value from the preceding exercise is red.
import Cards._
def isRed(card: Cards): Boolean = {
  card == Diamond || card == Heart
}

//8. Write an enumeration describing the eight corners of the RGB color cube. As IDs, use the color values (for example, 0xff0000 for Red).
object RGBColorCube extends Enumeration {
  val Black = Value(0x000000, "Black")      //(0,0,0)
  val Blue = Value(0x0000FF, "Blue")        //(0,0,255)
  val Green = Value(0x00FF00, "Green")      //(0,255,0)
  val Cyan = Value(0x00FFFF, "Cyan")        //(0,255,255)
  val Red = Value(0xFF0000, "Red")          //(255,0,0)
  val Magenta = Value(0xFF00FF, "Magenta")  //(255,0,255)
  val Yellow = Value(0xFFFF00, "Yellow")    //(255,255,0)
  val White = Value(0xFFFFFF, "White")      //(255,255,255)
}



