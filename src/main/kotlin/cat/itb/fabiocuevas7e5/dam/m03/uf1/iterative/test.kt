package cat.itb.fabiocuevas7e5.dam.m03.uf1.iterative

fun main(){
    val mainPackage = "cat.itb.fabiocuevas7e5.dam"
    val suiteSubPackage = "m03.uf1.iterative"
    val className = "Factorial"
    val fullClassName = "$mainPackage.$suiteSubPackage.${className}Kt"

    try {
        val clazz = Class.forName(fullClassName)
        println("File Found")
    } catch (e: ClassNotFoundException){
        println("File not Found")
    }
}