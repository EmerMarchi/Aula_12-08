import java.math.BigDecimal

class Instalador (
    nome : String,
    idade : Int,
    cpf : String,
    sexo : String,
    endereco : String,
    telefone : Long,
    dataNasc : String,
    val cargo : String,
    val tempoExperiencia : Double,
    val salario : BigDecimal,
) : Pessoa (nome = nome, idade = idade, cpf = cpf, sexo = sexo, endereco = endereco, telefone = telefone, dataNasc = dataNasc)