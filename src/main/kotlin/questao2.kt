fun auditarEntregas(enderecos: List<String?>) {
    for (endereco in enderecos) {
        val enderecoTratado = endereco ?: "Endereço Desconhecido"
        if (enderecoTratado == "Endereço Desconhecido") {
            println("Entrega Pendente: Falta de dados")
        } else {
            println("Rota traçada para: $enderecoTratado")
        }
    }
}
fun main() {
    val listaDeTestes = listOf(
        "Av. Paulista, 1000",
        null,
        "Rua das Flores, 123",
        null,
        "Alameda dos Anjos, 45"
    )
    auditarEntregas(listaDeTestes)
}



