package cat.itb.fabiocuevas7e5.dam.m03.uf2.classfun


data class RightTriangle(val width: Double, val height: Double){
    val area get() = width*height/2
    val perimeter get() = width+height+hypothen
    val hypothen get() = Math.sqrt(width * width + height * height)

    fun toOutput() = "Un triangle de $width x $height té $area d'area i $perimeter de perímetre."
}
