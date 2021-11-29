package cat.itb.fabiocuevas7e5.dam.m03.uf1.lists

import cat.itb.fabiocuevas7e5.dam.m03.uf1.data.project.scanner
import java.util.*

fun main(){
    val sc = Scanner(System.`in`)
    val howMany = sc.nextInt()
    val list = MutableList<Int>(size= howMany){ scanner.nextInt()}
    list.sort()
    println(list.last())
}