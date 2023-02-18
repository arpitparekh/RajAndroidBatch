import kotlin.system.exitProcess

fun main() {

    while(true) {   // infinite

        println("Please Enter Value")
        val x = readln().toInt()
        println("Please Another Value")
        val y = readln().toInt()

        println("Please Enter + - / * to perform operation")

        when (readlnOrNull()) {

            "+" -> println("sum is ${x + y}")   // $x  // {x*10+y}
            "-" -> println("sub is ${x - y}")
            "/" -> println("div is ${x / y}")
            "*" -> println("mul is ${x * y}")
            else -> println("Go away and get lost")
        }

        println("please enter 1 to continue and 0 to exit")

        val number = readln().toInt()

        if(number==0){
            exitProcess(0)
        }
    }
}