package one.digitalinnovation.digionebank.testes

import one.digitalinnovation.digionebank.Conta

fun main (){
    val cc = Conta(agencia = "0159", numero = "03574-1")
    println(cc)

    cc.deposito(250.25)
    println("Deposito realizado! R$"+cc.saldo)

    cc.saque(30.2)
    println("Saque realizado!    R$"+cc.saldo)

    cc.saque(300.5)
    println("Saque realizado!    R$"+cc.saldo)
}