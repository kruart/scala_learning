package devInsideYou.YFPL.v15_object_orientations_value_proposition

object Main {
  def main(args: Array[String]): Unit = {
    println("*" * 131)
    code(args)
    println("*" * 131)
  }

  def code(args: Array[String]): Unit = {
    class EnergyMeter(device: Device) {
      private[this] var turnedOnAtMillis: Long = 0
      private[this] var _wattsConsumedInTotal: Double = 0
      def wattsConsumedInTotal: Double = _wattsConsumedInTotal
      private[this] def wattsConsumedInTotal_=(newValue: Double): Unit = {
        _wattsConsumedInTotal = newValue
      }

      def startMeasuring(): Unit = {
        device.turnOn()
        turnedOnAtMillis = System.currentTimeMillis
      }

      def stopMeasuring(): Unit = {
        device.turnOff()
        val durationInMillis = System.currentTimeMillis() - turnedOnAtMillis
        val durationInSeconds = durationInMillis.toDouble  / 1000

        wattsConsumedInTotal += device.wattsPerSecond * durationInSeconds
      }
    }

//    object EnergyMeter {
//      def apply(device: Any): EnergyMeter = {
//        device match {
//          case lightBulb: LightBulb => new EnergyMeter(lightBulb.wattsPerSecond, lightBulb.turnOn, lightBulb.turnOff)
//          case tv: TV => new EnergyMeter(tv.wattsPerSecond, tv.turnOn, tv.turnOff)
//          case _ => sys.error("not a device")
//        }
//      }
//    }

    trait Device {
      def wattsPerSecond: Int
      def turnOn(): Unit
      def turnOff(): Unit
    }

    class TV extends Device {
      override def wattsPerSecond = 500
      override def turnOn(): Unit = println("tv on")
      override def turnOff(): Unit = println("tv off")
    }

    class LightBulb extends Device {
      override def wattsPerSecond = 100
      override def turnOn(): Unit = println("Light Bulb on")
      override def turnOff(): Unit = println("Light Bulb off")
    }

    val lightBulb: LightBulb = new LightBulb
    val tv: TV = new TV

    val energyMeter = new EnergyMeter(lightBulb)
    energyMeter.startMeasuring()
    Thread.sleep(1000)
    energyMeter.stopMeasuring()
    println(energyMeter.wattsConsumedInTotal)

    println()
    energyMeter.startMeasuring()
    Thread.sleep(1000)
    energyMeter.stopMeasuring()
    println(energyMeter.wattsConsumedInTotal)
  }
}
