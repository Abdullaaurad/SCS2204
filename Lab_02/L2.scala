object L2{
    def main(args:Array[String]):Unit = {
        var a:Int = 2;
        var b:Int = 3;
        var c:Int = 4;
        var d:Int = 5;
        var k:Float = 4.3f;
        var g:Float = 5.6f;

        b-=1;
        println("(--b)*a+c*(d--) ="+(b*a+c*d));
        d-=1;

        println("a++ ="+ a);
        a+=1;

        println("-2*(g-k)+c ="+ ((-2)*(g-k)+c));

        println("c=(c++) ="+c);
        c+=1;
        
        c=c*a;
        println("c=(++c)*(a++) ="+c);
        a=a+1;
    }
}