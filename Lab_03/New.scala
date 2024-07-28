object New{
    def Odd(n:Int):Boolean = {
        n%2==1;
    }

    def Total(n:List[Int]):Int ={
        var filtered = n.filter(Odd)
        var k = n.length;
        var sum = 0;
        for(i <- filtered){
            sum=sum+i
        }
        return sum;
    }

    def main (args: Array[String]):Unit={
        var list = List(1,2,3,4,5,6);
        var l = Total(list);
        print(s"The sum of all Odd numbers = $l");
    }
}