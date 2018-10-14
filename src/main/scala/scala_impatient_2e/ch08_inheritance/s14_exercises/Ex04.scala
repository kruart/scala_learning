package scala_impatient_2e.ch08_inheritance.s14_exercises

import scala.collection.mutable.ListBuffer

/*
  4. Define an abstract class Item with methods price and description.
  A SimpleItem is an item whose price and description are specified in the constructor.
  Take advantage of the fact that a val can override a def. A Bundle is an item that contains other items.
  Its price is the sum of the prices in the bundle. Also provide a mechanism for adding items to the bundle and a suitable description method.
 */
abstract class Item {
  def price: Double
  def description: String
}

class SimpleItem(val price: Double, val description: String) extends Item {}
class Bundle(items: ListBuffer[Item]) extends Item {
  override def price: Double = items.map(_.price).sum
  override def description: String = items.map(_.description).mkString(", ")

  def addItem(item: Item): Unit = {
    items += item
  }
}

object Ex04 extends App {
  val bundle = new Bundle(ListBuffer(
    new SimpleItem(139.99, "Tablet"),
    new SimpleItem(799.99, "Laptop")))

  println(bundle.description)
  bundle.addItem(new SimpleItem(399.99, "Smartphone"))
  println(bundle.description)
}
