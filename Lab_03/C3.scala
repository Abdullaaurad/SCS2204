object C3{

    def Average(n1:Int , n2:Int):Float={
        var sum:Double = n1+n2;
        return (sum/2).toFloat;
    }

    def main(Args: Array[String]):Unit={
        var num1:Int = 5;
        var num2:Int = 6;
        var num3:Double = Average(num1,num2);
        val roundedNum3 = f"$num3%.2f".toFloat
        print(s"Average of $num1 and $num2 = $roundedNum3");
    }
}