object Accounts extends App {
  private var lastNumber = 0

  def newUniqueNumber(): Int = {lastNumber += 1; lastNumber}
}

Accounts.newUniqueNumber()