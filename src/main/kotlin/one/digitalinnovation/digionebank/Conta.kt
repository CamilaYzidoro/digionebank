package one.digitalinnovation.digionebank

import kotlin.IllegalArgumentException
import kotlin.contracts.contract

class Conta (
        val agencia: String,
        val numero: String,
    ) : Depositavel, Sacavel {
    var saldo: Double = 0.0; private set

    override fun deposito (valor: Double){
        if (this.saldo > valor) {
            throw IllegalArgumentException("Não é possivel depositar valores negativos.")
        } else {
            this.saldo += valor
        }
    }

    override fun saque(valor: Double) {
        if (this.saldo < valor) {
            throw IllegalArgumentException("Saldo Insuficiente.")
        } else {
            this.saldo -= valor
        }
    }
    override fun toString(): String {
        return """
        Ag.:   $agencia
        Conta: $numero
        Saldo: $saldo
    """.trimIndent()
    }
}

