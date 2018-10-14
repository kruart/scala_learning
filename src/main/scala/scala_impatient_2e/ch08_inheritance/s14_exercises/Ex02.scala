package scala_impatient_2e.ch08_inheritance.s14_exercises

/*
  2. Extend the BankAccount class of the preceding exercise into a class SavingsAccount
  that earns interest every month (when a method earnMonthlyInterest is called)
  and has three free deposits or withdrawals every month. Reset the transaction count in the earnMonthlyInterest method.
 */
class BankAccount1(initialBalance: Double) {
  private var balance = initialBalance
  def currentBalance = balance
  def deposit(amount: Double) = { balance += amount; balance }
  def withdraw(amount: Double) = { balance -= amount; balance }
}

class SavingsAccount(initialBalance: Double, monthRate: Double) extends BankAccount1(initialBalance) {
  private var freeTransactions = 3

  override def deposit(amount: Double): Double = {
    if (freeTransactions > 0) {
      freeTransactions -= 1
      super.deposit(amount)
    } else
      super.deposit(amount - 1)
  }
  override def withdraw(amount: Double): Double = {
    if (freeTransactions > 0) {
      freeTransactions -= 1
      super.withdraw(amount)
    } else
      super.withdraw(amount + 1)
  }

  def earnMonthlyInterest(): Unit = {
    freeTransactions = 4
    deposit(currentBalance * (monthRate / 100) )
  }
}

object Ex02 extends App {
  private val account = new SavingsAccount(100, 1.5)
  account.withdraw(50)
  account.deposit(50)
  account.earnMonthlyInterest()
  println(account.currentBalance) //101.5
}
