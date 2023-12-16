//conte les funcions
/*
- calcularPreuBase
-calcularPreuActual
*/
fun calcularPreuBase(pUserCar:Int):Int{
    var preu= 73490
    if (pUserCar==2){
        preu+=20000
    }
    return preu
}

fun calcularPreuFinal(pKilometres:Double, pEstatPneumatics:Long, pPreuBase:Int):Double{
    val devaluacio=calculPerdua(pKilometres,pEstatPneumatics)
    val preuFinal=pPreuBase.toDouble()-devaluacio
    return preuFinal
}

fun calculPerdua (kilometros: Double, pPneumatics:Long): Double {
    var perdua:Double = 0.0
    for (i in 1..kilometros.toInt()) {
        perdua += 0.00001
    }
    if (pPneumatics>=10000){
        perdua+=300
        println("resta 300")
    }else if(pPneumatics>5000){
        perdua+=200
        println("resta 200")
    }
    return perdua
}