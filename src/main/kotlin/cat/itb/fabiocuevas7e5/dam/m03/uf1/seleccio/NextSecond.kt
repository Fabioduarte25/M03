package cat.itb.fabiocuevas7e5.dam.m03.uf1.seleccio

import java.util.*

fun main() {
    val sc = Scanner(System.`in`)
    println("hores")
    var hours = sc.nextInt()
    println("minuts")
    var minutes = sc.nextInt()
    println("segons")
    var seconds = sc.nextInt()

    if (seconds == 59){
        seconds = 0
        if (minutes == 59){
            minutes = 0
            if (hours == 23){
                hours = 0
            }
            else {
                hours++
            }
        }
        else{
            minutes++
        }
    }
    else {
        seconds++
    }
    println("$hours : $minutes : $seconds")
}
