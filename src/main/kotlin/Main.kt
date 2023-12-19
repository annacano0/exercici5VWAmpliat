fun main(){
    //missatge d'error que printar dins dels metodes
    val messageError="Valor incorrecte, torni a intentar"

    //pregunta a l'usuari si te la Volkswagen Grand California normal o la Camper Full Equip
    println("Sel·leccioni una opció:\n1-Volkswagen Grand California\n2-Volkswagen Grand California Camper Full Equip")
    val cotxeUsuari=llegirInt(1, 2,messageError)

    println("Introdueixi els kilometres del vehicle (Ex: 0,00)")
    val kilometresCotxe=llegirDouble(0, messageError)

    //pregunta l'estat dels pneumatics
    println("Introdueixi quants kilometres tenen els pneumatics (Ex: 0)")
    val estatPneumatics=llegirLong(0,messageError)

    println("Te portabicis? (Si/No)")
    val portabicis=tePortabicis(messageError)

    println("Quants anys te el vehicle?")
    val anysVehicle=llegirInt(0,100,messageError)

    //calcula el preu inicial segons model
    val preuBase=calcularPreuBase(cotxeUsuari)
    val preuFinal=calcularPreuFinal(kilometresCotxe,estatPneumatics,preuBase,portabicis, anysVehicle)

    print("El preu final es: "+preuFinal+"€")
}
