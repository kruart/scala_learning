final case class Box[A](value: A)
val box1 = Box(2)
box1.value

val box2 = Box("hi")
box2.value

def generic[A](in: A): A = in
generic[String]("foo")
generic("foo")
generic(1)


sealed trait Result[A]
case class Success[A](result: A) extends Result[A]
case class Failure[A](reason: String) extends Result[A]
