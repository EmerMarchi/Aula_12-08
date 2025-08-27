import com.sun.jdi.ClassType
import entidades.CaixaDAgua
import entidades.Instalador
import entidades.Servico
import enumeradores.*
import ui.menu
import java.math.BigDecimal

fun main() {
 menu()
}









//Classes aninhadas é quando temos uma classe dentro da outra.
/* val instalacao : Servico = Servico(
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
         setor = Setor.MONTAGEM,
         funcao = Funcao.CARREGADOR,
         equipamento = listOf("parafusadeira", "parafusos")
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

  val clt = Instalador (
      nome = "Fabio",
      idade = 42,
      cpf = "23233232",
      sexo = Sexo.MASCULINO,
      endereco = "Rua x",
      telefone = 468992342,
      dataNasc = "14/03/1983",
      cargo = Cargo.INSTALADOR,
      tempoExperiencia = 3.0,
      salario = BigDecimal(1000.00),
      setor = Setor.LOGISTICA,
      funcao = Funcao.OPERADOR,
      equipamento = listOf("parafusadeira", "parafusos", "EPIs")
  )

  println("Começar a instalação")
  println(clt.instalacaoCompleta())
  */