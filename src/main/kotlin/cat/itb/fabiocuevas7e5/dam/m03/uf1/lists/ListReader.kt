package cat.itb.fabiocuevas7e5.dam.m03.uf1.lists

import java.util.*

fun readIntList(): List<Int>{
    val sc = Scanner(System.`in`)
    val howMany = sc.nextInt()
    var list = MutableList(howMany) { sc.nextInt() }
    return list
}