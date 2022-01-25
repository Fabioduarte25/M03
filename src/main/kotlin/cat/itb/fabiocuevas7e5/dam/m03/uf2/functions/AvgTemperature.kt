package cat.itb.fabiocuevas7e5.dam.m03.uf2.functions

import java.util.*

fun main() {
    val scanner = Scanner(System.`in`)
    val temperatures  = readIntList(scanner)
    val avgTemperature = avg(temperatures)
    println("Ha fet $avgTemperature graus de mitjana")
}
