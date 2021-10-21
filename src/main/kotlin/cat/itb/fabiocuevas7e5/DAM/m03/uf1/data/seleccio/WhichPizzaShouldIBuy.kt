package cat.itb.fabiocuevas7e5.DAM.m03.uf1.data

import java.util.*
import kotlin.math.PI

fun main (){
    val scanner = Scanner(System.`in`)
    val diametro = scanner.nextInt()
    val largo = scanner.nextInt()
    val ancho  = scanner.nextInt()
    val radio = diametro/2
    val rodona = PI*(radio*radio)
    val rectangular = largo*ancho

    if(rodona>rectangular)
        print("Compra la rodona")
    else print("Compra la rectangular")


}