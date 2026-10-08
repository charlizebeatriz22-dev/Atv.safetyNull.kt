fun validarBioInfantil(bio: String?) {
    val tamanho = bio?.length ?: 0
    if (tamanho <= 50) {
        println("Bio aceita ($tamanho caracteres)")
    } else {
        println("Bio muito longa ($tamanho caracteres)")
    }
}
fun main() {
    validarBioInfantil("Adoro assistir desenhos e jogar bola!")
    validarBioInfantil(null)
    validarBioInfantil("Esta é uma biografia extremamente longa criada especificamente para ultrapassar o limite de cinquenta caracteres permitido no perfil infantil.")
}