package acuario

open class Acuario (open var largo: Int = 100, open var ancho: Int = 20, open var alto:Int = 40) {

    open val forma = "rectángulo"

    init {
        println("Inicializado acuario")
    }

    constructor(numeroDePeces: Int) : this() {

        val tanque = numeroDePeces * 2000 * 1.1

        alto = (tanque / (largo / ancho)).toInt()

    }

    open var volumen: Int // "open" significa que peude ser usado por otras
        get() = alto * largo * ancho / 1000 //imprimir volumen
        set(valor) {
            alto = (valor * 1000) / (ancho * largo)
        }

    fun imprimirTamano() {
        println(forma)
        println("Ancho: $ancho cm " +
                "Largo: $largo cm " +
                "Alto: $alto cm ")
        println("Volumen: $volumen l Agua: $agua l (${agua/volumen*100.0}% lleno)")
    }


    open var agua: Double = 0.0
        get() = volumen * 0.9

}
