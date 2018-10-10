package scala_impatient_2e.ch05_classes.s08_nested_classes

import scala.collection.mutable.ArrayBuffer

class Network3(val name: String) {
  class Member(val name: String) {
    val contacts = new ArrayBuffer[Network3#Member]
  }

  private val members = new ArrayBuffer[Member]

  def join(name: String): Member = {
    val m = new Member(name)
    members += m
    m
  }
}

object Main3 extends App {
  val chatter = new Network3("Chatter")
  val myFace = new Network3("MyFace")

  val fred = chatter.join("Fred")
  val wilma = chatter.join("Wilma")
  fred.contacts += wilma // OK
  val barney = myFace.join("Barney")
  fred.contacts += barney // Also OK
}
