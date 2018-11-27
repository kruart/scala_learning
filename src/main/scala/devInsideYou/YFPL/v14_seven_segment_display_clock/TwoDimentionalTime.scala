package devInsideYou.YFPL.v14_seven_segment_display_clock

import java.time.LocalDateTime
import java.time.format.DateTimeFormatter

object TwoDimentionalTime {
  val Stars: TwoDimensionalString =
    TwoDimensionalString(
      top    = "   ",
      middle = " * ",
      bottom = " * "
    )

  def showCurrent(pattern: String): Unit = {
    show(LocalDateTime.now, pattern)
  }

  private[this] def show(time: LocalDateTime, pattern: String): Unit = {
    formatted(time, pattern).show()
  }


  private[this] def formatted(time: LocalDateTime, pattern: String): TwoDimensionalString = {
    oneDimensional(time, pattern).foldLeft(TwoDimensionalString.Empty) { (result, timeDigit) =>
      if (timeDigit == ':' ) result + Stars
      else result + TwoDimensionalDigit(timeDigit.toString.toInt)
    }
  }

  private[this] def oneDimensional(time: LocalDateTime, pattern: String): String = {
    time.format(DateTimeFormatter.ofPattern(pattern))
  }

  //just for educational purposes
  var result: TwoDimensionalString = TwoDimensionalString.Empty
  private[this] def formatted2(time: LocalDateTime, pattern: String): TwoDimensionalString = {

    oneDimensional(time, pattern).foreach { timeDigit =>
      if (timeDigit == ':' ) result += Stars
      else result += TwoDimensionalDigit(timeDigit.toString.toInt)
    }
    result
  }
}
