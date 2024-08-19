object E1{

    def interest (money:Int):Double={
        val interestValue = (money:Int) => {
            if(money > 2000000){
                money*0.065
            }
            else if(money > 200000){
                money*0.035
            }
            else if(money > 20000){
                money*0.04
            }
            else if(money > 0){
                money*0.02
            }
            else{
                0.0
            }
        }
        interestValue(money)
    }

    def main(args: Array[String]):Unit = {
        print("Enter the deposit =")
        var money = scala.io.StdIn.readInt()
        var profit = interest(money)
        val roundedProfit = BigDecimal(profit).setScale(4, BigDecimal.RoundingMode.HALF_UP).toDouble
        println(s"The profit = $roundedProfit")
    }
}