package week06

class Button (override val name: String ) : Clickable() {
    override fun click() {
        print("Tombol '$name' berhasil diklik!")

    }

}
