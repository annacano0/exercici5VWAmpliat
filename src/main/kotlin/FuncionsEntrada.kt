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

fun llegirLong(pMin:Int):Long{
    val scanner= Scanner(System.`in`)
    var inputCorrecte:Boolean
    var inputUsuari:Long=100
    do {
        if (scanner.hasNextLong()){
            inputCorrecte=true
            inputUsuari=scanner.nextLong()
            if (inputUsuari<=pMin){
                missatgeError()
                inputCorrecte=false
            }
        }else{
            missatgeError()
            inputCorrecte=false
            scanner.nextLine()
        }
    }while(!inputCorrecte)
    return inputUsuari
}

fun llegirDouble(pMin:Int):Double{
    val scanner= Scanner(System.`in`)
    var inputCorrecte:Boolean=true
    var inputUsuari:Double=100.00
    do {
        if (scanner.hasNextDouble()){
            inputCorrecte=true
            inputUsuari=scanner.nextDouble()
            if (inputUsuari<pMin){
                inputCorrecte=false
                missatgeError()
            }
        }else{
            scanner.nextLine()
            missatgeError()
            inputCorrecte=false
        }
    }while(!inputCorrecte)
    return inputUsuari
}

fun llegirStringYesNo():String{
    val scanner=Scanner(System.`in`)
    var inputCorrecte:Boolean=true
    var inputUsuari=""
    do {
        if (scanner.hasNextLine()){
            inputCorrecte=true
            inputUsuari=scanner.nextLine().lowercase()
            if (inputUsuari!="si"&&inputUsuari!="no"){
                missatgeError()
                inputCorrecte=false
            }
        }else{
            scanner.nextLine()
            missatgeError()
            inputCorrecte=false
        }
    }while(!inputCorrecte)
    return inputUsuari
}