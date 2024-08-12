object D1{

    def Encrypt(str: String, x: Int): String = {
        var n = str.length
        var i = 0
        var result = ""

        while (i < n) {
            var l: Int = str.charAt(i).toInt
            l= l + x
            result = result + l.toChar
            i = i + 1
        }        
        println(s"Encrypted string =${result}")
        result
    }

    def Decrypt(str:String, x:Int):String = {
        var n = str.length
        var i = 0
        var result = ""

        while (i < n) {
            var l: Int = str.charAt(i).toInt
            l = l - x
            result = result + l.toChar
            i = i + 1
        }        
        println(s"Decrypted string = ${result}")
        result
    }

    def main(args: Array[String]):Unit= {
        print ("Enter string =")
        var str = scala.io.StdIn.readLine()
        str = Encrypt(str,5)
        str = Decrypt(str,5)
    }
}