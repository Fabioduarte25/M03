package cat.itb.fabiocuevas7e5.dam.m03.uf1.iterative

import java.util.*

fun main(){
var numero:Int
    do {
        println("Introduce un número entre el 1 y el 5")
        numero = readLine()!!.toInt()
    } while(numero !in 1..5)
    println("El número introducido: $numero")
    }