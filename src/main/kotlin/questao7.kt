fun limparBancoDeDados(emails: List<String?>){
    var contasInvalidas = 0
    for (email in emails) {
        val tamanho = email?.length ?: 0
        if (tamanho == 0) {
            contasInvalidas++
            println("Aviso: Cadastro inválido encontrado ($email) - Marcado para deleção.")
        } else {
            println("Conta válida: $email")
        }
    }
    println("\nProcessamento concluído. Total de contas a serem apagadas: $contasInvalidas")
}
fun main() {
    val listaEmails = listOf(
        "aluno@email.com",
        null,
        "dev@kotlin.org",
        "",
        "suporte@empresa.com",
        null
    )
    limparBancoDeDados(listaEmails)
}