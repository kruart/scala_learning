//has instance methods
class Account {
  val id = Account.newUniqueNumber()
  private var balance = 0.0
  def deposit(amount: Double): Unit = balance += amount
}

//has static methods
object Account {  //// The companion object
  private var lastNumber = 0
  private def newUniqueNumber() = {lastNumber += 1; lastNumber}
}