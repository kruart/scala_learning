package devInsideYou.YFPL.v20_case_classes

final class Human(val name: String, val age: Int, val isMale: Boolean) extends Product {
  def isFemale: Boolean = !isMale

  def copy(name: String = this.name, age: Int = this.age, isMale: Boolean = this.isMale): Human = {
    Human(name, age, isMale)
  }

  //members declared in scala.Any
  override def toString: String = s"Human($name, $age, $isMale)"

  override def equals(other: Any): Boolean = other match {
    case that: Human if that canEqual this =>
    this.name == that.name &&
        this.age == that.age &&
        this.isMale == that.isMale
    case _ => false
  }

  override def hashCode(): Int = {
    41 * (41 * (41 + name.hashCode) + age.hashCode) + isMale.hashCode
  }

  //members declared in scala.Equals
  def canEqual(that: Any): Boolean = that.isInstanceOf[Human]

  //members declared in scala.Product
  override def productArity: Int = 3
  override def productElement(n: Int): Any = n match {
    case 0 => name
    case 1 => age
    case 2 => isMale
    case _ => throw new IndexOutOfBoundsException(n.toString)
  }

  override def productPrefix: String = Human.toString
}

object Human extends ((String, Int, Boolean) => Human) {
  def apply(name: String, age: Int, isMale: Boolean): Human = {
    new Human(name, age, isMale)
  }

  override def toString: String = "Human"

}
