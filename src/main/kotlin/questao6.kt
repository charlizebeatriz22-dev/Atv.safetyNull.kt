val calcularGorjeta: (Double?) -> Double = {
    if (it == null || it < 0.0) {
        0.0
    } else {
        it
    }
}

fun main() {
    val gorjeta1 = calcularGorjeta(15.0)
    println("Gorjeta 1: R$ $gorjeta1")
    val gorjeta2 = calcularGorjeta(null)
    println("Gorjeta 2: R$ $gorjeta2")
    val gorjeta3 = calcularGorjeta(-10.0)
    println("Gorjeta 3: R$ $gorjeta3")
}