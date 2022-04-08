fun main() {

    val vehicle = Vehicle("Toyota", "Passo", "Black")
    val make = vehicle.vMake
    val model = vehicle.vModel
    val color = vehicle.vColor

    println("The vehicle is a $color $make $model")
}

class Vehicle(make: String, model: String, color: String) {

    val vMake = make
    val vModel = model
    val vColor = color
}
