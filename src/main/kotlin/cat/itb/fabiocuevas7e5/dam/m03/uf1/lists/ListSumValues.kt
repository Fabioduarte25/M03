package cat.itb.fabiocuevas7e5.dam.m03.uf1.lists
import java.util.*

fun main(){
    val sc = Scanner(System.`in`)
    val howMany = sc.nextInt()
    val list = MutableList(size = howMany){sc.nextInt()}
    val result = list.sum()
    println(result)

}
