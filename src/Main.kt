import stack.Stack

/* Kotlin Stacks
    Ibrar Yunus <University of St. Andrews>

    Generic implementation of stack.Stack
 */

fun main(args: Array<String>) {
    header()

    println("Testing Stacks!")
    println("-- pushing into stack")
    val test = Stack<Int>()
    (1..10).forEach { test.push(it) }

    println("-- checking size: " + test.size)

    println("-- top element: " + test.top)
}

fun header() {
    println("\nIbrar Yunus <University of St. Andrews")
    println("Kotlin STACKS\n")
}