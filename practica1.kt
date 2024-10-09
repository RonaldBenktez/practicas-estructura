fun fun main() {
    println("ingrese el primer numero ")
    val numerouno = readLine().toDouble()

    println("ingrese el segundo numero")
    val numerodos = readLine().toDouble()

    println("ingrese la operacion (+,-,*,/): ")
    val operacion = readLine()

}

fun calculate(numerouno: Double, numerodos: Double, operacion: String){
    if (numerouno == null || numerodos == || operacion == null){
        println("error: ingrese numero valido")
        return
    }

    val resultado == when (operacion){
        "+" -> numerouno + numerodos
        "-" -> numerouno - numerodos
        "*" -> numerouno * numerodos
        "/" -> numerouno / numerodos
    
    else -> {
        println("error operacion no valida ")
        return
    }
}
 println("resultado de la operacion $numerouno $operacion $numerodos = $resultado ")
 

}