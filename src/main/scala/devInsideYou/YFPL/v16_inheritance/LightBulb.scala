package devInsideYou.YFPL.v16_inheritance

class LightBulb extends Device {
  override def wattsPerSecond: Int = 100

  override protected[this] def actuallyTrunOn(): Unit = {
    println("light bulb on")
  }


  override protected[this] def actuallyTrunOff(): Unit = {
    println("light bulb off")
  }
}
