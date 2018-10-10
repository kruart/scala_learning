(1, 3.14, "Fred") //Tuple3[Int, Double, java.lang.String]

val t = (1, 3.14, "Fred")

//If you have a tuple,
// then you can access its components with the methods _1, _2, _3,
//Unlike array or string positions, the component positions of a tuple start with 1, not 0.
val second = t._2 //3.14

val first = t _1 //You can write t._1 as t _1

// Sets first to 1, second to 3.14, third to "Fred"
val (first1, second1, third) = t
third //Fred

//You can use a _ if you don’t need all components
val (first2, second2, _) = t

//Tuples are useful for functions that return more than one value.
//For example, the partition method of the StringOps class returns
// a pair of strings, containing the characters that fulfill a
//condition and those that don’t:
"New York".partition(_.isUpper) //Yields the pair ("NY", "ew ork")