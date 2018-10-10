package scala_impatient_2e.ch05_classes.s02_properties_with_getters_and_setters

/**
  * Compiled from "Person2.scala"
  * public class scala_impatient_2e.ch05_classes.s02_properties_with_getters_and_setters.Person2 {
  *   private int privateAge;
  *   private int privateAge();
  *   private void privateAge_$eq(int);
  *   public int age();
  *   public void age_$eq(int);
  *   public scala_impatient_2e.ch05_classes.s02_properties_with_getters_and_setters.Person2();
  * }
  */
class Person2 {
  private var privateAge = 0 // Make private and rename
  def age: Int = privateAge
  def age_=(newValue: Int) {
    if (newValue > privateAge) privateAge = newValue; // Can’t get younger
  }
}


/**
  * Compiled from "Person2.scala"
  * public final class scala_impatient_2e.ch05_classes.s02_properties_with_getters_and_setters.Main {
  *   public static void main(java.lang.String[]);
  * }
  */
object Main {
  def main(args: Array[String]): Unit = {
    val fred = new Person2
    fred.age = 30
    fred.age = 21
    println(fred.age)
  }
}
