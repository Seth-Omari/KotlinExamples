fun main(args: Array<String>) {

    // an arraylist of vowels
    val vowelsList: List<String> = listOf("a", "e", "i", "o", "u")

    // converting arraylist to array
    val vowelsArray: Array<String> = vowelsList.toTypedArray()

    // printing elements of the array
    vowelsArray.forEach { print(it) }
}