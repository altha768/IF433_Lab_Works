package week06

class smartphone : Camera, Phone {

    override fun turnOn() {
        super<Camera>.turnOn()
        super<Phone>.turnOn()
        println("Sistem operasi smartphone berhasilbooting")

    }

}