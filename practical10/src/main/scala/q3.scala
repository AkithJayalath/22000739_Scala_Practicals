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
}

object q3 extends App {
 
  val account1 = new Account(1000.0)
  val account2 = new Account(400.0)

  
  account1.deposit(1000.0) 
  account1.withdraw(500.0) 
  account1.transfer(700.0, account2) 

 
  println(s"Account 1 final balance: Rs.${account1.balance}")
  println(s"Account 2 final balance: Rs.${account2.balance}")
}