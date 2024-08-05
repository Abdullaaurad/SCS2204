object B3{
    def filterPrime(list :List[Int]):List[Int]={
        var k = list.filter(num =>
            var prime:Boolean = true
            if (num<=1){
                prime = false
            }
            var i:Int = 2
            while(i<num){
                if(num%i == 0){
                    prime = false
                }
                i+=1
            }
            prime
        )
        return k
    }

    def printlist (list:List[Int]):Unit={
        print ("Output = [ ")
        list.foreach(num => print(s"$num "))
        print ("]")
    }
    
    def main(args: Array[String]):Unit = {
        var list = List(1,2,3,4,5,6,7,8,9,10)
        list = filterPrime (list)
        printlist(list)
    }
}