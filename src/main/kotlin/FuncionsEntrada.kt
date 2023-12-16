import java.util.*

//conte les funcions:
/*
-llegirInt
-llegirLong
-llegirDouble


*/
fun llegirInt(pMin:Int,pMax:Int, pMessError:String):Int{
    val scanner= Scanner(System.`in`)
    var inputCorrecte=true
    var inputUsuari=0
    do {
        if (scanner.hasNextInt()){
            inputCorrecte=true
            inputUsuari=scanner.nextInt()
            if (inputUsuari<=pMin||inputUsuari>=pMax) inputCorrecte=false
        }else{
            println(pMessError)
            inputCorrecte=false
        }
        scanner.next()
    }while(!inputCorrecte)
    return inputUsuari
}

fun llegirLong(pMin:Int,pMessError:String):Long{
    val scanner= Scanner(System.`in`)
    var inputCorrecte:Boolean
    var inputUsuari:Long=100
    do {
        if (scanner.hasNextLong()){
            inputCorrecte=true
            inputUsuari=scanner.nextLong()
            if (inputUsuari<=pMin) inputCorrecte=false
        }else{
            println(pMessError)
            inputCorrecte=false
        }
        scanner.next()
    }while(!inputCorrecte)
    return inputUsuari
}

fun llegirDouble(pMin:Int,pMessError:String):Double{
    val scanner= Scanner(System.`in`)
    var inputCorrecte:Boolean
    var inputUsuari:Double=100.00
    do {
        if (scanner.hasNextDouble()){
            inputCorrecte=true
            inputUsuari=scanner.nextDouble()
            if (inputUsuari<=pMin) inputCorrecte=false
        }else{
            println(pMessError)
            inputCorrecte=false
        }
        scanner.next()
    }while(!inputCorrecte)
    return inputUsuari
}