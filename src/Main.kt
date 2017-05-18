import java.io.File

/**
 * Name: Alex Oladele
 * Unique-ID: OLADELAA
 * Date: 5/18/17
 * Project: FizzBuzz
 */
fun main(args: Array<String>) {
    val numList: MutableList<String> = File("fizzbuzzNums.txt").readLines() as MutableList<String>

    for (i in numList.indices) {
        if ((numList[i].toInt() % 5 == 0) && (numList[i].toInt() % 3 == 0))  numList[i]= "FizzBuzz"
        else if ((numList[i].toInt() % 5 == 0)) numList[i] = "Buzz"
        else if ((numList[i].toInt() % 3 == 0)) numList[i] = "Fizz"
    }

    File("fizzbuzzFinal.txt").writeText(numList.joinToString("\n"))

}