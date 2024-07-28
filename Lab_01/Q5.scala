object Q5{
    def run(x:Int, y:Int):Int={
        return x*y;
    }
    def TotalTime(D1:Int, D2:Int, D3:Int):Int={
        return (run(D1,8) + run(D2,7) + run(D3,8));
    }
    def main(args: Array[String]): Unit = {
        val T = TotalTime(2,3,2);
        println("Total time  taken ="+T);
    }
}