package cat.itb.fabiocuevas7e5.dam.m03.uf1.data

import java.util.*

fun main() {
    val sc = Scanner(System.`in`)
    val mes = sc.nextInt()
    val mesActual = sc.nextInt()
    val dia = sc.nextInt()
    val diaActual = sc.nextInt()

    val mesPassat = mes < mesActual
    val mesIgual = mes == mesActual
    val diaPassat = dia <= diaActual
    println (mesPassat || (mesIgual && diaPassat))



}
