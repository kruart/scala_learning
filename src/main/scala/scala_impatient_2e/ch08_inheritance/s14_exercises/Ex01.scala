package scala_impatient_2e.ch08_inheritance.s14_exercises
/*
1. Extend the following BankAccount class to a CheckingAccount class that charges $1 for every deposit and withdrawal.
Click here to view code image
class BankAccount(initialBalance: Double) {
 private var balance = initialBalance
 def currentBalance = balance
 def deposit(amount: Double) = { balance += amount; balance }
 def withdraw(amount: Double) = { balance -= amount; balance }
 }
 */
class BankAccount(initialBalance: Double) {
  private var balance = initialBalance
  def currentBalance = balance
  def deposit(amount: Double) = { balance += amount; balance }
  def withdraw(amount: Double) = { balance -= amount; balance }
}

class CheckingAccount(initialBalance: Double) extends BankAccount(initialBalance) {
  override def deposit(amount: Double): Double = {
    super.deposit(amount - 1)
  }
  override def withdraw(amount: Double): Double = {
    super.withdraw(amount + 1)
  }
}

object Ex01 extends App {
  private val account = new CheckingAccount(100)
  account.withdraw(50)
  account.deposit(50)
  println(account.currentBalance) //98
}
