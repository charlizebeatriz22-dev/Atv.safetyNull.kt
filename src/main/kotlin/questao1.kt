fun calcularDesconto(valor: Double, cupom: String?) {
    val resultadoFinal = when (cupom) {
        "PROMO10" -> valor - 10
        "PROMO20" -> valor - 20
        else -> valor
    }
    println("Valor a pagar: R$ $resultadoFinal")
}

fun main() {
    calcularDesconto(100.0, "PROMO10")
    calcularDesconto(100.0, "PROMO20")
    calcularDesconto(100.0, null)
}