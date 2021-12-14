package cat.itb.fabiocuevas7e5.dam.m03.uf1.lists.exam

import java.util.*

fun main(){
    val sc = Scanner(System.`in`)
    val howMany = sc.nextInt()
    val list = MutableList(howMany){sc.nextInt()}
    val newList = list.filter { it > 0 }
    val suma = newList.sum()
    println(suma)

}