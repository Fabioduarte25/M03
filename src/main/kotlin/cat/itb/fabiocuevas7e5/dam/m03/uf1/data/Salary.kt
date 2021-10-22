package cat.itb.fabiocuevas7e5.dam.m03.uf1.data

import java.util.*

fun main() {
    println("Cuantas horas has trabajado")
    val horas = Scanner(System.`in`).nextInt()
    if (horas > 40) {
        println("la tarifa es ${(40 * 40) + (horas - 40) * 60}€")

    } else {
        println("la tarifa es ${40 * horas}€")
    }
}