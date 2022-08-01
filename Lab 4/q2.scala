// Write a program in PatternMatching, takes the integer input from the command line.
// Based on the input, write a code using match to print Negative/Zero is input 
// when input is less than or equal to 0.Print Even number is given when input is even, 
// and print Odd number is given when input is odd.

import scala.io.StdIn.readInt

object ScalaLab_Question2{
     def main(args: Array[String]) = {  
       val input = readInt()
       println(matchNumber(input));
    }

    def matchNumber(input:Int):String = input match {
        case x if x < 0 && x % 2 == 0 => "Negative\nEven";
        case x if x < 0 && x % 2 == -1 => "Negative\nOdd";
        case x if x > 0 && x % 2 == 0 => "Positive\nEven";
        case x if x > 0 && x % 2 == 1 => "Positive\nOdd";
        case x if x == 0 => "Zero";
        case _ => "ERROR"
    }
    
}