object caesarCipher{
    //alphabet is english letters
    val alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ"

    //Encrypt function 
    val Encrypt_Function = (c:Char,key:Int,a:String) => a((a.indexOf(c.toUpper)+key)%a.size)
    val Decrypt_Function = (c:Char,key:Int,a:String) => a((a.indexOf(c.toUpper)-key)%a.size)

    val cipher = (algo:(Char,Int,String)=>Char, s:String,key:Int,a:String) => s.map(algo(_,key,a))

   def main(args: Array[String]): Unit = {

    //driver code for encryting and decrypting my name 
    var s = "tharindu"
    val encrypted_text =cipher(Encrypt_Function,s,5,alphabet)
    val decrypted_text =cipher(Decrypt_Function,encrypted_text,5,alphabet);

    println(encrypted_text);
    println(decrypted_text);
   }
}