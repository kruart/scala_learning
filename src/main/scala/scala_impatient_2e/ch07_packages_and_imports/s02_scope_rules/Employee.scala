package scala_impatient_2e.ch07_packages_and_imports.s02_scope_rules
//
object Main extends App {
  val fred = new scala_impatient_2e.ch07_packages_and_imports.s02_scope_rules.Employee(50000)
  fred.giveRaise(10)
  println(fred + ": " + fred.description)

  val wilma = new scala_impatient_2e.ch07_packages_and_imports.s01_packages.Manager("Wilma")
  println(wilma + ": " + wilma.description)
}

    object Utils {
      def percentOf(value: Double, rate: Double) = value * rate / 100
    }

class Employee(initialSalary: Double) {
        private var salary = initialSalary
        def description = "An employee with salary " + salary
        def giveRaise(rate: scala.Double) {
          salary += Utils.percentOf(salary, rate)
          // Ok to access Utils from parent package
        }
      }
