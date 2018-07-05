//
//#####################################################################
//# Component of upcoming Progress Module                             #
//# Ibrar Yunus  University of St. Andrews                            #
//# July 2018                                                         #
//#####################################################################
//#####################################################################


//Specification of the bar-type progress of processes


//  _____        _____        _____
// /     \      /     \      /     \
//<       >----<       >----<       >
// \_____/      \_____/      \_____/
// /     \      /     \      /     \
//<       >----<       >----<       >----.
// \_____/      \_____/      \_____/      \
//       \      /     \      /     \      /
//        >----<       >----<       >----<
//       /      \_____/      \_____/      \_____
//       \      /     \      /     \      /     \
//        `----<       >----<       >----<       >
//              \_____/      \_____/      \_____/
//                           /     \      /
//                          <       >----'
//                           \_____/


import stack.Stack
import progressbar.ProgressBar
import java.util.*


/* Kotlin Stacks
    Ibrar Yunus <University of St. Andrews>

    Generic implementation of stack.Stack
 */

fun main(args: Array<String>) {
    header()

    println("KOTLIN Testing Module")
    println("please make a selection to test")
    println("[1] Stacks")
    println("[2] ProgressBar")

    var option : Int = 0
    with(Scanner(System.`in`)) {
        option = nextInt()
    }

    if (option == 1) {
        println("\n[!] testing Stacks\n")
        println("-- pushing into stack")
        val test = Stack<Int>()
        (1..10).forEach { test.push(it) }
        println("-- checking size: " + test.size)
        println("-- top element: " + test.top)
    }

    if (option == 2) {
        println("\n[!] testing ProgressBar\n")
        val duration = 350
        val current = 1

        println( "-- creatin new ProgressBar object")
        val a = ProgressBar(345, 100)
        println("-- testing params testing")
        a.set_params(_length = 100, _carriage_return = true, _units = " seconds", _display_duration = false)
        println("-- testing printing")
        a.display()

        for (x in 100 .. 345){
            Thread.sleep(90)
            a.next()
        }
    }

}

fun header() {
    println("\nIbrar Yunus <University of St. Andrews")
}
