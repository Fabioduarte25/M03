package cat.itb.fabiocuevas7e5.dam.m03.uf1.lists

import java.util.*

fun main (){
    average() }

fun List<Int>.closestValue(value: Int) = minByOrNull { Math.abs(value - it) }

fun average() {

    val sc = Scanner(System.`in`)
    val howMany = sc.nextInt()
    val list = MutableList(howMany) { sc.nextInt() }
    val avg = list.sum() / howMany



    println(list.closestValue(avg))
}