package one.digitalinnovation.digionebank.testes

import one.digitalinnovation.digionebank.Funcionario
import one.digitalinnovation.digionebank.Gerente


fun main() {
    val maria = Gerente(nome="Maria Claudia", cpf="456.789.001-23", salario=5000.0)

    ImprimeRelatorioFuncionario.imprime(maria)
}