package devInsideYou.YFPL.v17_traits_and_their_superpower

object Core {

  class OrdinaryCar(override val model: String) extends Base.Car {
    override def topSpeedInKmPerHour: Int = 220
    override def topAccelerationInRpm: Int = 8000
  }

  class SportsCar(override val model: String) extends Base.Car {
    override def topSpeedInKmPerHour: Int = 300
    override def topAccelerationInRpm: Int = 11000
  }
  // java.util.HashSet[String]
}