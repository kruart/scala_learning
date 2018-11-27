package devInsideYou.YFPL.v14_seven_segment_display_clock

object TwoDimensionalDigit {
  val Zero = TwoDimensionalString(
    top    = " _ ",
    middle = "| |",
    bottom = "|_|"
  )

  val One = TwoDimensionalString(
    top    = "   ",
    middle = "  |",
    bottom = "  |"
  )

  val Two = TwoDimensionalString(
    top    = " _ ",
    middle = " _|",
    bottom = "|_ "
  )

  val Three = TwoDimensionalString(
    top    = " _ ",
    middle = " _|",
    bottom = " _|"
  )

  val Four = TwoDimensionalString(
    top    = "   ",
    middle = "|_|",
    bottom = "  |"
  )

  val Five = TwoDimensionalString(
    top    = " _ ",
    middle = "|_ ",
    bottom = " _|"
  )

  val Six = TwoDimensionalString(
    top    = " _ ",
    middle = "|_ ",
    bottom = "|_|"
  )

  val Seven = TwoDimensionalString(
    top    = " _ ",
    middle = "  |",
    bottom = "  |"
  )

  val Eight = TwoDimensionalString(
    top    = " _ ",
    middle = "|_|",
    bottom = "|_|"
  )

  val Nine = TwoDimensionalString(
    top    = " _ ",
    middle = "|_|",
    bottom = " _|"
  )

  def apply(digit: Int): TwoDimensionalString = digit match {
     case 0 => Zero
     case 1 => One
     case 2 => Two
     case 3 => Three
     case 4 => Four
     case 5 => Five
     case 6 => Six
     case 7 => Seven
     case 8 => Eight
     case 9 => Nine
     case _ => TwoDimensionalString.QuetionMarks
  }
}
