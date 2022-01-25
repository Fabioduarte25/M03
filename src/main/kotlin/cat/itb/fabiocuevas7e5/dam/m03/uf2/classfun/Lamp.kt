package cat.itb.fabiocuevas7e5.dam.m03.uf2.classfun

class Lamp (var turnedOn: Boolean=false ) {
    fun perform(action: String) {
        when(action){
            "TURN OFF" -> turnOff()
            "TURN ON" -> turnOn()
            "TOGGLE" -> toggle()
        }
    }

    private fun toggle() {
        turnedOn = !turnedOn
    }

    private fun turnOn() {
        turnedOn = true
    }

    private fun turnOff() {
        turnedOn = false
    }


}
