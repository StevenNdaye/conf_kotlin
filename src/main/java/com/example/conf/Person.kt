package com.example.conf

data class Person(val name: String, val age: Int? = null)

fun main() {
    val people = listOf(Person("Alice"), Person("Bob", age = 29))
    val oldest = people.maxBy { it.age ?: 0 }
    println("The oldest is: $oldest")
}
