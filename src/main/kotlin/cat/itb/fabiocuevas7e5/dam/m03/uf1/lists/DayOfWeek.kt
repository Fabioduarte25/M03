package cat.itb.fabiocuevas7e5.dam.m03.uf1.lists

import java.util.*

fun main(){
    val sc = Scanner (System.`in`)
    val daysOrder = sc.nextInt()
    val days : List<String> = listOf("dilluns", "dimarts", "dimecres", "dijous", "divendres", "dissabte", "diumenge")
    val day = days.get(daysOrder)
    println(day)

}