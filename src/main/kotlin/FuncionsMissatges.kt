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

