package devInsideYou.YFPL.v17_traits_and_their_superpower

object Base {
  abstract class Car {
    def model: String
    def topSpeedInKmPerHour: Int
    def topAccelerationInRpm: Int
    def brand: String = ""

    override def toString: String = {
      brand + " " + model + " " + topSpeedInKmPerHour + " " + topAccelerationInRpm
    }
  }
  //java.util.Set[String]
}