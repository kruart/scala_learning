package scala_impatient_2e.ch06_objects.s05_application_objects

object Hello extends App {
  if (args.length > 0)
    println(f"Hello ${args(0)}")
  else
    println("Hello, World!")
}

//
//object Hello {
//    def main(args: Array[String]): Unit = {
//        println("Hello, World!")
//    }
//}

