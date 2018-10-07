val s = "Hello"
s(4)
s.apply(4)

//"Bonjour".sorted(3) //conflict, not explicit parameter
// right way 1
val sSorted = "Bonjour".sorted
sSorted(3)
// right way 2
"Bonjour".sorted.apply(3)

BigInt("1234567890")
BigInt.apply("1234567890")

BigInt("1234567890") * BigInt("1234567890")

