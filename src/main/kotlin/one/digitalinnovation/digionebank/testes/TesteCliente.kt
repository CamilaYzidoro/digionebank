package one.digitalinnovation.digionebank.testes

import one.digitalinnovation.digionebank.Cliente
import one.digitalinnovation.digionebank.ClienteTipo

fun main(){
    val gabriela = Cliente(
        nome = "Gabriela Oliveira",
        cpf="987.321.600-54",
        clienteTipo = ClienteTipo.PF,
        senha="042021"
    )

    println(gabriela)

    TesteAutenticacao().autentica(gabriela)
}