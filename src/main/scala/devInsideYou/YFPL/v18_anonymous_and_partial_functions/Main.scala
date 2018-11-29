package devInsideYou.YFPL.v18_anonymous_and_partial_functions

object Main {
  def main(args: Array[String]): Unit = {
    println("*" * 50)
    code(args)
    println("*" * 50)
  }

  def code(args: Array[String]) = {
    type ~>[-Input, +Output] = PartialFunction[Input, Output]

    def toRomanNumeralDigit(number: Int): String = number match {
      case 0 => "0: N"
      case 1 => "1: I"
      case 2 => "2: II"
      case 3 => "3: III"
      case 4 => "4: IV"
      case 5 => "5: V"
      case 6 => "6: VI"
      case 7 => "7: VII"
      case 8 => "8: VIII"
      case 9 => "9: IX"
    }

    val toRomanNumeralDigitPartial: Int ~> String = {
      case 0 => "0: N"
      case 1 => "1: I"
      case 2 => "2: II"
      case 3 => "3: III"
      case 4 => "4: IV"
      case 5 => "5: V"
      case 6 => "6: VI"
      case 7 => "7: VII"
      case 8 => "8: VIII"
      case 9 => "9: IX"
    }

    0 until 10 map toRomanNumeralDigit foreach println
    println("-" * 50)
    0 until Int.MaxValue takeWhile toRomanNumeralDigitPartial.isDefinedAt collect toRomanNumeralDigitPartial foreach println
  }

  def code2(args: Array[String]) = {
    val totalFunction: Int => String = { argument => "\"" + argument + "\"" }
    //    val totalFunction1 = (argument: Int) => "\"" + argument + "\""

    type ~>[-Input, +Output] = PartialFunction[Input, Output]
    //    val partialFunction: ~>[Int, String] = ???
    //    val partialFunction: Int ~> String = {  //infix notation
    //      case 4 => "\"" + 4 + "\""
    //    }

    //    val partialFunction: Int ~> String = {  //infix notation
    //      case argument @ 4 => "\"" + argument + "\""
    //    }

    val partialFunction: Int ~> String = {  //infix notation
      case argument if argument == 4 => "\"" + argument + "\""
    }

    val totalFuncitonwithoutSyntacticSugar: Function1[Int, String] = new Function1[Int, String] {
      override def apply(argument: Int): String = "\"" + argument + "\""
    }

    val partialFuncitonwithoutSyntacticSugar: PartialFunction[Int, String] = new PartialFunction[Int, String] {
      override def apply(argument: Int): String = {
        if (argument == 4) "\"" + argument + "\""
        else throw new MatchError(argument)
      }

      override def isDefinedAt(argument: Int): Boolean = {
        if (argument == 4) true
        else false
      }
    }

    println(totalFunction(4))
    println(totalFuncitonwithoutSyntacticSugar(4))

    println()
    println(partialFunction(4))
    println(partialFuncitonwithoutSyntacticSugar(4))
  }
}
