object C1{

    def reverse2(str:String):Unit={
        var l:Int = str.length;
        if(l>0){
            print(str.charAt(l-1));
            reverse2(str.substring(0,l-1));
        }
    }
    def reverse(str:String,n:Int):Unit={
        if (n<=0){
            return
        }
        print(str.charAt(n-1))
        reverse(str,n-1)
    }

    def main(args: Array[String]):Unit={
        var str:String = "Abdulla Aurad";
        var l:Int = str.length;
        reverse(str,l);
        reverse2(str);
    }
}