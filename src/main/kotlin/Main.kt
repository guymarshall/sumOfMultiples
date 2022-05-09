import java.math.BigInteger

fun main() {
    print("Enter the first multiple: ")
    val firstMultiple: Int = readln().toInt()

    print("Enter the second multiple: ")
    val secondMultiple: Int = readln().toInt()

    print("Enter the maximum number to check: ")
    val maximumNumber: Int = readln().toInt()

    var sum = BigInteger.ZERO

    for (number in 1 until maximumNumber) {
        if (number % firstMultiple == 0 || number % secondMultiple == 0) {
            sum = sum.add(BigInteger.valueOf(number.toLong()))
        }
    }

    println("Sum of natural numbers below $maximumNumber that are multiples of $firstMultiple and $secondMultiple is $sum.")
}