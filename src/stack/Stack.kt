package stack

class Stack<E> {
    private val stack = mutableListOf<E>()
    val size get() = stack.size
    val isEmpty get() = size == 0

    fun pop(): E {
        if (isEmpty) throw RuntimeException("stack empty - cannot pop")
        return stack.removeAt(stack.lastIndex)
    }

    fun push(element: E) = stack.add(element)

    val top: E
        get () {
            if (isEmpty) throw RuntimeException("stack empty - has no top element")
            return stack.last()
        }

    fun clear() {
        stack.clear()
    }
}