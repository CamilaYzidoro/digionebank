package one.digitalinnovation.digionebank.testes

import one.digitalinnovation.digionebank.Banco

fun main() {
    val digiOneBank = Banco(nome = "DigiOne", numero = 1)

    println(digiOneBank.nome + " - " + digiOneBank.numero)

    val digiTwoBank = digiOneBank.copy(nome = "DigiTwo", numero = 2)

    println(digiTwoBank.info())
}