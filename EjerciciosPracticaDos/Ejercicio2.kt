/*
Ejercicio 2: Desarrolla un programa que permita al usuario ingresar 4 notas y 
las almacene en un array. Calcula y muestra el promedio de las notas. 
Usa try-catch para manejar entradas no numéricas.
*/

fun main() {
    val notas = DoubleArray(4)
    var suma = 0.0

    for (i in notas.indices) {
        while(true){
            try{
                println("Ingrese la nota ${i +1}:")
                notas[i] = readLine()!!.toDouble()
                break
            } catch (e: NumberFormatException){
                println("Por favor ingrese una nota valida")
            }
        }

        suma += notas[i]
    }

    val promedio = suma / notas.size
    println("El promedio de las notas es de: $promedio")
}