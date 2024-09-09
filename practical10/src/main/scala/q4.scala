class Account(var balance:Double){
    def deposit(amount:Double):Unit={
        require(amount>0,"Deposite amount should be positive")
        balance+=amount
        println(s"Deposited Rs.${amount}. Current balance: Rs.${balance}")
    }

    def withdraw(amount:Double):Unit={
        require(amount>0,"Withdrawing amount should be positive")
        if(amount>balance){
            println("Insufficient funds")
          
        }else{
            balance-=amount
            println(s"Withdrew Rs.${amount}. Current balance: Rs.${balance}")
        }
    }

    def transfer(amount:Double,toAccount: Account):Unit={
        require(amount>0,"Transfer amount should be positive")
        if(amount>balance){
            println("Insufficient funds")
          
        }else{
            this.withdraw(amount)
            toAccount.deposit((amount))
           
            println(s"Transferred Rs.${amount} to the target account. Your current balance: Rs.${balance}")
        }
    }

      def applyInterest(): Unit = {
        if (balance > 0) {
           balance += balance * 0.05 
           } else {
          balance += balance * 0.1 
        }
       }

    override def toString: String = s"Account(balance: Rs.${balance})"
}


class Bank(var accounts: List[Account]) {

  
  def accountsWithNegativeBalances: List[Account] = {
    accounts.filter(account => account.balance < 0)
  }

  
  def totalBalance: Double = {
    accounts.map(_.balance).sum
  }

  
  def applyInterestToAll(): Unit = {
    accounts.foreach(_.applyInterest())
  }
}

object q4 extends App {
  
  val account1 = new Account(500.0)
  val account2 = new Account(-200.0)
  val account3 = new Account(1000.0)
  val account4 = new Account(-50.0)  

  val bank = new Bank(List(account1, account2, account3, account4))
 
  println("Accounts with negative balances:")
  bank.accountsWithNegativeBalances.foreach(println)
  
  println(s"Total balance of all accounts: Rs.${bank.totalBalance}")

  bank.applyInterestToAll()

  println("Final account balances after applying interest:")
  bank.accounts.foreach(println)
}