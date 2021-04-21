package one.digitalinnovation.digionebank

import java.math.BigDecimal

abstract class Funcionario (
    nome : String,
    cpf : String,
    val salario : BigDecimal
) : Pessoa(nome, cpf) {
    protected abstract fun calculoBonus(): Double

    override fun toString(): String { """
        Nome: $nome
        CPF: $cpf
        Salário: $salario
        Bônus: ${calculoBonus()} 
    """.trimIndent()

    }
}