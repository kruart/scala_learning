package devInsideYou.YFPL.v14_seven_segment_display_clock

import Constants._

import scala.concurrent.duration._

object TickUnitlEnterIsPressed {
  def main(args: Array[String]): Unit = {
    Scala.tickUntilEnterIsPressed(Interval) {
      Terminal.clearCanvas()
      Terminal.goUp(LinesToGoUp)
      TwoDimentionalTime.showCurrent(TimePattern)

    }
  }
}

object TickForFewSeconds {
  def main(args: Array[String]): Unit = {
    Scala.loop(times = FewSeconds) {
      Terminal.clearCanvas()
      Terminal.goUp(LinesToGoUp)
      TwoDimentionalTime.showCurrent(TimePattern)
      Scala.wait(Interval)
    }
    println()
  }
}

object Constants {
  val FewSeconds: Int = 3
  val Interval: FiniteDuration = 1.second
  val LinesToGoUp: Int = Int.MaxValue
  val TimePattern: String = "HH:mm:ss"
}
