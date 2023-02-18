fun main() {

    // reverse

    // palindrome number  // 12321  // 121  // 212  // 123454321

    var a = readln().toInt()  // 1234
    var reverse = 0
    val originalValue = a

    if(a!=null){

        // 1234
        // 1234 / 10 = 123
        // 123 / 10 = 12
        // 12 / 10 = 1
        // 1 / 10 = 0

        while(a != 0){   // 1234  // 123 // 12 // 1

           val lastDigit = a%10  // 4  / 3  / 2  / 1

            reverse = reverse*10 + lastDigit  // 4  //  43 // 432  // 4321

            a = a/10  // 123 // 12 / 1 / 0

        }
        println(reverse)
        if(reverse==originalValue){
            println("number is palindrome")
        }else{
            println("number is not palindrome")
        }

    }


}