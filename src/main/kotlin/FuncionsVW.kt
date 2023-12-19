import kotlin.math.round

fun calcularPreuBase(pUserCar:Int):Int{
    var preu= 73490
    if (pUserCar==2){
        preu+=20000
    }
    return preu
}
fun tePortabicis(pMessError:String):Boolean{
    var tePortabicis=false
    val inputUsuari=llegirStringYesNo(pMessError)
    if (inputUsuari=="si") tePortabicis=true
    return tePortabicis
}


fun calcularPreuFinal(pKilometres:Double, pEstatPneumatics:Long, pPreuBase:Int, pPortabicis:Boolean,pAnys:Int):Double{
    val devaluacio=calculPerdua(pKilometres,pEstatPneumatics,pPortabicis,pAnys)
    val preuFinal=pPreuBase.toDouble()-devaluacio
    return ((round(preuFinal*100)/100))
}
fun calculPerdua (kilometros: Double, pPneumatics:Long,pPortabicis: Boolean,pAnys:Int): Double {
    var perdua:Double = 0.0

    for (i in 1..kilometros.toInt()) {
        if (pAnys in 6..10)perdua+=0.00002
        else if (pAnys>10) perdua+= 0.00004
        else perdua += 0.00001
    }
    if (pPneumatics>=10000)perdua+=300
    else if(pPneumatics>5000)perdua+=200
    if (pPortabicis)perdua-=250
    return perdua
}