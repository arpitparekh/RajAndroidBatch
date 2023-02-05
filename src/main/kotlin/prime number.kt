fun main() {

    val number = readLine()!!.toInt()   // 5867

    // 45  // 5

    var flag = false

    if(number!=null){

        for(i in 2..number-1){

            // 2.. 5866

            if(number%i==0){
                flag = true
                break
            }
        }

        if(flag==true){
            println("not prime")
        }else{
            println("Prime")
        }
    }


}