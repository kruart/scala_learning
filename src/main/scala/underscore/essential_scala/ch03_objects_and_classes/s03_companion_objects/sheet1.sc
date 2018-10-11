class Timestamp(val seconds: Long)

object Timestamp {
  def apply(hours: Int, minutes: Int, seconds: Long):
  Timestamp = new Timestamp(hours*60*60 + minutes*60 + seconds)
}

Timestamp(1, 1, 1).seconds

//exercise
//1. Friendly Person Factory
class Person(val firstName: String, val lastName: String) {
  def name: String =
    s"$firstName $lastName"
}
object Person {
  def apply(fullName: String): Person = {
    val parts = fullName.split(" ")
    new Person(parts(0), parts(1))
  }
}

Person("John Doe").name

//2. extended body of work
class Director(val firstName: String, val lastName: String, val yearOfBirth: Int) {
  def name: String = s"$firstName $lastName"
}
object Director {
  def apply(firstName: String, lastName: String, yearOfBirth: Int): Director =
    new Director(firstName, lastName, yearOfBirth)

  def older(director1: Director, director2: Director): Director =
    if (director1.yearOfBirth > director2.yearOfBirth) director1 else director2
}

class Film(val name: String, val yearOfRelease: Int, val imdbRaditg: Double, val director: Director)

object Film {
  def apply(name: String, yearOfRelease: Int, imdbRaditg: Double, director: Director): Film =
    new Film(name, yearOfRelease, imdbRaditg, director)

  def highestRating(film1: Film, film2: Film): Double =
    if (film1.imdbRaditg > film2.imdbRaditg) film1.imdbRaditg else film2.imdbRaditg

  def oldestDirectorAtTheTime(film1: Film, film2: Film): Director =
    Director.older(film1.director, film2.director)
}

//3. Type or Value?
