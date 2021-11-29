package cat.itb.fabiocuevas7e5.dam.m03.uf1.lists

import java.util.*

fun main() {
    val sc = Scanner(System.`in`)
    val howMany = sc.nextInt()
    val list = List(size = howMany) { sc.nextInt() }
    val reverse = list.reversed()
    if (list == reverse) {
        println("cap i cua")
    } else {
        println("cap i cua'nt")
    }
}