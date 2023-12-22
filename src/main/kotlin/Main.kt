/**
 * This function prints asciiArt() (drawing of a cat), a welcome message and brief description of the program
 * @author annacano0
 * @since 22/12/2023
 */
fun missatgeBenvolguda(){
    asciiArt()
    println(PURPLE_BOLD_BRIGHT+"-----------------------------------")
    println("           ¡Benvolguda!            ")
    println("-----------------------------------"+RESET)
    println(PURPLE_BRIGHT+"Aquesta és una aplicació per calcular preus de revenda"+RESET)
    println("")
}

/**
 * This function prints a goodbye message once the program ends
 * @author annacano0
 * @since 22/12/2023
 */
fun missatgeAdeu(){
    println("")
    println(PURPLE_BOLD_BRIGHT+"-----------------------------------")
    println("              ¡Adeu!               ")
    println("-----------------------------------"+RESET)

}

/**
 * This function prints the final price with decoration and color
 * @author annacano0
 * @param pPreuFinal final revenue price of the vehicle
 * @since 22/12/2023
 */
fun missatgePreuFinal(pPreuFinal:Double){

    println(PURPLE_BOLD_BRIGHT+"\nPREU FINAL:")
    println("-----------------------------------\n" +
            "            "+pPreuFinal+"€        \n" +
            "-----------------------------------"+RESET)
    println("")
}


/**
 * This function collects all the variables and methods used to calculate the revenue price
 * @author annacano0
 * @since 22/12/2023
 * @return preuFinal final price of revenue of vehicle
 */
fun execucioPrograma():Double{
    //we ask user (trough readInt()) type of car and validate input. Once validated, it's saved in cotxeUsuari
    val cotxeUsuari=readInt(BLACK_BOLD_BRIGHT+"Seleccioni una opció:\n"+RESET + "1-Volkswagen Grand California\n" + "2-Volkswagen Grand California Camper Full Equip\n",
        "Tipus de dada incorrecte, torni a intentar", "El valor inserit no és una opció, torni a intentar",
        1, 2)

    //we ask user (trough readDouble()) the km of car and validate input. Once validated, it's saved in kilometresCotxe
    val kilometresCotxe=readDouble("Introdueixi els quilometres del vehicle (Ex: 0,00)",
        "Tipus de dada incorrecte, torni a intentar", "El valor inserit no és una opció, torni a intentar",
        0.00, )

    //we ask user (trough readLong()) the km of car and validate input. Once validated, it's saved in kilometresCotxe
    val estatPneumatics=readLong("Introdueixi quants kilometres tenen els pneumatics (Ex: 0)",
        "Tipus de dada incorrecte, torni a intentar", "El valor inserit no és una opció, torni a intentar",
        0)

    //we ask user (trough tePortabicis()) if car has bicycle rack. Once input is validated, we save the Boolean in portabicis
    val portabicis=tePortabicis("Té porta-bicis? (Si/No)")


    //we ask user (trough readInt()) the years of car and validate input. Once validated, it's stored in anysVehicle
    val anysVehicle=readInt("Quants anys té el vehicle?",
        "Tipus de dada incorrecte, torni a intentar", "El valor inserit no és una opció, torni a intentar",0,200)

    //we calculate the base price with the model of car
    val preuBase=calcularPreuBase(cotxeUsuari)
    //we calculate the price variation with the other data collected and obtain the final price of vehicle
    val preuFinal=calcularPreuFinal(kilometresCotxe,estatPneumatics,preuBase,portabicis, anysVehicle)

    return preuFinal
}

/**
 * Main function executes all the program and iterates if user says yes to calculate another price.
 * @author annacano0
 * @since 22/12/2023
 */
fun main(){
   do{
       missatgeBenvolguda() //prints the welcome message
       missatgePreuFinal(execucioPrograma()) //missatgePreuFinal() calls execucioPrograma(), so all of the program is executed and returns the final price to print in missatgePreuFinal
       //ask user if they want to calculate another vehicle
       val repetirPrograma=readStringYesNo("Vol calcular el preu d'un altre vehicle? (Si/No)",
           "Tipus de dada incorrecte, torni a intentar",
           "El valor no és si/no, torni a intentar")
   }while (repetirPrograma=="si")
   //when exiting program, the goodbye message is printed
   missatgeAdeu()
}
