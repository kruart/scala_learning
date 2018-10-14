package scala_impatient_2e.ch08_inheritance.s12_object_equality

class Item(val description: String, val price: Double) {
//  final override def equals(other: Any) = {
//    other.isInstanceOf[Item] && {
//      val that = other.asInstanceOf[Item]
//      description == that.description && price == that.price
//    }
//  }

    //equals with pattern matching
    final override def equals(other: Any) = other match {
      case that: Item => description == that.description && price == that.price
      case _ => false
    }

  // Try commenting out hashCode
  //## is a null-safe version of the hashCode method that yields 0 for null instead of throwing an exception
  final override def hashCode = (description, price).##

  override def toString = s"${getClass.getName}[description=$description,price=$price]"
}

object Main extends App {
  val item1 = new Item("Toaster", 29.95)
  val item2 = new Item("Toaster", 29.95)
  val item3 = new Item("Espresso machine", 199.95)

  println(item1 == item2)
  println(item1 == item3)

  val items = new scala.collection.mutable.HashSet[Item]
  items += item1
  items += item2
  items += item3
  items += item3
  println(items.size) //2
}
