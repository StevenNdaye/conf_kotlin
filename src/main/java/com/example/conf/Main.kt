package com.example.conf

import com.example.conf.kotlin.Color
import com.example.conf.kotlin.Color.*

fun main(args: Array<String>) {
    println("Hello, world!")
    println(max(1, 2))

    val name = if (args.isNotEmpty()) args[0] else "Kotlin"

    if (args.isNotEmpty()) println("Hello, ${args[0]}")

    println("Hello, ${if (args.isNotEmpty()) args[0] else "someone"}")

    println("Hello, $name!")

    println(getMnemonic(BLUE))

    println(getWarm(ORANGE))

    println(mix(BLUE, YELLOW))

    println(mixOptimized(BLUE, YELLOW))
}

//block body
fun max(a: Int, b: Int): Int {
    return if (a > b) a else b
}

//expression body
fun max2(a: Int, b: Int): Int = if (a > b) a else b

//We can even ignore the return type, for expression body. This is referred to as type inference
fun max3(a: Int, b: Int) = if (a > b) a else b

val question = "The ultimate question of life, the universe and everything"
val answer = 42
val answer1: Int = 42
val yearsToCompute = 7.5e6

val answer3: Int = 42

fun getMnemonic(color: Color) =
        when (color) {
            RED -> "Richard"
            ORANGE -> "Of"
            YELLOW -> "York"
            GREEN -> "Gave"
            BLUE -> "Battle"
            INDIGO -> "In"
            VIOLET -> "Vain"
        }


fun getWarm(color: Color) = when (color) {
    RED, ORANGE, YELLOW -> "warm"
    GREEN -> "neutral"
    BLUE, INDIGO, VIOLET -> "cold"
}

fun mix(color1: Color, color2: Color) = when (setOf(color1, color2)) {
    setOf(RED, YELLOW) -> ORANGE
    setOf(YELLOW, BLUE) -> GREEN
    setOf(BLUE, VIOLET) -> INDIGO
    else -> throw Exception("Dirty color")
}

fun mixOptimized(c1: Color, c2: Color) = when {
    (c1 == RED && c2 == YELLOW) || (c1 == YELLOW && c2 == RED) -> ORANGE
    (c1 == YELLOW && c2 == BLUE) || (c1 == BLUE && c2 == YELLOW) -> GREEN
    (c1 == BLUE && c2 == VIOLET) || (c1 == VIOLET && c2 == BLUE) -> INDIGO
    else -> throw Exception("Dirty color")
}


