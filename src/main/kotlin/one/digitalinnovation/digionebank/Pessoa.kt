package one.digitalinnovation.digionebank

class Pessoa {
    var nome: String = "Camila"
    var cpf: String = "123.456.789-00"
    private set //Atribuir valores apenas na classe, não deixará alterar em outros lugares do código.

    constructor() //Contrutor secundário

    fun pessoaInfo()= "$nome e $cpf"
}

fun main() {
    val camila = Pessoa()
    println(camila.pessoaInfo())
}
