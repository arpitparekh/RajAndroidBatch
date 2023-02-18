fun main() {

//    val email = "arpitparekh9@gmail.com"

    val str = readlnOrNull()

    val number = 23

    println(number.toChar())

    val name = "Raj"    // string is a character array

    println(name)

    if (str != null  && str.length==1) {

        for(i in str){

            if(i in 'a'..'z' || i in 'A'..'Z'){
//                println(i)
            }else if(i in '0'..'9'){
//                println(i)
            }else{
                println(i)
            }
        }
    }
}



// in 1..10
// !in 1..20 ->{
//}