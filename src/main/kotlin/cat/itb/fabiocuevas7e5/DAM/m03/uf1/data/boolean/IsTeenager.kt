package cat.itb.fabiocuevas7e5.DAM.m03.uf1.data.boolean

import java.util.*

//L'usuari escriu un enter amb la seva edat i s'imprimeix true si l'edat està entre 10 i 20.

fun main() {
    val sc = Scanner(System.`in`)
    val inputValue= sc.nextInt()
    val x:Boolean = isTeenager(inputValue)
    println(x)
}

fun isTeenager(x: Int): Boolean {
    return x>10 && x<20
}
