package scala_impatient_2e.ch08_inheritance.s14_exercises

/*
  7. Provide a class Square that extends java.awt.Rectangle and has three constructors:
  - one that constructs a square with a given corner point and width,
  - one that constructs a square with corner (0, 0) and a given width,
  - and one that constructs a square with corner (0, 0) and width 0.
 */
class Square(x: Int, y: Int, width: Int) extends java.awt.Rectangle(x, y, width, width) {
  this(width: Int) { this(0, 0, width) }
  this() { this(0, 0, 0) }
}

