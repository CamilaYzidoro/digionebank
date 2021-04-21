package one.digitalinnovation.digionebank

class Cliente (nome: String, cpf: String, val clienteTipo: ClienteTipo, val senha: String
) : Pessoa(nome=nome, cpf=cpf), Logavel {
    override fun login(): Boolean = "042021" == senha

    override fun toString(): String = """
        Nome: $nome
        CPF:  $cpf
        Tipo: ${clienteTipo.descricao}
    """.trimIndent()
}