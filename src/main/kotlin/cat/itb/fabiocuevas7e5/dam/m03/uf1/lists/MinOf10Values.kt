package cat.itb.fabiocuevas7e5.dam.m03.uf1.lists

import cat.itb.fabiocuevas7e5.dam.m03.uf1.data.project.scanner

fun main(){
    val valores = MutableList<Int>(10){scanner.nextInt()}
    valores.sort()
    println(valores.first())

}