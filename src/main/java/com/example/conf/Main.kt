package com.example.conf

fun main(args: Array<String>) {
    println("Hello, world!")
    println(max(1, 2))

    val name = if (args.isNotEmpty()) args[0] else "Kotlin"

    if (args.isNotEmpty()) println("Hello, ${args[0]}")

    println("Hello, ${if (args.isNotEmpty()) args[0] else "someone"}")

    println("Hello, $name!")
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
