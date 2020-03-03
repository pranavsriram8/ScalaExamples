import java.util.Date
val now = new Date

import java.util._

// inheritance

//complex feature of traits mixins

trait Logged {
  def log(msg: String) { }
}

trait ConsoleLogger extends Logged {
  override def log(msg: String): Unit = { println(msg) }
}

trait TimestampLogger extends Logged {
  override def log(msg: String): Unit = super.log(new java.util.Date() + " "  + msg)
}

trait ShortLogger extends Logged {
  val maxLength = 15

  override def log(msg: String): Unit = super.log(
    if(msg.length  <= maxLength) msg
    else msg.substring(0, maxLength - 3) + "...")
}


class SavingsAccount extends Logged {
  private var balance: Double = 0

  def withdraw(amount: Double): Unit = {
    if (amount > balance) log("Insufficient funds")
    else balance -= amount
  }
}

val acct = new SavingsAccount with ConsoleLogger
acct.withdraw(1000)
//val acct2 = new SavingsAccount with FileLogger


val acct1 = new SavingsAccount with ConsoleLogger with TimestampLogger with ShortLogger {
  override val maxLength: Int = 25
}
acct1.withdraw(1000)

val acct2 = new SavingsAccount with ConsoleLogger with ShortLogger with TimestampLogger {
  override val maxLength = 25
}

acct2.withdraw(1000)

val acct3 = new SavingsAccount with ShortLogger with TimestampLogger with ConsoleLogger {
  override val maxLength = 25
}

acct3.withdraw(1000)