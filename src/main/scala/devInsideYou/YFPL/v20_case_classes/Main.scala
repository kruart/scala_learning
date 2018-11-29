package devInsideYou.YFPL.v20_case_classes

object Main {
  def main(args: Array[String]): Unit = {
    println("*" * 50)
    code(args)
    println("*" * 50)
  }

  println(Console.MAGENTA + "-" * 22 + "Person" + "-" * 22 + Console.RESET)
  def code(args: Array[String]): Unit = {
    val person = Person("Bob", 27, isMale = true)
    println(person.isMale)
    println(person.isFemale)
    println(person)
    println(Person)
    println(Person.isInstanceOf[Function3[_,_,_,_]])
    val personFactory: (String, Int, Boolean) => Person = Person
    println(person == Person("Bob", 27, isMale = true))

    val persons: Set[Person] = Set(
      person,
      Person("Bob", 28, isMale = true),
      Person("Bob", 29, isMale = true),
      Person("Bob", 30, isMale = true),
      Person("Bob", 31, isMale = true),
    )
    println(persons.contains(Person("Bob", 27, isMale = true)))
    println(person.copy(age = 33))  //copy method, but change age

    println(person.isInstanceOf[Product])
    println(person.productPrefix)
    println(person.productElement(0))
    println(person.productArity)
    println(person.productIterator.mkString("***"))


    println(Console.MAGENTA + "-" * 22 + "Human" + "-" * 22 + Console.RESET)
    val human = Human("Bob", 27, isMale = true)
    println(human.isMale)
    println(human.isFemale) //add val or var to variables
    println(human)  //toString in class
    println(Human)  //toString in object
    println(Human.isInstanceOf[Function3[_,_,_,_]]) //extends ((String, Int, Boolean) => Human)
    val humanFactory: (String, Int, Boolean) => Person = Person
    println(human == Human("Bob", 27, isMale = true))   //equals

    val humans: Set[Human] = Set(
      human,
      Human("Bob", 28, isMale = true),
      Human("Bob", 29, isMale = true),
      Human("Bob", 30, isMale = true),
      Human("Bob", 31, isMale = true),
    )
    println(humans.contains(Human("Bob", 27, isMale = true))) //hashcode
    println(human.copy(age = 33))  //copy method, but we want to change age

    //product methods(extend products)
    println(human.isInstanceOf[Product])
    println(human.productPrefix)
    println(human.productElement(0))
    println(human.productArity)
    println(human.productIterator.mkString("***"))
  }
}
