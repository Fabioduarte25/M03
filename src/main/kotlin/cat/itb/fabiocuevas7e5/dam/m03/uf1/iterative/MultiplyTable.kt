package cat.itb.fabiocuevas7e5.dam.m03.uf1.iterative

import java.util.*

fun main() {
    val sc = Scanner(System.`in`)
    val enter = sc.nextInt()
    for (i in 1..9){
        val resultado = enter* i
        println("$i * $enter = $resultado")
    }
}