fun main() {
    isPrime(12)
    isPrime(56)
    isPrime(35)
    isPrime(99)
    isPrime(23)
    isPrime(67)
    isPrime(readln().toInt())
}

fun isPrime(number : Int){

    // number
    var flag = false

    for(i in 2 until number){

        if(number%i==0){
            flag = true  // prime nathi
            break
        }
    }

    if(!flag){
        println("$number is prime")
    }else{
        println("$number is not prime")
    }
    flag = false
}