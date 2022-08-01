// Write a Scala program which defines a method named "toUpper" and it accepts a String as
// input parameter that is then formatted to upper case as output. Define another method named
// "toLower'' which accepts a String as input parameter and formats the input to lower case as
// output. Define another method named "formatNames" which also has an input String called
// "name". This method however has a parameter group which accepts a function with an input of
// type String and also outputs a String. This particular function will be used to apply the given
// format to the "name" input. You can use the test inputs for, say, "Benny", "Niroshan", "Saman"
// “Kumara”, and make sure that the output is as shown below.
// Output:
// BENNY
// NIroshan
// saman
// KumarA

object ScalaLab3_Question5 {
  def main(args: Array[String]) = {

    def toUpper(s: String): String = {
      s.toUpperCase()
    }

    def toLower(s: String): String = {
      s.toLowerCase()
    }

    def formatNames(
        name: String
    )(func: String => String)(Index: List[Int]): String = {
      var i = 0;
      var temp = "";
      while (i < name.length()) {
        if (Index.contains(i)) temp = temp + func(name.charAt(i).toString)
        else temp = temp + name.charAt(i).toString;
        i = i + 1
      }
      temp
    }

    println(formatNames("Benny")(toUpper(_))(List(0, 1, 2, 3, 4)))
    println(formatNames("Niroshan")(toUpper(_))(List(0, 1)))
    println(formatNames("Saman")(toLower(_))(List(0)))
    println(formatNames("Kumara")(toUpper(_))(List(0, 5)))

  }
}
