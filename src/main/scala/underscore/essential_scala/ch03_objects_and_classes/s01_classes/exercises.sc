//1 Cats, Again
class Cat(val name: String, val colour: String, val food: String)

val oswald = new Cat("Oswald", "Black", "Milk")
val henderson = new Cat("Henderson", "Ginger", "Chips")
val quentin = new Cat("Quentin", "Tabby and white", "Curry")

//2. Cats on the Prowl
object ChipShop {
  def willServe(cat: Cat) = {
    cat.food == "Chips"
  }
}

ChipShop.willServe(oswald)
ChipShop.willServe(henderson)
ChipShop.willServe(quentin)

//3. Directorial Debut
class Director(val firstName: String, val lastName: String, val yearOfBirth: Int) {
  def name: String = s"$firstName $lastName"
}

class Film(val name: String, val yearOfRelease: Int, val imdbRaditg: Double, val director: Director) {
  def directorAge = director.yearOfBirth

  def isDirectedBy(director: Director) = this.director == director

  def copy(
            name: String = this.name,
            yearOfRelease: Int = this.yearOfRelease,
            imdbRaditg: Double = this.imdbRaditg,
            director: Director = this.director) =
    new Film(name, yearOfRelease, imdbRaditg, director)
}

val eastwood          = new Director("Clint", "Eastwood", 1930)
val mcTiernan         = new Director("John", "McTiernan", 1951)
val nolan             = new Director("Christopher", "Nolan", 1970)
val someBody          = new Director("Just", "Some Body", 1990)

val memento           = new Film("Memento", 2000, 8.5, nolan)
val darkKnight        = new Film("Dark Knight", 2008, 9.0, nolan)
val inception         = new Film("Inception", 2010, 8.8, nolan)

val highPlainsDrifter = new Film("High Plains Drifter", 1973, 7.7, eastwood)
val outlawJoseyWales  = new Film("The Outlaw Josey Wales", 1976, 7.9, eastwood)
val unforgiven        = new Film("Unforgiven", 1992, 8.3, eastwood)
val granTorino        = new Film("Gran Torino", 2008, 8.2, eastwood)
val invictus          = new Film("Invictus", 2009, 7.4, eastwood)

val predator          = new Film("Predator", 1987, 7.9, mcTiernan)
val dieHard           = new Film("Die Hard", 1988, 8.3, mcTiernan)
val huntForRedOctober = new Film("The Hunt for Red October", 1990, 7.6, mcTiernan)
val thomasCrownAffair = new Film("The Thomas Crown Affair", 1999, 6.8, mcTiernan)

eastwood.yearOfBirth // Int = 1930
dieHard.director.name // String = John McTiernan
invictus.isDirectedBy(nolan) // Boolean = false


//4. A Simple Counter
class Counter(val count: Int) {
  def inc = new Counter(count+1)
  def dec = new Counter(count-1)
}

new Counter(10).inc.dec.inc.inc.count

//5. Counting Faster
class Counter1(val count: Int) {
  def inc(value: Int = 1) = new Counter1(count+value)
  def dec(value: Int = 1) = new Counter1(count-value)
}

//6. Additional Counting
class Adder(amount: Int) {
  def add(in: Int) = in + amount
}

class Counter2(val count: Int) {
  def dec = new Counter2(count - 1)
  def inc = new Counter2(count + 1)
  def adjust(adder: Adder) =
    new Counter(adder.add(count))
}

