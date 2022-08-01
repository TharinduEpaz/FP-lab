// Develop the function of interest. It consumes a deposit amount and produces the actual
// amount of interest that the money earns in a year. The bank pays a flat 2% for deposits
// of up to Rs. 20 000, a flat 4% per year for deposits of up to Rs. 200000, a flat 3.5% per
// year for deposits of up to Rs. 2000000, and a flat 6.5% for deposits of more than Rs.
// 200000.


object ScalaLab3_Question1{
     
     def main(args: Array[String]) = {  
        println(interest(200324));

    }

    def interest(amount: Int):Double = amount match {
        case x if amount<=20000=> amount*0.02;
        case x if amount<=200000 && amount>20000 => amount*0.04;
        case x if amount<=2000000 && amount>200000 => amount*0.035;
        case x if amount>2000000 => amount*0.065;
        case _ => 0;
  
}

}