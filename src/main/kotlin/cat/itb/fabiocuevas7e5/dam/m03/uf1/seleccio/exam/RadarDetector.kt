package cat.itb.fabiocuevas7e5.dam.m03.uf1.seleccio.exam

import java.util.*


fun main(){
    println("Velocidad dectectada por el radar en km/h")
    val sc = Scanner(System.`in`)
    val velocidad = sc.nextInt()
if (velocidad<=120){
    println("Correcte")
}
    if (velocidad in 121..140){
        println("MUlta lleu")
    }
    if (velocidad>140){
        println("Multa greu")
}
}
