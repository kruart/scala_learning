import scala_impatient_2e.ch07_packages_and_imports.s01_packages.Manager
package scala_impatient_2e {
  package ch07_packages_and_imports {
    package s01_packages {
      class Employee(id: Int) {
        def description = "An employee with id " + id
      }
    }
  }
}


package scala_impatient_2e {
  package ch07_packages_and_imports {
    package s01_packages {

      class Counter {
        private var value = 0

        def increment() {
          value += 1
        }
        def description = "A counter with value " + value
      }

    }
  }
}

object Main extends App {
  val fred = new scala_impatient_2e.ch07_packages_and_imports.s01_packages.Employee(1729)
  val wilma = new Manager("Wilma")
  val myCounter = new scala_impatient_2e.ch07_packages_and_imports.s01_packages.Counter
  println(fred + ": " + fred.description)
  println(wilma + ": " + wilma.description)
  println(myCounter + ": " + myCounter.description)
}

