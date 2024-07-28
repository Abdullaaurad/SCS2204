object L3{
    def TotalSalary(x:Int,y:Int):Double ={
        var tax:Double = 0.12;
        var Total:Double = x*250;
        Total += y*85;
        Total = (Total*(1-tax));
        return Total;
    }
    def main(args:Array[String]):Unit={
        println("Take home salary ="+TotalSalary(40,30));
    }
}