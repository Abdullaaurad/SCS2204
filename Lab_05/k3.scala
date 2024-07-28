object k3 {
    def Fibonacci(n: Int): Int = {
        if (n == 0){return 0}
        else if (n == 1) {return 1}
        else Fibonacci(n - 1) + Fibonacci(n - 2)
    }

    def loop(i: Int,n: Int): Unit = {
        if (i <= n) {
            print(s"${Fibonacci(i)} ")
            loop(i + 1,n)
        }
    }

    def printFibonacciNumbers(n: Int): Unit = {
        loop(0,n)
    }

    def main(args: Array[String]): Unit = {
        printFibonacciNumbers(10)
    }
}
