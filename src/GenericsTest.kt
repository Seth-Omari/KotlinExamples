fun main() {
    val testClass = TestClass(45.23)
    val data = testClass.classDataType
    println("Class working well $data")
}

class TestClass<T>(t: T) {

    val classDataType = t
}