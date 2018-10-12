class Account private (val id: Int, initialBalance: Double) {
  private var balance = initialBalance
}

object Account { // The companion object
  private var lastNumber = 0
  private def newUniqueNumber() = {lastNumber += 1; lastNumber}

  def apply(initialBalance: Double) =
    new Account(newUniqueNumber(), initialBalance)
}

val acct = Account(1000.0)