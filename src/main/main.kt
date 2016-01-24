package main

import java.io.File

/**
 * Created by voddan on 24/01/16.
 */

fun main(args: Array<String>) {
    println("hello!")

    val f = File("output.txt")
    f.appendText("hi there, ${f.length()}!\n")
}

class KT {
    companion object {
        @JvmStatic fun main(args: Array<String>) {
            println("jvmstatic!")
        }
    }
}