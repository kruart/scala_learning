import java.util.Date

trait Visitor {
  def id: String      // Unique id assigned to each user
  def createdAt: Date // Date this user first visited the site

  // How long has this visitor been around?
  def age: Long = new Date().getTime - createdAt.getTime

  def older(v1: Visitor, v2: Visitor): Boolean =
    v1.createdAt.before(v2.createdAt)
}

case class Anonymous(id: String, createdAt: Date = new Date()) extends Visitor
case class User(id: String, email: String, createdAt: Date = new Date()) extends Visitor


//exercises
//1 Cats, and More Cats
trait Feline {
  def colour: String
  def sound: String = "roar"
}

trait BigCat extends Feline {
  override val sound = "roar"
}

case class Cat(colour: String) extends Feline {
  override val sound = "meow"
}
case class Lion(colour: String, maneSize: Int) extends BigCat {}
case class Tiger(colour: String) extends BigCat {}
case class Panther(colour: String) extends BigCat {}

//2 Shaping Up With Traits
trait Shape {
  def sides: Int
  def perimeter: Double
  def area: Double
}

case class Circle(radius: Double) extends Shape {
  val sides = 1
  val perimeter = 2 * math.Pi * radius
  val area = math.Pi * radius * radius
}
case class Rectangle(width: Double, height: Double) extends Shape {
  val sides = 4
  val perimeter = 2 * width + 2 * width
  val area = width * height
}
case class Square(size: Double) extends Shape {
  val sides = 4
  val perimeter = 4 * size
  val area = size * size
}

// 3 Shaping Up 2 (Da Streets)
sealed trait Rectangular extends Shape {
  def width: Double
  def height: Double
  val sides = 4
  override val perimeter = 2*width + 2*height
  override val area = width*height
}

case class Square2(size: Double) extends Rectangular {
  val width = size
  val height = size
}

case class Rectangle2(val width: Double, val height: Double) extends Rectangular