package cat.itb.fabiocuevas7e5.dam.m03.uf1.seleccio

import java.util.*

fun main(){
    val scanner = Scanner(System.`in`)
    val billete = scanner.nextInt()
    when (billete) {
        5, 10, 20, 50, 100, 500 -> print("bitllet vàlid")
        else -> print("bitllet invàlid")    }
}