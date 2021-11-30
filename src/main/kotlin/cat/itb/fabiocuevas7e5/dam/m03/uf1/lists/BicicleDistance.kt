package cat.itb.fabiocuevas7e5.dam.m03.uf1.lists

import java.util.*

fun main() {
    val sc = Scanner(System.`in`).useLocale(Locale.US)
    val speed = sc.nextDouble()
    for(i in 1..10){
        val distancia = speed * i
        print("$distancia ")
    }
}