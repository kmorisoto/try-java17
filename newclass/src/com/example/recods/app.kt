package com.example

import com.example.recods.User

fun main() {
    val user1 = User("a")
    val user2 = User("ab")
    println(user1)
    println(user1.name)
    println(user1.foo())
    println(user2)
    println(user2 == user1)
}
