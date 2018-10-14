package scala_impatient_2e.ch08_inheritance.s14_exercises

/*
  6. Define an abstract class Shape with an abstract method centerPoint and subclasses Rectangle and Circle.
  Provide appropriate constructors for the subclasses and override the centerPoint method in each subclass.
 */
abstract class Shape { def centerPoint(): (Double, Double) }
class Rectangle(val height: Int, val weight: Int) extends Shape {
  override def centerPoint(): (Double, Double) = (this.height/2, this.weight/2)
}
class Circle(val diameter: Int) extends Shape {
  override def centerPoint(): (Double, Double) = (diameter/2, diameter/2)
}

object Ex06 extends App {}
