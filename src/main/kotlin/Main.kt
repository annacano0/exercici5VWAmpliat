
fun missatgeBenvolguda(){
    asciiArt()
    println(PURPLE_BOLD_BRIGHT+"-----------------------------------")
    println("           ¡Benvolguda!            ")
    println("-----------------------------------"+RESET)
    println(PURPLE_BRIGHT+"Aquesta es una aplicació per calcular preus de revenda"+RESET)
    println("")
}
fun missatgePreuFinal(pPreuFinal:Double){

    println(PURPLE_BOLD_BRIGHT+"\nPREU FINAL:")
    println("-----------------------------------\n" +
            "            "+pPreuFinal+"€        \n" +
            "-----------------------------------"+RESET)
}

fun execucioPrograma():Double{
    val cotxeUsuari=readInt("Sel·leccioni una opció:\n1-Volkswagen Grand California\\n2-Volkswagen Grand California Camper Full Equip",
        "Tipus de dada incorrecte, torni a intentar", "El valor inserit no es una opcio, torni a intentar",
        1, 2)

    val kilometresCotxe=readDouble("Introdueixi els quilometres del vehicle (Ex: 0,00)",
        "Tipus de dada incorrecte, torni a intentar", "El valor inserit no es una opcio, torni a intentar",
        0.00, )

    val estatPneumatics=readLong("Introdueixi quants kilometres tenen els pneumatics (Ex: 0)",
        "Tipus de dada incorrecte, torni a intentar", "El valor inserit no es una opcio, torni a intentar",
        0)

    val portabicis=tePortabicis("Te portabicis? (Si/No)")

    val anysVehicle=readInt("Quants anys te el vehicle?",
        "Tipus de dada incorrecte, torni a intentar", "El valor inserit no es una opcio, torni a intentar",0,100)

    val preuBase=calcularPreuBase(cotxeUsuari)
    val preuFinal=calcularPreuFinal(kilometresCotxe,estatPneumatics,preuBase,portabicis, anysVehicle)

    return preuFinal
}

fun main(){
    missatgeBenvolguda()
    missatgePreuFinal(execucioPrograma())
}
