package devInsideYou.YFPL.v09_ways_of_creation_literals

object Main {
  def main(args: Array[String]): Unit = {
    println("*" * 50)

    {
      printlnMagenta("Numeric")
      println()

      {
        val a1: Byte = 127
        println(a1)

        val a2: Byte = 0x7F // 127
        println(a2)

        val a3: Byte = 0x7f // 127
        println(a3)
        // val a4: Byte = 0x80 // 128
      }
      println("-" * 50)

      {
        val b1: Long = 9223372036854775807l
        println(b1)

        val b2: Long = 9223372036854775807L
        println(b2)
      }
      println("-" * 50)
      printlnMagenta("Char")
      println()

      {
        val c1: Char = 'A'
        println(c1)

        val c2: Char = 65
        println(c2)

        val c3: Char = 0x41 // 65
        println(c3)

        val c4: Char = 0x0041
        println(c4)

        val c5: Char = '\u0041'
        println(c5)

        println()

        println(c1.toInt.toChar.toInt.toChar)
      }

      println("-" * 50)

      {
        println(Char.MaxValue)
        println(Char.MaxValue.toInt)
        println(Char.MaxValue.toHexString)
        println(Char.MaxValue.toBinaryString)
      }

      println("-" * 50)

      {
        val c1: Char = '\uffff'
        println(c1)

        val c2: Char = '\ufffF'
        println(c2)

        val c3: Char = '\uFFFF'
        println(c3)

        println(0xffff)
        println(0xffff: Char)
      }

      println("-" * 50)

      printlnMagenta("Float and Double")
      println()

      {
        {
          val d1: Float = 0.5f
          println(d1)

          val d2: Float = 0.5F
          println(d2)

          val d3: Float = 5F
          println(d3)
        }

        println("-" * 50)

        {
          val e1: Double = 0.5
          println(e1)

          val e2: Double = 0.5d
          println(e2)

          val e3: Double = 0.5D
          println(e3)
        }

        println("-" * 50)

        println(0.5E0)
        println(0.5e0)
        println(0.05e1)   //0.05 * math.pow(10, 1)
        println(0.005e2)  //0.005 * math.pow(10, 2)
        println(5e-1)     //5 * math.pow(10, -1)
        println(50e-2)
        println(500e-3)
        println(0.5e+0) //e ==< e+
        println(0.05e+1)
        println(0.005e+2)
      }

      println("-" * 50)

      printlnMagenta("Boolean")
      println()

      {
        println(true)
        println(false)
      }

      println("-" * 50)

      printlnMagenta("String")
      println()

      {
        val f: String = "hello world"
        println(f)
      }

      println("-" * 50)

      {
        // val f: String = "hello
        // world"
      }

      {
        val f: String = """hello
        world"""

        println(f)
      }

      println()

      {
        val f: String =
          """#he llo
             # world""".stripMargin('#')

        println(f)
      }

      println()

      {
        val f: String =
          """|he llo
             | world""".stripMargin

        println(f)
      }

      println()

      printlnMagenta("Symbol")

      println()

      {
        val g: Symbol = 'hi
        println(g)
      }

      println("-" * 50)

      printlnMagenta("Escape charakters and sequences")
      println()

      {
        val h: String = "hel lo\n world"
        println(h)

        println()

        printlnMagenta("Line Feed (LF)")

        println("hello\nworld")
        println()

        printlnMagenta("Line Feed (LF)")

        println("hello world")
        print("hello world\n")
        println()

        printlnMagenta("Form Feed (FF)")

        println("hello\fworld")
        println()

        printlnMagenta("Horizontal Tab (HT)")

        println("hello\tworld")
        println()

        printlnMagenta("Backspace (BS)")

        println("hello\bworld")
        println()

        printlnMagenta("Carriage Return (CR)")

        println("hello\rworld")
        println("hello\rworld".size)
        println("hello1234\rworld")
        println("hello1234\u001b[2K\rworld")
        println()

        printlnMagenta("Double quote")

        println("hello \"w\"orld")
        println()

        printlnMagenta("Single quote")

        println("hello \'w\'orld")
        println()

        printlnMagenta("Bashslash")

        println("hello \\world")
        println()

        printlnMagenta("Raw strings")

        println {
          """|hello\n\t\r""\"
             |world""".stripMargin
        }
      }

      println()

      printlnMagenta("Function literals")

      println()

      {
        val i: Int => Int = x => x + 1

        println(i)
        println(i(10))
      }

      println()

      {
        val i: Int => Int = _ + 1

        println(i)
        println(i(10))
      }

      println()

      {
        val i: (Int, Int) => Boolean =
          (left, right) => left == right

        println(i)
        println(i(10, 10))
        println(i(10, 11))
      }

      println()

      {
        val i: (Int, Int) => Boolean =
          _ == _

        println(i)
        println(i(10, 10))
        println(i(10, 11))
      }

      println()

      printlnMagenta("Time")

      println()

      {
        def now: String = {
          val formatter =
            java.time.format
              .DateTimeFormatter
              .ofPattern("HH:mm:ss")

          java.time
            .LocalDateTime
            .now
            .format(formatter)
        }

        def inOneLine(in: String): String = {
          val clearLine = "\u001b[2K"
          val carriageReturn = "\r"

          clearLine + carriageReturn + in
        }

        var i = 0

        while(i < 5) {
          Thread.sleep(1 * 1000)
          print("something very very long")
          print(inOneLine(now))

          i += 1
        }

        println()
      }
    }

    println("-" * 50)
  }

  def printlnMagenta(in: String): Unit =
    println(Console.MAGENTA + in + Console.RESET)
}

