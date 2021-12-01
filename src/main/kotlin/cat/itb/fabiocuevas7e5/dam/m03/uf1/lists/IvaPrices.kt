package cat.itb.fabiocuevas7e5.dam.m03.uf1.lists

import java.util.*

fun main() {
    val sc = Scanner(System.`in`)
    val preuSenseIVA = List(10) { sc.nextInt() }
    preuSenseIVA.forEach {i -> println("$i.0 IVA = ${i+ (i * 0.21)}") }
}