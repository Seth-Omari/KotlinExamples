class Choice {
    companion object {
        var name: String = "lyric"
        var mName: String = "Seeeeeeeeeth"
        fun showDescription(name: String) = println("My favorite $name")
        fun showName(mName: String) = println("my name is $mName")
    }
}

class Car {

    companion object {
        var vName = "VW"
        fun showVehicleName(vName: String) = println("This is a $vName make" )
    }
}

fun main() {
    println(Choice.name)
    Choice.showDescription("pick")
    Choice.showDescription("selection")

    println(Choice.mName)
    println(Choice.showName("Omaaaaaaaari"))
    println(Car.showVehicleName("BMW"))
    println(Choice.showName("Omaaaaaaaari"))
}