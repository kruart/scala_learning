class Counter1 {
  private var value = 0
  def increment() { value += 1 }

  // Can access private field of other object
  def isLess(other : Counter1) = value < other.value
}

// With a class-private field, Scala generates private getter and setter methods.
// However, for an object-private field, no getters and setters are generated at all.
class Counter2 {
  private[this] var value = 0   // Accessing someObject.value is not allowed
  def increment() { value += 1 }

  // Can't access private[this] field of other object
  //def isLess(other : Counter2) = value < other.value
}


