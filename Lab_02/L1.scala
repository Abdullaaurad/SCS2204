object L1{
    def main(args: Array[String]):Unit={
        var j,i,k = 2;
        var m,n = 5;
        var f = 12.0f;
        var g = 4.0f;
        var c = 'X';

        println("k+12*m ="+(k + 12 * m));       //same as Java
        println("m/j ="+(m/j));                 //same as Java
        println("n%j ="+(n%j));                 //same as Java 
        println("m/j*j ="+(m/j*j));             //same as Java
        println("f+10*5+g ="+(f+10*5+g));       //same as Java
        i+=1;
        println("++i*n ="+(i*n));               //pre increment operator isn't defined in scala
    }                                           //In java we can run code directly
}