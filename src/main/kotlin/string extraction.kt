fun main() {

//    val email = "arpitparekh9@gmail.com"

    val str = readLine()

    if (str != null) {

        for(i in str){

            if(i in 'a'..'z' || i in 'A'..'Z'){
                println(i)
            }
        }

    }
}



// in 1..10
// !in 1..20 ->{
//}