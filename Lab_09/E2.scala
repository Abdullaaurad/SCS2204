object E2 {

    def numbers(num: Int): String = {
        num match {
            case n if (n<=0) => "Number is negative or zero"
            case n if (n%2==0) => "Number is even"
            case _ => "Number is odd"
        }
    }

    def main(args: Array[String]): Unit = {
        val k = args(0).toInt
        println(numbers(k))
    }
}
