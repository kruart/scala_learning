package devInsideYou.YFPL.v13_message_passing_style

object Main {
  def main(args: Array[String]): Unit = {
    println("*" * 50)
    code(args)
    println("*" * 50)
  }


  def code(args: Array[String]): Unit = {
    //    type BankAccount = Symbol => Any
    //    def BankAccount(initialBalance: Int): BankAccount = {
    object BankAccount
    class BankAccount(initialBalance: Int) {
      private[this] var _balance: Int = initialBalance

      def withdraw(amount: Int): Unit =
        if (this._balance >= amount) {
          this._balance = this._balance - amount
        } else
          sys.error("Insufficient funds")

      def deposit(amount: Int): Unit =
        if (this._balance >= 1) this._balance += amount
        else sys.error("It's only possible to deposit positive amount")

      def balance: Int = this._balance
    }

    val bankAccount1 = new BankAccount(initialBalance = 100)
    bankAccount1.withdraw(10)
    println(bankAccount1.balance)
    bankAccount1.withdraw(15)
    println(bankAccount1.balance)
    println()

    bankAccount1.deposit(125)
    println(bankAccount1.balance)

    object OperationsForMultipleBankAccount{
      def makeTransfer(from: BankAccount, amount: Int, to: BankAccount): Unit = {
        def showBothAccounts: Unit = {
          println(s"from: ${from.balance}")
          println(s"to: ${to.balance}")
        }

        println("before")
        showBothAccounts
        from.withdraw(amount)
        to.deposit(amount)

        println()
        println("after")
        showBothAccounts
      }
    }

    val thisOne: BankAccount = new BankAccount(initialBalance = 50)
    val thatOne: BankAccount = new BankAccount(initialBalance = 15)
    OperationsForMultipleBankAccount.makeTransfer(from = thisOne, amount = 20, to = thatOne)
  }
}
