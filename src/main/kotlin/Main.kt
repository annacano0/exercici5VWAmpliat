fun main(){
    missatgeBenvolguda()

    println(BLACK_BOLD+"Sel·leccioni una opció:"+RESET+"\n1-Volkswagen Grand California\n2-Volkswagen Grand California Camper Full Equip")
    val cotxeUsuari=llegirInt(1, 2)

    println("Introdueixi els kilometres del vehicle (Ex: 0,00)")
    val kilometresCotxe=llegirDouble(0)

    println("Introdueixi quants kilometres tenen els pneumatics (Ex: 0)")
    val estatPneumatics=llegirLong(0)

    println("Te portabicis? (Si/No)")
    val portabicis=tePortabicis()

    println("Quants anys te el vehicle?")
    val anysVehicle=llegirInt(0,100)

    val preuBase=calcularPreuBase(cotxeUsuari)
    val preuFinal=calcularPreuFinal(kilometresCotxe,estatPneumatics,preuBase,portabicis, anysVehicle)

    missatgePreuFinal(preuFinal)
}
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
