import java.util.*

fun missatgeError(){
    println(RED_BOLD+"Valor incorrecte, torni a intentar"+RESET)
}
fun llegirInt(pMin:Int,pMax:Int):Int{
    val scanner= Scanner(System.`in`)
    var inputCorrecte=true
    var inputUsuari=0
    do {
        if (scanner.hasNextInt()){
            inputCorrecte=true
            inputUsuari=scanner.nextInt()
            if (inputUsuari<pMin||inputUsuari>pMax) {
                missatgeError()
                inputCorrecte=false
            }
        }else{
            missatgeError()
            inputCorrecte=false
        }
        scanner.nextLine()
    }while(!inputCorrecte)
    return inputUsuari
}

fun readDouble(pMessageIn: String
               , pMessageErrorDT: String
               , pMessageErrorDV: String
               , pMin: Double
):Double{
    val scanner= Scanner(System.`in`)
    var inputCorrecte:Boolean=true
    var inputUsuari:Double=100.00
    do {
        if (scanner.hasNextDouble()){
            inputCorrecte=true
            inputUsuari=scanner.nextDouble()
            if (inputUsuari<pMin){
                inputCorrecte=false
                println(YELLOW_BOLD_BRIGHT + "WARNING: " + pMessageErrorDV + RESET)
            }
        }else{
            scanner.nextLine()
            println(RED_BACKGROUND_BRIGHT + "ERROR: " + pMessageErrorDT + RESET)
            inputCorrecte=false
        }
    }while(!inputCorrecte)
    return inputUsuari
}

