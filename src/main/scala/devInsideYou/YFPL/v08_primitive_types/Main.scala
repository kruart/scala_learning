package devInsideYou.YFPL.v08_primitive_types

object Main {
  def main(args: Array[String]): Unit = {
    println("*" * 50)

    {
      def signedBits(n: Long): Int = unsignedBits(n) + 1

      def unsignedBits(n: Long): Int = n.toBinaryString.size

      def rendered(`type`: String, min: Long, max: Long, bits: Int): String = {
        val bytes = bits / 8
        s"${`type`} \t has $bits\t binary digits (bits), which is $bytes bytes with \tpossible values: $min .. $max"
      }
      def renderedSigned(`type`: String, min: Long, max: Long): String = {
        rendered(`type`, min, max, signedBits(max))
      }

      def renderedUnSigned(`type`: String, min: Long, max: Long): String = {
        rendered(`type`, min, max, unsignedBits(max))
      }

      def renderedFloating(`type`: String, min: Double, max: Double): String = {
        s"${renderedFirstHalf(`type`)} $min .. $max"
      }

      def renderedFirstHalf(`type`: String): String = s"${`type`}\t\t\t\t\t\t\t\t\t\t\t\t\t\t\tposible values:"

      println(renderedSigned("Byte", Byte.MinValue, Byte.MaxValue))
      println("-" * 50)
      println(renderedSigned("Short", Short.MinValue, Short.MaxValue))
      println("-" * 50)
      println(renderedUnSigned("Char", Char.MinValue, Char.MaxValue))
      println("-" * 50)
      println(renderedSigned("Int", Int.MinValue, Int.MaxValue))
      println("-" * 50)
      println(renderedSigned("Long", Long.MinValue, Long.MaxValue))

      println("-" * 50)
      println(renderedFloating("Float", Float.MinValue, Float.MaxValue))
      println("-" * 50)
      println(s"${renderedFirstHalf("Boolean")}, ${true} and ${false}")
      println("-" * 50)
      println(s"${renderedFirstHalf("Unit")}, ${()} and {}")
      println("-" * 50)
      println(renderedFloating("Double", Double.MinValue, Double.MaxValue))
    }

    println("*" * 50)
  }
}
