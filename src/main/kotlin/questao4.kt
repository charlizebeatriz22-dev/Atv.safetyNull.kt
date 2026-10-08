fun processarTransacoesPix(transacoes: List<Double?>) {
    var total = 0.0
    for (transacao in transacoes) {
        if (transacao != null) {
            total += transacao // Soma ao total (o mesmo que: total = total + transacao)
        } else {
            println("Transação ignorada")
        }
    }
    println("Valor total processado: R$ $total")
}
fun main() {
    val listaTransacoes = listOf(50.0, null, 120.5, null, 10.0)
    processarTransacoesPix(listaTransacoes)
    }
