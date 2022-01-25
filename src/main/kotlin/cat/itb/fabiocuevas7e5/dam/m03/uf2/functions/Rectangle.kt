package cat.itb.fabiocuevas7e5.dam.m03.uf2.functions

data class Rectangle (var length: Int, var width:Int){
    var area = length * width

    fun grow(factor:Int) {
        length = this.length * factor
        width = this.width * factor
        area = length * width
    }
    fun bigger(desconegut: Rectangle): Boolean {
        return this.area > desconegut.area
    }
}

fun main() {
    var length=5
    var width=5

    var pepe = Rectangle(4,8)
    println(pepe)
    pepe.grow(3)
    var rectangle2 = Rectangle(1,2)
    println(rectangle2)
    var bigger =pepe.bigger(rectangle2)
    println(bigger)
    wave()
    println(pepe)
    println(pepe.area)

}

fun wave(): String {
    return "Hello mr Rectangle!"
}
