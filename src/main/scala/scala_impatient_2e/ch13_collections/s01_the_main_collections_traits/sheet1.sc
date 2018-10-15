import java.awt.Color

import scala.collection.mutable.ArrayBuffer

Iterable(0xFF, 0xFF00, 0xFF0000)
Set(Color.RED, Color.GREEN, Color.BLUE)
Map(Color.RED -> 0xFF0000, Color.GREEN -> 0xFF00, Color.BLUE -> 0xFF)


val coll = Seq(1, 1, 2, 3, 5, 8, 13)
val set = coll.toSet
val buffer = coll.to[ArrayBuffer]

Seq(1, 2, 3) == (1 to 3)    //true
Seq(1, 2, 3) == Set(1, 2, 3)  //false
Seq(1, 2, 3).sameElements(Set(1, 2, 3)) //true

