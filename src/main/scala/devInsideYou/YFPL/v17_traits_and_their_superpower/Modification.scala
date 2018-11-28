package devInsideYou.YFPL.v17_traits_and_their_superpower

object Modification {
  trait Spoiler extends Base.Car {
    abstract override def topSpeedInKmPerHour: Int = {
      (super.topSpeedInKmPerHour * 1.02).toInt
    }
  }
  trait EngineControlUnit extends Core.OrdinaryCar {
    abstract override def topSpeedInKmPerHour: Int = {
      (super.topSpeedInKmPerHour * 1.50).toInt
    }
  }
  trait TurboCharger extends Core.OrdinaryCar {
    override def topAccelerationInRpm: Int = (super.topAccelerationInRpm * 1.25).toInt
  }

  // set example
  trait CaseIgnorance extends java.util.Set[String] {
    abstract override def add(e: String): Boolean =
      super.add(e.toLowerCase())

    abstract override def contains(o: Any): Boolean =
      super.contains(o.asInstanceOf[String].toLowerCase)

    abstract override def remove(o: Any) =
      super.remove(o.asInstanceOf[String].toLowerCase)
  }

  trait Logging extends java.util.Set[String] {
    abstract override def add(e: String): Boolean = {
      println(s"Add: $e")
      super.add(e)
    }
    abstract override def remove(o: Any) = {
      println(s"Remove: $o")
      super.remove(o)
    }


  }
}