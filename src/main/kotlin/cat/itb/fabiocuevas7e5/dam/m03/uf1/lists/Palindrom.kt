package cat.itb.fabiocuevas7e5.dam.m03.uf1.lists

import java.util.*

fun main() {
    val sc = Scanner(System.`in`)
    val palabra = sc.next()
    val reverse = palabra.reversed()
    if (palabra==reverse) {
        println("La paraula és un palíndrom")
    }
}