/* When we mark a trait as sealed we must define all of its subtypes in the same file.
   Once the trait is sealed, the compiler knows the complete set of subtypes
   and will warn us if a pattern matching expression is missing a case:*/
import java.util.Date

sealed trait Visitor {
  def id: String
  def createdAt: Date
  def age: Long = new Date().getTime() - createdAt.getTime()

  def missingCase(v: Visitor) =
    v match {
      case User(_, _, _) => "Got a user"
        //warning
    }
}

case class Anonymous(id: String, createdAt: Date = new Date()) extends Visitor
case class User(id: String, email: String, createdAt: Date = new Date()) extends Visitor

/* sealed - if we want to allow extensions within the file
sealed trait Visitor { /* ... */ }

or final if we want to disallow all extensions.
final case class User(/* ... */) extends Visitor
final case class Anonymous(/* ... */) extends Visitor */




