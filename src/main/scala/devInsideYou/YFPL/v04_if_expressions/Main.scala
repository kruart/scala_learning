package devInsideYou.YFPL.v04_if_expressions

import scala.util.Random

object Main {
  def main(args: Array[String]): Unit = {
    println("*" * 50)

    val agent = FarAway.agent
    // if statement can be expression
    val who = if (agent._2 == 7) {
      s"$agent. This is James Bond!"
    } else if (agent._2 < 50) {
      s"$agent. This is old guard!"
    } else {
      s"$agent. This is new secret agent!"
    }

    println(who)
    println("*" * 50)
  }

}

object FarAway {
  def agent = ("agent", Random.nextInt(77))
}
