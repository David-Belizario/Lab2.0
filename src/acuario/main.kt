package acuario

fun construirAcuario() {

    println("Acuario 1")
    val miAcuario = Acuario() //instanciando una clase
    miAcuario.alto = 60 //cambiando alto del acuario
    miAcuario.imprimirTamano() //llamando metodo
    println()

    println("Acuario 4")
    val miAcuario4 = Acuario(numeroDePeces = 45)
        miAcuario4.imprimirTamano()
        println()
        miAcuario4.volumen = 469
        miAcuario4.imprimirTamano()
        println()

    println("Acuario 8")
    val acuario8 = Acuario(largo = 25, ancho = 25, alto = 40)
    acuario8.imprimirTamano()
    println()

    println("Acuario 7")
    val miAcuario7 = Acuario(alto = 25, largo = 22, ancho = 40)
    miAcuario7.imprimirTamano()
    println()

    println("TanqueTorre")
    val miTorre = TanqueTorre(alto = 40, diametro = 25)
    miTorre.imprimirTamano()
    println()

}

fun main() {
    construirAcuario()
}