package devInsideYou.YFPL.v16_inheritance

class TV extends Device {
  override def wattsPerSecond: Int = 500

  override def actuallyTrunOn(): Unit = {
    println("tv on")
  }

  override def actuallyTrunOff(): Unit = {
    println("tv on")
  }
}
