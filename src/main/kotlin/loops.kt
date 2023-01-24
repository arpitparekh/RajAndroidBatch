fun main() {


    // while
    // do..while
    // for

    for(i in 0..10000){
        println(i)
    }
    for(ch in 'A'..'Z'){
        println(ch)
    }

    val name = "Raj Sampat"

    for(ch in name){
        println(ch)
    }

    val ch : Char = name[4]

    println(ch)

    ////////////////////////////////////// string functions

    val surname = name.split(" ")[1]

    println(surname)

    ///////////////////////////////////////

    var a = 1

    while(a<10){

        println(a)
        a++
    }

    var b = 30

    do{
        println(b)
        b++
    }while (b<10)
}