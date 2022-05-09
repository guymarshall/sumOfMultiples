fun main(args: Array<String>) {
    print("Enter the first multiple: ")
    var firstMultiple: Int = readln().toInt()

    print("Enter the second multiple: ")
    var secondMultiple: Int = readln().toInt()

    print("Enter the maximum number to check: ")
    var maximumNumber: Int = readln().toInt()

    var sum = 0

    for (number in 1 until maximumNumber) {
        if (number % firstMultiple == 0 || number % secondMultiple == 0) {
            sum += number
        }
    }

    println("Sum of natural numbers below $maximumNumber that are multiples of $firstMultiple and $secondMultiple is $sum.")
}