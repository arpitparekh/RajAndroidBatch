fun main() {

    // when  // conditional statement

    // switch

    val ch : Char = 'c'

    when(ch){

        'a'-> println("character is a")
        'b'-> println("character is b")
        'c'-> println("character is c")
        else-> println("nothing found")
    }

    val number = 12

    when(number){

        12->println("number is 12")
        13->println("number is 13")
        else->println("number not found")

    }

    ////////////////////////////////////////////


    // double dot operator  //    ..

    // in //

    // not // !in

    var height = 175.5f

    when(height){

        !in 50f .. 89f-> println("small")
        in 90.0f .. 100.0f -> println("below average")
        in 101.0f .. 200f -> println("tall")
        in 200f .. 500f -> println("very tall")
    }

    val weight = 45.5

    when(weight){
        23.4,45.6,45.5-> println("average weight")
    }

    // is  // type checking operator

    val n  : Int = 45

//    when(n){
//
//        is Int -> println("int")
//        is Float -> println("float")
//        is Boolean -> println("double")
//    }




}