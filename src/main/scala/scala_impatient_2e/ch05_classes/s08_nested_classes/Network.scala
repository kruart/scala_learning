package scala_impatient_2e.ch05_classes.s08_nested_classes

import scala.collection.mutable.ArrayBuffer

class Network {
  class Member(val name: String) {
    val contacts = new ArrayBuffer[Member]
  }
  private val members = new ArrayBuffer[Member]

  def join(name: String) = {
    val m = new Member(name)
    members += m
    m
  }
}

object Main1 extends App {
  val chatter = new Network
  val myFace = new Network

  val fred = chatter.join("Fred")
  val wilma = chatter.join("Wilma")
  fred.contacts += wilma // OK

  val barney = myFace.join("Barney") //// Has type myFace.Member
  // No—can't add a myFace.Member to a buffer of chatter.Member elements
  //  fred.contacts += barney
}
