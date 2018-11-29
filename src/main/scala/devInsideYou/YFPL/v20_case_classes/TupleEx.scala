package devInsideYou.YFPL.v20_case_classes

object TupleEx {
  def main(args: Array[String]): Unit = {
    println("*" * 50)
    code(args)
    println("-" * 50)
  }

  def code(args: Array[String]): Unit = {
    val tuple = new T3("favNum", 777, true)

    println(tuple._2)
    println(tuple.productArity)

    println()
    val iterator: Iterator[Any] = tuple.productIterator
    iterator foreach println
  }
}

class T3(
        override val _1: String,
        override val _2: Int,
        override val _3: Boolean,
        ) extends P3

trait P3 extends Product {
  //members declared in scala.Equals
  def canEqual(that: Any): Boolean = that.isInstanceOf[P3]

  //members declared in scala.Product
  override def productArity: Int = 3
  override def productElement(n: Int): Any = n match {
    case 0 => _1
    case 1 => _2
    case 2 => _3
    case _ => throw new IndexOutOfBoundsException(n.toString)
  }

  def _1: String
  def _2: Int
  def _3: Boolean
}
