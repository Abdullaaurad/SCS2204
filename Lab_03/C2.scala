object C2{

    def greater(str:String):Boolean={
        str.length>5;
    }
    def main(args: Array[String]):Unit={
        var StrArr = List("Apple","Bus","Dog","Mobile","Bottle","T-shirt")
        StrArr = StrArr.filter(greater);
        print(StrArr);
    }
}