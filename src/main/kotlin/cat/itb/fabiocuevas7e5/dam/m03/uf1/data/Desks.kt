package cat.itb.fabiocuevas7e5.dam.m03.uf1.data

import java.util.*

fun main (){
    val sc = Scanner(System.`in`)
    val classe1 = sc.nextInt()
    val classe2 = sc.nextInt()
    val classe3 = sc.nextInt()

    val desk =classe1 / 2 + classe1 % 2 + classe2 / 2 + classe2 % 2 + classe3 / 2 + classe3 % 2
    println(desk)

}
