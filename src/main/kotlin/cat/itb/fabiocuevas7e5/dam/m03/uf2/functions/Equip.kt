package cat.itb.fabiocuevas7e5.dam.m03.uf2.functions

data class Equip(var nom: String, var puntuacio: Int = 0) {
    fun actualitzarPuntuacio(novaPuntuacio: Int): Int {
        val punts = novaPuntuacio - this.puntuacio
        puntuacio = novaPuntuacio
        return punts
    }
}
