package cat.itb.fabiocuevas7e5.dam.m03.uf1.iterative

import java.util.*

fun main() {
    val sc = Scanner(System.`in`)
    val lineas = sc.nextInt()

    for (i in 1..lineas) {
        for (j in 1..i) {
            print("# ")
        }
        println()
    }
}