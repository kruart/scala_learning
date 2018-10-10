package scala_impatient_2e.ch05_classes.s08_nested_classes

import scala.collection.mutable.ArrayBuffer

class Network2(val name: String) {
  private val members = new ArrayBuffer[Network2.Member]

  def join(name: String) = {
    val m = new Network2.Member(name)
    members += m
    m
  }
}

object Network2 {
  class Member(val name: String) {
    val contacts = new ArrayBuffer[Member]
  }
}

object Main2 extends App {
  val chatter = new Network2("Chatter")
  val myFace = new Network2("MyFace")

  val fred = chatter.join("Fred")
  val barney = myFace.join("Barney")
  fred.contacts += barney //It's Ok
}
