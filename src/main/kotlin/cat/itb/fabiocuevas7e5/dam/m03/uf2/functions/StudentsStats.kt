package cat.itb.fabiocuevas7e5.dam.m03.uf2.functions


import java.util.*

fun main(){
    val sc = Scanner(System.`in`)
    val notas= readIntList(sc)
    val menor = min(notas)
    val mayor = max(notas)
    val mitjana = avg (notas)
    println("Nota mínima: $menor")
    println("Nota màxima: $mayor")
    println("Nota mitjana: $mitjana")
}