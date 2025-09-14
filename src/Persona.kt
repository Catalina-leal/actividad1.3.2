// ============================
// Clase Base: Persona
// ============================
open class Persona(
    val nombre: String,
    val edad: Int
) {
    // Método abierto para permitir override en subclases
    open fun presentarse() {
        println("Hola, mi nombre es $nombre.")
    }
}