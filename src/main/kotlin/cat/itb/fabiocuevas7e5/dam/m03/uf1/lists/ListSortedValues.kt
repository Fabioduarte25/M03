package cat.itb.fabiocuevas7e5.dam.m03.uf1.lists

import java.util.*

fun main() {
    val sc = Scanner(System.`in`)
    val howMany = sc.nextInt()
    val list = List(size = howMany) { sc.nextInt() }
    list.sorted()
    if (list == list.sorted()) {
        println("ordenats")
        }
    else(println("desordenats"))
    }
