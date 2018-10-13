package scala_impatient_2e.ch07_packages_and_imports.s06_package_visibility

class Person(val name: String = "A" ) {
  private[ch07_packages_and_imports] def description = s"A person with name $name"
}

object Main extends App {
  val john = new scala_impatient_2e.ch07_packages_and_imports.s06_package_visibility.Person("John")
  println(john.description)
}
