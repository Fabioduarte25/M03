package cat.itb.fabiocuevas7e5.dam.m03.uf1.data

import java.util.*

fun main() {

    print("Dime tu edad")
    val scanner = Scanner(System.`in`)
    val edad = scanner.nextInt()
    println(edad in 16..65)

}