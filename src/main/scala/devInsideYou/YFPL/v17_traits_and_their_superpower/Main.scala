package devInsideYou.YFPL.v17_traits_and_their_superpower

import java.util

import devInsideYou.YFPL.v17_traits_and_their_superpower.Modification.{CaseIgnorance, Logging}

object Main {
  def main(args: Array[String]): Unit = {
    println("*" * 50)
    code(args)
    println("*" * 50)
    println("*" * 50)
  }

  def code(args: Array[String]): Unit = {
    final class Lamborghini(override val model: String)
      extends Core.SportsCar(model)
        with Modification.Spoiler {
      override def brand: String = "Lamborghini"
    }

    final class BMW(override val model: String)
    extends Core.OrdinaryCar(model)
      with Modification.EngineControlUnit
      with Modification.Spoiler
      with Modification.TurboCharger {
      println("BMW")
      override def brand: String = "BMW"
    }

//    println(new Lamborghini("Murcielago"))
//    println(new BMW("M3-GTR"))

    val firstLogThenIgnoreCase = new util.HashSet[String] with Modification.CaseIgnorance with Modification.Logging
    val firstLogThenIgnoreLog = new util.HashSet[String] with Modification.Logging with Modification.CaseIgnorance

    //printout "Add" Hi" and then adds "hi" to Set
    firstLogThenIgnoreCase.add("Hi")

    //adds "hi" to Set and then printsout "Add: Hi"
    firstLogThenIgnoreLog.add("Hi")
  }
}