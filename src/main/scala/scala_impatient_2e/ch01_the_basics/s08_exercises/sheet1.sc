// 1. In the Scala REPL, type 3. followed by the Tab key. What methods can be applied?
// => Do it in REPL. There are many methods including %, &, *, +, toByte, toChar etc.
3.equals(3)
3 == 3
3.to(5)
3.!=(3)
3.*(3)
3.asInstanceOf[Long]  //cast to Long
3.compareTo(4)        //-1
3.isInstanceOf[Int]   //true
3.5.ceil    // 4.0
3.5.floor   // 3.0
3.5.round   // 4.0
3.max(6)    // 6
3.min(6)    // 3
-3.abs      // 3

//2 In the Scala REPL, compute the square root of 3, and then square that value.
//  By how much does the result differ from 3? (Hint: The res variables are your
//  friend.)
val s = math.sqrt(3)
3 - math.pow(s, 2)  //4.440892098500626E-16

//3 Are the res variables val or var?
//res is val

// 4. Scala lets you multiply a string with a number - try out "crazy" * 3 in the REPL.
// What does this operation do? Where can you find it in Scaladoc?
"crazy" * 3

//5 What does 10 max 2 mean? In which class is the max method defined?
10 max 2  // 10.max(2), max is in RichInt class


//6 Using BigInt, compute 2^1024.
BigInt(2).pow(1024)

// 7. What do you need to import so that you can get a random prime as
// probablePrime(100, Random), without any qualifiers before probablePrime and Random?
import BigInt.probablePrime
import scala.math.BigInt
import util.Random
probablePrime(100, Random)                //> res3: scala.math.BigInt = 912013777957722342425952556723

// 8. One way to create random file or directory names is to produce a random
// BigInt and convert it to base 36, yielding a string such as "qsnvbevtomcj38o06kul".
// Poke around Scaladoc to find a way of doing this in Scala.
BigInt.probablePrime(100, scala.util.Random).toString(36)

// 9. How do you get the first character of a string in Scala? The last character?
val str = "String"
str.head
str(2)                //get char by index s(i)
str.last              //get last char
str.takeRight(1)      //get last char
str(str.length - 1)   //get last char

// 10. What do the take, drop, takeRight, and dropRight string functions do? What
// advantage or disadvantage do they have over using substring?
// take: Selects the first n elements
str.take(2)          //St     take: Selects the first n elements
str.drop(2)          //ring   drop: Selects all elements except first n ones
str.takeRight(2)     //ng     takeRight: Selects the last n elements
str.dropRight(2)     //Stri   dropRight: Selects all elements except last n ones
// advantage: they are much more intuitive than substring
// and they don't throw 'IndexOutOfBoundsException'.
