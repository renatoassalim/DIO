import kotlin.math.pow

fun main() {
    val m = (readLine() ?: return).toInt()
    if (m in 2..999){
        val n = 1..m

        n.forEach {
            println("$it ${(it.toDouble().pow(2)).toInt()} ${(it.toDouble().pow(3)).toInt()}")
            println("$it ${(it.toDouble().pow(2)+1).toInt()} ${(it.toDouble().pow(3)+1).toInt()}")

        }
    } else{
        println("Numero deve ser > que 1 e menor que 1000")
    }
}
