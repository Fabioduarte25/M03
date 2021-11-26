package cat.itb.fabiocuevas7e5.dam.m03.uf1.lists

import java.util.*

fun main(){
    val sc = Scanner(System.`in`)
    val padlock = MutableList(8){false}
    var position = sc.nextInt()
    while (position != -1){
        padlock[position] = !padlock[position]
        position = sc.nextInt()
    }
    println(padlock)

}