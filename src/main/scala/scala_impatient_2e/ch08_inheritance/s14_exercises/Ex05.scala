package scala_impatient_2e.ch08_inheritance.s14_exercises

/*
  5. Design a class Point whose x and y coordinate values can be provided in a constructor.
  Provide a subclass LabeledPoint whose constructor takes a label value and x and y coordinates, such as
  new LabeledPoint("Black Thursday", 1929, 230.07)
 */
class Point(val x: Int, val y: Int)
class LabeledPoint(val label: String, x: Int, y: Int) extends Point(x, y)

object Ex05 extends App {}
