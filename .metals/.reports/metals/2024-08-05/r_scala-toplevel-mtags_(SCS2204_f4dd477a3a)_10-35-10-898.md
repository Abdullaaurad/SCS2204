error id: file:///C:/Users/Abdulla/OneDrive/Desktop/Codes/SCS2204/Lab_07/B2.scala:[20..21) in Input.VirtualFile("file:///C:/Users/Abdulla/OneDrive/Desktop/Codes/SCS2204/Lab_07/B2.scala", "object B2{
    def (list :List[Int]):List[Int]={
        var k = list.filter(num => num%2 ==0)
        return k
    }
    
    def main(args: Array[String]):Unit = {
        var list = List(1,2,3,4,5,6,7,8,9,10)
        list = filterEvenNumbers (list)
        print(list)
    }
}")
file:///C:/Users/Abdulla/OneDrive/Desktop/Codes/SCS2204/Lab_07/B2.scala
file:///C:/Users/Abdulla/OneDrive/Desktop/Codes/SCS2204/Lab_07/B2.scala:2: error: expected identifier; obtained lparen
    def (list :List[Int]):List[Int]={
        ^
#### Short summary: 

expected identifier; obtained lparen