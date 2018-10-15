//val mulOneAtATime = (x: Int) => ((y: Int) => x * y)
def mulOneAtATime(x: Int)(y: Int) = x * y
mulOneAtATime(6)(7)


val a = Array("Hello", "World")
val b = Array("hello", "world")
a.corresponds(b)(_.equalsIgnoreCase(_)) //true