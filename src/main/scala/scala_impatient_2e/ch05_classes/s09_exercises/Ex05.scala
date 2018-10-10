package scala_impatient_2e.ch05_classes.s09_exercises

import scala.beans.BeanProperty

/**
  * Make a class Student with read-write JavaBeans properties name (of type String) and id (of type Long).
  * What methods are generated? (Use javap to check.) Can you call the JavaBeans getters and setters in Scala? Should you?
  */
class Student (@BeanProperty var hours: String, @BeanProperty var id: Int)

// will be generated:
// - private fields,
// - scala public accessors and mutators
// - JavaBeans public getters and setters
// - constructor
/**
  * Compiled from "Ex05.scala"
  * public class scala_impatient_2e.ch05_classes.s09_exercises.Student {
  *   private java.lang.String hours;
  *   private int id;
  *   public java.lang.String hours();
  *   public void hours_$eq(java.lang.String);
  *   public int id();
  *   public void id_$eq(int);
  *   public java.lang.String getHours();
  *   public int getId();
  *   public void setHours(java.lang.String);
  *   public void setId(int);
  * public scala_impatient_2e.ch05_classes.s09_exercises.Student(java.lang.String, int);
  * }
  */
