package cat.itb.fabiocuevas7e5.dam.m03.uf1.lists

import java.util.*

fun main(){
    val sc = Scanner(System.`in`)
    val matrix = listOf(
        listOf(1, 1, 0, 0, 0, 0, 1),
        listOf(0, 0, 1, 0, 0, 0, 1),
        listOf(0, 0, 0, 0, 0, 0, 1),
        listOf(0, 1, 1, 1, 0, 0, 1),
        listOf(0, 0, 0, 0, 1, 0, 0),
        listOf(0, 0, 0, 0, 1, 0, 0),
        listOf(1, 0, 0, 0, 0, 0, 0),
    )
    val guess = matrix[sc.nextInt()][sc.nextInt()]
    if (guess == 0) {
        println("aigua")
    }
    if (guess == 1){
        println("tocat")
    }
}