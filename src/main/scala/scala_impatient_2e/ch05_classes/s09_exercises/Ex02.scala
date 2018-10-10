package scala_impatient_2e.ch05_classes.s09_exercises

/**
  * Write a class BankAccount with methods deposit and withdraw, and a read-only property balance.
  */
class BankAccount (private var balance: Int = 0) {
  def deposit(value: Int) {
    this.balance += value
  }

  def withdraw(value: Int) {
    this.balance -=value
  }

  def printBalance(): Unit = println(balance)

}

object Ex02 extends App {
  val account = new BankAccount(5000)
  account.deposit(250)
  account.printBalance()
  account.withdraw(750)
  account.printBalance()
}
