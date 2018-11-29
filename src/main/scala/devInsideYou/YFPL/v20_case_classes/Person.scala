package devInsideYou.YFPL.v20_case_classes

final case class Person(name: String, age: Int, isMale: Boolean) {
  def isFemale: Boolean = !isMale
}
