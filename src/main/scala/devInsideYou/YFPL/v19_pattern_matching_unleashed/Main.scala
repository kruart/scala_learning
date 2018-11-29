package devInsideYou.YFPL.v19_pattern_matching_unleashed

object Top {
  object Sub {
    val Seven = 7
  }
}

final case class Person (val name: String, val age: Int) {
  def isAdult: Boolean = age >= 18
}

object Main {
  def main(args: Array[String]): Unit = {
    println("*" * 50)
    code(args)
    println("-" * 50)
    code2(args)
    println("-" * 50)
    code3(args)
    println("*" * 50)
  }

  def code(args: Array[String]) = {
    val `one` = 1    //sticks
    val Three = 3   //capital

    def method(input: Any): Any = input match {
      case 2 => 2
      //      case one => s"This one $one"  // doesn't refer to `one` or one outer variable, one is Any, like arg below
      case `one` => s"This one ${`one`}"  //sticks works, it refer to `one` or it could be just one outer var
      case Three => s"This Three $Three " //start with capital works too
      case name: Main.type => name
      case Top.Sub.Seven => s"This Three ${Top.Sub.Seven}"
      case greeting @ "hi" => s"This Greeting $greeting" //bind value to a variable 'greeting'
      //      case name @ (_: Boolean) => s"This Boolean $name" //bind value to a variable 'name'
      case name: Boolean => s"This Boolean $name" //bind value to a variable 'name'
      case arg => arg
    }

    def show(input: Any): Unit = {
      println(method(input))
    }

    show(this)
    show(1)
    show(2)
    show(3)
    show(7)
    show(true)
    show(false)
    show("hi")
    show('c')
  }

  def code2(args: Array[String]) = {

    def method(input: Any): Any = input match {
      case person: Person if person.isAdult => s"guard: ${person.isAdult}"
      case person: Person => person.name
    }

    def method2(input: Any): Any = input match {
      case p @ Person(name, age @ 27) if name.toLowerCase.startsWith("a") =>
        s"Hello $name. You're $age. And your name starts with 'a'"
      case p @ Person(name, age @ 27) => s"Hello $name. You're $age"
      case p @ Person(name, age) =>
        s"""|Mathched $name who is $age years old.
            |This is the "toString" implementation:
            |$p""".stripMargin
      case Tuple2(
            p1 @ Person(name: String, age @ 27),
            p2 @ Person(_, 17)) =>
            s"Hello ${p1.name} and ${p2.name}"
      case Tuple2(person1: Person, person2: Person) => s"You're names: ${person1.name}, ${person2.name}"
    }

    val alice = new Person("Alice", 27)
    val richard = new Person("Richard", 27)
    val bob = new Person("Bob", 17)

    def show(input: Any): Unit = { println(method(input)) }
    show(alice)
    show(bob)

    println("-" * 50)
    def show2(input: Any): Unit = { println(method2(input)) }
    show2(alice)
    show2(bob)
    show2(richard)
    show2(Tuple2(alice, bob)) //tuple2
    show2((alice, richard)) //tuple2
  }

  def code3(args: Array[String]) = {

    def method(input: Any): Any = input match {
      case Seq() => "empty"
      case Seq(oneElem) => oneElem
      case Seq(one, last) => last
      case Seq(1, 2, 3) => "matched"
      case Seq(first, _*) => "at least 1 elements"
      case Seq(first, second, _*) => "at least 2 elements"
      case Seq(first, second, others @ _*) => others
//      case _: Seq[String] => "whatever"
    }

    def method2(input: Any): Any = input match {
//      case _: Int | _: String => "int  or string"
      case name @ (_: Int | _: String) => s"int  or string: ${name.getClass}"
      case _ => "whatever"
    }

    def show(input: Any): Unit = {
      println(method(input))
    }

    def show2(input: Any): Unit = {
      println(method2(input))
    }

    show(Seq())      //Seq.empty[Int]
    show(Seq(1))
    show(Seq(1, 2))
    show(Seq(1, 2, 3))
    show(Seq('h', 'e', 'l', 'l', 'o'))

    show2(1)
    show2("1")
    show2(true)
  }
}
