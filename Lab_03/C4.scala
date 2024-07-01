object C4{

    def even(i:Int):Boolean={
        i%2==0
    }

    def sum (list:List[Int]):Int={
        var Evens = list.filter(even);
        var sum:Int =0;                         //can use sum function too
        for (i <- Evens){
            sum=sum+i;
        }
        return sum;
    }
    def main(args:Array[String]):Unit={
        var list = List(1,2,3,4,5,6,7,8,9);
        var value:Int = sum(list);
        print(s"The sum of all even numbers in list =$value");
    }
}