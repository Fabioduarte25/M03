package cat.itb.fabiocuevas7e5.dam.m03.uf1.data

import java.util.*

fun main() {
    val scanner = Scanner(System.`in`)
    print("Write first number")
    val firstInt = scanner.nextInt()
    print("Write second number")
    val SecondInt = scanner.nextInt()
    print("Write third number")
    val ThirdInt = scanner.nextInt()
    print("Write fourth number")
    val FourthInt = scanner.nextInt()
    print("Write fifth number")
    val fifthInt = scanner.nextInt()
    print(fifthInt in firstInt..SecondInt && fifthInt in ThirdInt..FourthInt)
}