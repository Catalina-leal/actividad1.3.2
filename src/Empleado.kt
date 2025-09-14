class Empleado(
    nombre: String,
    edad: Int,
    val puesto: String,
    private val salario: Double
) : Persona(nombre, edad) {

    // Método público para mostrar el puesto
    fun mostrarPuesto() {
        println("$nombre trabaja como $puesto .")
    }

    // Sobrescribimos presentarse()
    override fun presentarse() {
        println("Hola, soy $nombre y mi puesto es $puesto.")
    }
    }