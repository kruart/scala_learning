//You can have multiple generators of the form variable <- expression
for (i <- 1 to 3; j <- 1 to 3)
  println(f"${10 * i + j}%3d")  // Prints 11 12 13 21 22 23 31 32 33

//Each generator can have a guard, a Boolean condition preceded by if
for (i <- 1 to 3; j <- 1 to 3 if i != j)
  println(f"${10 * i + j}%3d")  // Prints 12 13 21 23 31 32

//You can have any number of definitions, introducing variables that can be used inside the loop
for (i <- 1 to 3; from = 4 - i; j <- from to 3)
  print(f"${10 * i + j}%3d") //// Prints 13 22 23 31 32 33

//When the body of the for loop starts with yield, the loop constructs a collection of values, one for each iteration
for (i <- 1 to 10) yield i % 3  //// Yields Vector(1, 2, 0, 1, 2, 0, 1, 2, 0, 1)

//The generated collection is compatible with the first generator
val x = for (c <- "Hello"; i <- 0 to 1) yield (c + i).toChar  // Yields "HIeflmlmop"
println(x)

// Yields Vector('H', 'e', 'l', 'l', 'o', 'I', 'f', 'm', 'm', 'p')
for (i <- 0 to 1; c <- "Hello") yield (c + i).toChar