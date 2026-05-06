package oop_00000128606_keishaarialai.week11

import oop_00000128606_keishaarialai.week10.Box

// Extension function dengan receiver 'this'
fun String.addGreeting(): String {
    return "Hello, $this"
}

// Extension function dengan parameter
fun String.repeatTimes(n: Int): String {
    return this.repeat(n)
}

fun String?.isNullOrEmptyCustom(): Boolean {
    //'this' bisa bernilai null, jadi harus ditangani
    return this == null || this.isEmpty()
}