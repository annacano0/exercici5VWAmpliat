import kotlin.math.round

/**
 * This method calculates the base price depending on user's car, using the option chosen by user
 * @author annacano0
 * @since 22/12/2023
 * @param pUserCar car option chosen by user
 * @return preu Output Value
 */
fun calcularPreuBase(pUserCar:Int):Int{
    var preu= 73490
    if (pUserCar==2){
        preu+=20000
    }
    return preu
}

/**
 * This method aks a question (with answer Si/No) and returns Boolean depending on user answer
 * @author annacano0
 * @since 22/12/2023
 * @param pMessageIn Input message to be shown to the user in mathod readStringYesNo
 * @return tePortabicis Output with Boolean value
 */
fun tePortabicis(pMessageIn:String):Boolean{
    var tePortabicis=false
    val inputUsuari=readStringYesNo(pMessageIn,"El tipus de dada introduit no es correcte, torni a provar", "El valor no es si/no, torni a provar")
    if (inputUsuari=="si") tePortabicis=true
    return tePortabicis
}

 /**
 *This method calculates final price using the data about de vehicle condition collected on other methods
 * @author annacano0
 * @since 22/12/2023
 * @param pKilometres Value of kilometers that the vehicle has
 * @param pEstatPneumatics value of kilometers tha the tires have
 * @param pPreuBase value of initial revenue price for the vehicle (no devaluation applied)
 * @param pPortabicis Boolean that indicates if vehicle has bicycle racks
 * @param pAnys Value of years the vehicle has
 * @return preuFinal Output rounded to two decimals
 */
fun calcularPreuFinal(pKilometres:Double, pEstatPneumatics:Long, pPreuBase:Int, pPortabicis:Boolean,pAnys:Int):Double{
    val devaluacio=calculPerdua(pKilometres,pEstatPneumatics,pPortabicis,pAnys)//This variable uses method calculPerdua() to sum up all the devaluation of the vehicle
    val preuFinal=pPreuBase.toDouble()-devaluacio//We substract all the devaluation to the pPreuBase(Int) and transform to Double
    return ((round(preuFinal*100)/100))
}

/**
 *This method calculates the devaluation of de vehicle by kilometers, kilometers of the tires, bicycle racks, and antiquity
 * @author annacano0
 * @since 22/12/2023
 * @param pKilometres Value of kilometers that the vehicle has
 * @param pPneumatics value of kilometers tha the tires have
 * @param pPortabicis Boolean that indicates if vehicle has bicicle racks
 * @param pAnys Value of years the vehicle has
 * @return perdua Output that returns the devaluation of the vehicle
 */
fun calculPerdua (kilometros: Double, pPneumatics:Long,pPortabicis: Boolean,pAnys:Int): Double {
    var perdua:Double = 0.0

    for (i in 1..kilometros.toInt()) {
        if (pAnys in 6..10)perdua+=0.00002//if vehicle is older than 6 years, devaluation doubles
        else if (pAnys>10) perdua+= 0.00004//if vehicle is older than 10 years, devaluation quadruples
        else perdua += 0.00001//is vehicle has less than 6 years, devaluation is less
    }
    if (pPneumatics>=10000)perdua+=300
    else if(pPneumatics>5000)perdua+=200
    if (pPortabicis)perdua-=250//if the vehicle has bicycle racks, the value of the vehicle increments 250€, so the devaluation diminishes 250€
    return perdua
}
