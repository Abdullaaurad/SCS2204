object B1{

    def filterEvenNumbers(list :List[Int]):List[Int]={
        var k = list.filter(num => num%2 ==0)
        return k
    }

    def printlist (list:List[Int]):Unit={
        print ("Output = [ ")
        list.foreach(num => print(s"$num "))
        print ("]")
    }
    
    def main(args: Array[String]):Unit = {
        var list = List(1,2,3,4,5,6,7,8,9,10)
        list = filterEvenNumbers (list)
        printlist(list)
    }
}