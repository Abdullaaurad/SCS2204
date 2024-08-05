object B2{
    def calculateSquare(list :List[Int]):List[Int]={
        var k = list.map(num => num*num)
        return k
    }

    def printlist (list:List[Int]):Unit={
        print ("Output = [ ")
        list.foreach(num => print(s"$num "))
        print ("]")
    }
    
    def main(args: Array[String]):Unit = {
        var list = List(1,2,3,4,5)
        list = calculateSquare (list)
        printlist(list)
    }
}