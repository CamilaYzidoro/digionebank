package one.digitalinnovation.digionebank.testes

import one.digitalinnovation.digionebank.Conta

fun main (){
    val cc = Conta(agencia = "0159", numero = "03574-1")
    println(cc)

    cc.deposito(250.25)
    println("Deposito realizado!")

    cc.saque(30.0)
    println("Saque realizado!")

    cc.saque(300.0)
    println(cc)
}