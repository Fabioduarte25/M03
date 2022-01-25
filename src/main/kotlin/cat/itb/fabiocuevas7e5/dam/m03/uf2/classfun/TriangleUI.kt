package cat.itb.fabiocuevas7e5.dam.m03.uf2.classfun


import java.util.*

fun printTriangles(triangles: List<RightTriangle>) {
    for(triangle in triangles){
        println(triangle.toOutput())
    }
}

fun readTriangles(scanner: Scanner): List<RightTriangle> {
    val count = scanner.nextInt()
    return List(count){
        readTriangle(scanner)
    }
}

fun readTriangle(scanner: Scanner):RightTriangle {
    val width = scanner.nextDouble()
    val height = scanner.nextDouble()
    return RightTriangle(width, height)
}
