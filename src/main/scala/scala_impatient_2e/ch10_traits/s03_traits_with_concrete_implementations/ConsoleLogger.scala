package scala_impatient_2e.ch10_traits.s03_traits_with_concrete_implementations

trait ConsoleLogger {
  def log(msg: String) = println(msg)
}
class Account {
  var balance = 1000.0
  def currentBalance = balance
  def deposit(amount: Double) = { balance += amount; }
  def withdraw(amount: Double) = { balance -= amount; }
}
class SavingsAccount extends Account with ConsoleLogger {
  override def withdraw(amount: Double) {
    if (amount > balance) log("Insufficient funds")
    else balance -= amount
  }
}
