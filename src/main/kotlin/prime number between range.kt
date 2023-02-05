fun main() {

    // prime number

    var r1 = readLine()?.toInt()
    var r2 = readLine()?.toInt()

    var flag = false

    if (r1 != null && r2 !=null) {

        for(number in r1..r2){

            // 20.. 50  // 21
//            number = 20 // 21 // 22

            // 20

            // 2..19

            for(i in 2..number-1){

                if(number%i!=0){

                    println()

                }
            }


            // 123 % 10 == 3
            // 4545454 % 10 = 4

            if(flag==false){

                // number
                if(number%10==7){

                    println(number)
                }

            }

            flag = false

        }
    }

}