package one.digitalinnovation.digionebank.testes

import one.digitalinnovation.digionebank.Funcionario
import java.math.BigDecimal

fun main() {
    val marcos = Funcionario(nome="Marcos Rodrigues", cpf="009.876.543-21", BigDecimal.valueOf(2000.0))
    println(marcos.nome)
    println(marcos.cpf)
    println(marcos.salario)
}