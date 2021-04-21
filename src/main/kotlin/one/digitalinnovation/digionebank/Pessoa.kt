package one.digitalinnovation.digionebank

class Pessoa {
    var nome: String = "Camila"
    var cpf: String = "418.532.818-40"
}

fun main() {
    val camila = Pessoa()

    println(camila.nome)
    println(camila.cpf)
}
