package cat.itb.fabiocuevas7e5.DAM.m03.uf1.seleccio


import java.util.*

fun main (){
    val sc = Scanner(System.`in`)
    println("Introdueix un any:")
    val any = sc.nextInt()
    val modul = any%100
    val darrersDigits = any%100
    val primersDigits = any /100
    if(darrersDigits%4==0) {
        println("$any és any de traspàs")
        if(darrersDigits==0 && primersDigits%4==0)
            println("$any és any de traspàs")

    }else{
        println("No és de traspàs")
    }
}