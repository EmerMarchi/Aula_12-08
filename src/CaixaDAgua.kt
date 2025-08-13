import java.math.BigDecimal

class CaixaDAgua ( //Os 2 parenteses Construtor da Classe
    val capacidade : Int,
    val material : String,
    val formato : String,
    val cano : Int,
    val cor : String,
    val peso : Double,
    val marca : String,
    val altura : Double,
    val profundidade : Double,
    val largura : Double,
    val preco : BigDecimal? = BigDecimal.ZERO
    //val dimenssao : Array<Double>, //Altura, Largura e Profundidade
)//Aqui vai todos os atributos da classe