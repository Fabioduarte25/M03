package cat.itb.fabiocuevas7e5.dam.m03.uf1.lists

import java.util.*

fun main(){
    val sc = Scanner(System.`in`)
    val list = listOf<Int>(1, 2, 4, 6, 8, 10, 15, 34, 89, 96)
    val inputValue = sc.nextInt()
    println(list.contains(inputValue))

}