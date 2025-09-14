fun main() {
    // Crear objeto de Persona
    val persona1 = Persona("Ana", 30)
    persona1.presentarse()  // Llama al método de Persona

    // Crear objeto de Empleado
    val empleado1 = Empleado("Carlos", 28, "Desarrollador", 1200.0)
    empleado1.presentarse()  // Llama al método sobrescrito de Empleado
    empleado1.mostrarPuesto()

}