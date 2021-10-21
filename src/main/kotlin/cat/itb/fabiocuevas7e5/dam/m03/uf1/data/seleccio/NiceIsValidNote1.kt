package cat.itb.fabiocuevas7e5.dam.m03.uf1.data.seleccio

import java.util.*

fun main(){
    val scanner = Scanner(System.`in`)
    val billete = scanner.nextInt()
    val billets = listOf<Int>(5,10,20,50,100,200)
    if(billete in billets) print("billet valid")
    else print("billet invalid")
}