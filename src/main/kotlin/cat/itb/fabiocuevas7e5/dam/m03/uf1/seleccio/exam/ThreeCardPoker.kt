package cat.itb.fabiocuevas7e5.dam.m03.uf1.seleccio.exam

import java.util.*

fun main() {
    val sc = Scanner(System.`in`)
    val primero = sc.nextInt()
    val segundo = sc.nextInt()
    val tercero = sc.nextInt()
    if ((primero == segundo) && (segundo == tercero) && (primero == tercero)) {
        println("Trio")
    }
    if ((segundo == primero+1) && (tercero == segundo +1) && (tercero == primero+2 )){
        println("Escala")
    }
    if ((primero == segundo) || (tercero == segundo) || (tercero == primero)){
        println("Parella")
    } else{
        println("Número alt")
    }
}