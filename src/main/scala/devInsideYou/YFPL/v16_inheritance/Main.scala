package devInsideYou.YFPL.v16_inheritance

object Main {
  def main(args: Array[String]): Unit = {
    println("*" * 131)
    code(args)
    println("*" * 131)
  }

  def code(args: Array[String]): Unit = {
    val bulb = new LightBulb
    val tv = new TV
    val meter = new EnergyMeter(tv)

    meter.startMeasuring()
    Thread.sleep(1000)
    meter.stopMeasuring()
    println(meter.wattsConsumedInTotal)

    println()

    meter.startMeasuring()
    Thread.sleep(1000)
    meter.stopMeasuring()
    println(meter.wattsConsumedInTotal)
  }
}
