import entidades.CaixaDAgua
import entidades.Instalador
import entidades.Servico
import enumeradores.*
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
           sexo = Sexo.MASCULINO,
           endereco = "Rua Boa Vista, 26 - Bom Jesus do Sul",
           telefone = 46999381240,
           dataNasc = "04/11/2000",
           cargo = Cargo.INSTALADOR,
           tempoExperiencia = 2.5,
           salario = BigDecimal(3000.99),
           setor = Setor.MONTAGEM
       )
   )
    val caixaDAgua: CaixaDAgua =
        CaixaDAgua(
            20000,
            Material.POLIETILENO,
            Formato.CIRCULAR,
            50,
            Cor.AZUL,
            350.0,
            Marca.FORTLEV,
            3.25,
            2.45,
            4.05,
            null
        )
}