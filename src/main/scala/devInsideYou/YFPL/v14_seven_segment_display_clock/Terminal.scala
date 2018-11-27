package devInsideYou.YFPL.v14_seven_segment_display_clock

object Terminal {
  def goUp(lines: Int): Unit = {
    print(s"\u001b[${lines}A")
  }

  def clearCanvas(): Unit = {
    print("\u001b[2J")
  }

}
