object Main {
  def main(args: Array[String]) = {

    // Question 3
    val acc1 = new Account(1, 45.5);
    val acc2 = new Account(2, 20);

    println(acc1);
    println(acc2);

    acc1.transfer(acc2, 25.5);

    println(acc1);
    println(acc2);

    //  Question 4
    val bank: List[Account] = List(
      new Account(1, 300.3),
      new Account(2, -45.1),
      new Account(3, 23.6),
      new Account(1, 100.7)
    );

    val findNegativeAccounts = (b: List[Account]) => b.filter(_.balance < 0);
    println(findNegativeAccounts(bank));

    val findSum = (b: List[Account]) =>
      b.map(acc => acc.balance).reduce((total, acc) => total + acc)
    println(findSum(bank));

    val addInterest = (b: List[Account]) =>
      b.foreach(acc => {
        if (acc.balance > 0) acc.deposite(acc.balance * 0.05)
        else acc.deposite(acc.balance * 0.1)
      })

    addInterest(bank);
    println(bank);

  }
}

class Account(a: Int, b: Double) {
  val accountNumber = a
  var balance = b

  def transfer(that: Account, amount: Double): Unit = {
    this.balance -= amount
    that.balance += amount
  }

  def deposite(amount: Double): Unit = {
    this.balance += amount
  }

  override def toString(): String = {
    accountNumber + " => " + balance
  }
}
