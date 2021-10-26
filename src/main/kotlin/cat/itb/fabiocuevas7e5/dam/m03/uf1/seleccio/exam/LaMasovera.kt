package cat.itb.fabiocuevas7e5.dam.m03.uf1.seleccio.exam

import java.util.*

fun main(){
    val sc = Scanner(System.`in`)
    var diaDeLaSemana: String
    println("¿A qué día de la semana estamos?")
    diaDeLaSemana = sc.next()
    when{
        diaDeLaSemana == "dilluns" -> println("Compra llums")
        diaDeLaSemana == "dimarts" -> println("Compra naps")
        diaDeLaSemana == "dimecres" -> println("Compra nespres")
        diaDeLaSemana == "dijous" -> println("Compra nous")
        diaDeLaSemana == "divendres" -> println("Faves tendres")
        diaDeLaSemana == "dissabte" -> println("Tot s'ho gasta")
        diaDeLaSemana == "diumenge" -> println("Tot s'ho menja")

    }
}