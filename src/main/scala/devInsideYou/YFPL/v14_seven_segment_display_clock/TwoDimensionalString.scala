package devInsideYou.YFPL.v14_seven_segment_display_clock

final case class TwoDimensionalString(top: String, middle: String, bottom: String) {
  val length: Int = top.length

  require(requirement = doAllRowsHaveSameLength, message = "All rows must have the same length!")

  private[this] def doAllRowsHaveSameLength: Boolean =
    top.length == middle.length && middle.length == bottom.length

  def +(that: TwoDimensionalString): TwoDimensionalString =
    TwoDimensionalString(
      top    = this.top    + that.top,
      middle = this.middle + that.middle,
      bottom = this.bottom + that.bottom
    )

  def show(): Unit = {
    println(rendered)
  }

  private[this] def rendered: String =
    top + "\n" +
      middle + "\n" +
      bottom
}

object TwoDimensionalString {
  val QuetionMarks: TwoDimensionalString =
    TwoDimensionalString(
      top = "   ",
      middle = " ? ",
      bottom = " ? "
    )

  val Empty: TwoDimensionalString =
    TwoDimensionalString(
      top = "",
      middle = "",
      bottom = ""
    )
}
