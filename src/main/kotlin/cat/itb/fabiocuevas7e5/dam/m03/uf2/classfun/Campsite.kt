package cat.itb.fabiocuevas7e5.dam.m03.uf2.classfun

data class CampSite(val reservations : MutableList<Reservation> = mutableListOf()) {
    val slots get() =reservations.size
    val personAmount : Int get() {
        var totalAmount =0
        for (reservation in reservations){
            totalAmount+=reservation.persons
        }
        return totalAmount
    }

    /**
     * Afegeix un element a la llista de reserves
     */
    fun checkIn(name: String, amount: Int) {
        this.reservations+=Reservation(name, amount)
    }

    /**
     * Delete element from list
     */
    fun checkOut(name: String) {
        val position = findClient(name)
        reservations.removeAt(position!!)

    }

    /**
     * Donada una llista cerca quina reserva té per nom el parametre name
     */
    private fun findClient(name: String): Int? {
        for (i in reservations.indices){
            if (reservations[i].name == name) return i
        }
        return null
    }
}
