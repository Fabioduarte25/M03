package cat.itb.fabiocuevas7e5.dam.m03.uf2.functions


import java.util.*

fun main() {
    val scanner = Scanner(System.`in`)
    val studentAges = readIntList(scanner)
    val maxAge = max(studentAges)
    println("L'alumne més gran té $maxAge anys")
}
