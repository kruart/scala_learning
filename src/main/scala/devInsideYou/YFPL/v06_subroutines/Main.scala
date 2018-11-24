package devInsideYou.YFPL.v06_subroutines

object Main {
  def main(args: Array[String]): Unit = {
    println("*" * 50)

    {
      val res = FarAway.code2(isRainyDay = true)
      println(res)

      println(FarAway.code2(true, true))
      println("-" * 50)
      println(FarAway.code2(true, false))
      println("-" * 50)
      println(FarAway.code2(false, true))
      println("-" * 50)
      println(FarAway.code2(false, false))
    }

    println("*" * 50)
  }
}
