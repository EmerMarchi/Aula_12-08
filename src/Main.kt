import java.math.BigDecimal

fun main() {
   val instalacao : Servico = Servico(
       preco = "800.50".toBigDecimal(),
       tempo = 2.00,
       condicao = "boa",
       Instalador(
           nome = "João",
           idade = 25,
           cpf = "1223443434",
           sexo = "Masculino",
           endereco = "Rua Boa Vista, 26 - Bom Jesus do Sul",
           telefone = 46999381240,
           dataNasc = "04/11/2000",
           cargo = "Instalador de Caixa de Água",
           tempoExperiencia = 2.5,
           salario = BigDecimal(200.50)
       )
   )
    val caixaDAgua1: CaixaDAgua =
        CaixaDAgua(
            20000,
            "Polietileno",
            "Circular",
            50,
            "Azul",
            350.0,
            "Fortlev",
            3.25,
            2.45,
            4.05,
            null
        )
}