package cat.itb.fabiocuevas7e5.dam.m03.uf1.lists.exam

import java.util.*

fun main(){
    val sc = Scanner(System.`in`)
    var position = 0
    var value = 0
    val list = MutableList(10){0}
    while(position != -1) {
        position = sc.nextInt()
        if (position == -1) break
        value = sc.nextInt()
        list[position] = value
    }
    println(list)
}