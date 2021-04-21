package one.digitalinnovation.digionebank.testes

import one.digitalinnovation.digionebank.Analista
import one.digitalinnovation.digionebank.Funcionario
import java.math.BigDecimal

fun main() {
    val marcos = Analista(nome="Marcos Rodrigues", cpf="009.876.543-21", salario=2000.0)

    ImprimeRelatorioFuncionario.imprime(marcos)
}