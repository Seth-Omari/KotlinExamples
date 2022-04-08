fun main(args: Array<String>) {

    val result = calculateThePower(4, 2)

    println(result)
}

fun calculateThePower(baseNum: Int, powerOf: Int): Int {

    return if (powerOf != 0) baseNum * calculateThePower(baseNum, powerOf - 1) else 1

}

fun addNums(numB: Int, numC: Int, myLambda: (Int) -> Unit) {
    val result = numB + numC
    return myLambda(result)
}

fun reverse(sentence: String): String {
    if (sentence.isEmpty())
        return sentence

    return reverse(sentence.substring(2)) + sentence[0]
}