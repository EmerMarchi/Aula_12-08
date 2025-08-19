package entidades

import enumeradores.Sexo
import enumeradores.Cargo
import enumeradores.Setor
import java.math.BigDecimal

class Instalador (
    nome : String,
    idade : Int,
    cpf : String,
    sexo : Sexo,
    endereco : String,
    telefone : Long,
    dataNasc : String,
    val cargo : Cargo,
    val tempoExperiencia : Double,
    val salario : BigDecimal,
    val setor : Setor
)
: Pessoa(
    nome = nome,
    idade = idade,
    cpf = cpf,
    sexo = sexo,
    endereco = endereco,
    telefone = telefone,
    dataNasc = dataNasc
)
{ //Comportamentos do Instalador
    fun instalarCaixaDAgua(clt : Instalador){
        if(clt.setor.equals(Setor.MONTAGEM)){
            println("Profissional habilitado")
        }else {
            println("Profissional desqualificado")
        }
    }
}
