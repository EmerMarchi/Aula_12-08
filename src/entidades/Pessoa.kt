package entidades

import enumeradores.Sexo

open class Pessoa (
    val nome : String,
    val cpf : String,
    val sexo : Sexo,
    val idade : Int,
    val telefone : Long,
    val endereco : String,
    val dataNasc : String
)