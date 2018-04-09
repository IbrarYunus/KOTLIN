/* Kotlin Stacks
    Ibrar Yunus <University of St. Andrews>

    Generic implementation of Stack
 */

class Stack<E>{
    private val stack = mutableListOf<E>()
    val size get() = stack.size
    val isEmpty get() = size == 0

    fun pop(): E {
        if (isEmpty) throw RuntimeException("stack empty - cannot pop")
        return stack.removeAt(stack.lastIndex)
    }

    fun push(element: E) =  stack.add(element)

    val top: E
        get () {
            if(isEmpty) throw RuntimeException("stack empty - has no top element")
            return stack.last()
        }

    fun clear()   {
        stack.clear()
    }
}

fun main (args: Array<String>) {
    header()

    println("Testing Stacks!")
    println("-- pushing into stack")
    val test = Stack<Int>()
    (1..10).forEach{ test.push(it)}

    println("-- checking size: " + test.size)

    println("-- top element: " + test.top)
}

fun header() {
    println("\nIbrar Yunus <University of St. Andrews")
    println("Kotlin STACKS\n")
}