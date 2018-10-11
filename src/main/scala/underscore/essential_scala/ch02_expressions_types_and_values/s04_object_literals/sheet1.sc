object Test {}  //empty object
Test

object Test2 {
  def name: String = "Probably the best object ever"
}
Test2.name

object Test3 {
  def hello(name: String) = "Hello " + name
}

Test3.hello("Freddie")

//fields
object Test4 {
  val name = "Noel"
  def hello(other: String): String = name + " says hi to " + other
}

Test4.hello("Dave")

//methods versus fields
object Test7 {
  //block expression {}
  val simpleField = {
    println("Evaluating simpleField")
    42
  }
  //method
  def noParameterMethod = {
    println("Evaluating noParameterMethod")
    42
  }
}

Test7


//exercises
// 1. Cat-o-matique
object Oswald {
  val colour: String = "Black"
  val food: String = "Milk"
}

object Henderson {
  val colour: String = "Ginger"
  val food: String = "Chips"
}

object Quentin {
  val colour: String = "Tabby and white"
  val food: String = "Curry"
}

//2. Square Dance
object calc {
  def square(d: Double) = d*d
  def cube(d: Double) = d*square(d)
}

//3. Precise square Dance
object calc2 {
  def square(d: Int) = d*d
  def cube(d: Int) = d*square(d)

  def square(d: Double) = d*d
  def cube(d: Double) = d*square(d)
}

//4. Order of evaluation
object argh {
  def a = {
    println("a")
    1
  }

  val b = {
    println("b")
    a + 2
  }

  def c = {
    println("c")
    a
    b + "c"
  }
}

argh.c + argh.b + argh.a

// 5. Greetings, human
object person {
  val firstName: String = "Teddy"
  val lastName: String = "Bear"
}

object alien {
  def greet(p: person.type) =
    "Hello " + p.firstName + " " +  p.lastName
}

alien.greet(person)

//6. The Value of Methods


