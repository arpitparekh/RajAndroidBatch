// OOPC

// Functional Programming

// 2 types function

// user define
// Kotlin library function

// println()
// readLine()
// pow()
// sqrt()
// plus()

fun main() {
    val n = 23
    val m = 67

    val sum = n + m

    display()  // function calling
    display()
    display()
    display()

    calculation(10,12.0)
    calculation(15,123.0)
    calculation(78,67.0)
    calculation(90,120.0)

    // Unit means void in kotlin
    val result = 12 + rajKaFunction()
    println(result)

    println(holiday("Raj","Sampat"))


}

// user define

// function -> block of code that run anytime // any number of time // when we called it

fun display(){
    println("this is display function")
}
fun calculation(a : Int,b : Double){ // parameters
    // a = 10
    // b = 12
    println("sum is ${a+b}")
}
fun rajKaFunction() : Int{
    println("this is raj function")
    return 56
}

fun holiday(firstName : String,lastName : String) : String{
    return "$firstName $lastName"
}






