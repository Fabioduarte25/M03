package cat.itb.fabiocuevas7e5.dam.m03.uf1.lists.exam

import java.util.*

fun main(){
    val sc = Scanner(System.`in`)
    val howMany = sc.nextInt()
    val list = List(howMany){sc.nextInt()}
    var puntsdeinflexio = 0
    for(i in list){
        if((i-1) < i && (i+1) < i){
            puntsdeinflexio =+ 1}

        if((i-1) > i && (i+1) > i) {
            puntsdeinflexio =+ 1
        }
    }
    println("Té $puntsdeinflexio canvis de pendents")
}