package devInsideYou.YFPL.v05_intro_to_type_systems

object Main {
  def main(args: Array[String]): Unit = {
    println("*" * 50)

    {
      val a: Int = 1337
      val b: Boolean = false
      val c: Char = 't'
      val d: String = "true"
      val e: Unit = {}
      val f: Any = if (false) 10 else "some str"
      var g: Int = 20
      g = 30

      println(a)
      println(b)
      println(c)
      println(d)
      println(e)
      println(f)
      println(g)
    }
    println("*" * 50)
  }
}
