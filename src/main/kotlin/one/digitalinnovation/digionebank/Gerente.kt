package one.digitalinnovation.digionebank

class Gerente(nome: String, cpf: String, salario: Double) : Funcionario(nome = nome, cpf = cpf, salario = salario) {
    override fun calculoBonus(): Double = salario * 0.4
}