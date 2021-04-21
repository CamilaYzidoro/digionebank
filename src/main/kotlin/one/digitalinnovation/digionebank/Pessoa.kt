package one.digitalinnovation.digionebank

class Pessoa {
    var nome: String = "Camila"

    var cpf: String = "123.456.789-00"
    private set
}

fun main() {
    val camila = Pessoa()

    println(camila.nome)
    println(camila.cpf)
}
