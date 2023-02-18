fun main() {

    val n1 = readln().toInt()  //  20
    val n2 = readln().toInt()  // 100

    var flag = true

    for(number in n1..n2){


        // 20 // 21 // ....  // 100

        // 20 // 21  // 22

        for(i in 2..number-1){

            // 2 .. 19
            
            if(number%i==0){

                flag = false
                break
            }
        }

        if(flag){
            println(number)
        }

        flag = true

    }


}