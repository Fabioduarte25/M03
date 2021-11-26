package cat.itb.fabiocuevas7e5.dam.m03.uf1.lists

import java.util.*

fun main(){
    val sc = Scanner(System.`in`)
    val inputValue = MutableList(10){sc.nextInt()}
    val reverse: List<Int> = inputValue.reversed();
    println(reverse)
}