package cat.itb.fabiocuevas7e5.dam.m03.uf1.lists

fun main() {
    val listaFloat = List<Float> (50){0.0f}.toMutableList()
    listaFloat[0] = 31.0f
    listaFloat[1] = 56.0f
    listaFloat[19] = 12.0f
    listaFloat[listaFloat.lastIndex] = 79.0f

    println (listaFloat)
}