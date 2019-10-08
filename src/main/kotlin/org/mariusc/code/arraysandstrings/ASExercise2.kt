package org.mariusc.code.arraysandstrings

fun String.isPermutationOf(s: String): Boolean {
    if (s.length != this.length) {
        return false
    }
    val a = IntArray(255) { 0 }
    var pointer = 0
    while (pointer < this.length) {
        val asciiIndex = this.codePointAt(pointer)
        // increment pointer
        a[asciiIndex]++
        pointer += Character.charCount(asciiIndex)
    }
    pointer = 0
    var matches = this.length
    while (pointer < s.length) {
        val asciiIndex = s.codePointAt(pointer)
        if (a[asciiIndex] > 0) {
            a[asciiIndex]--
            matches--
        }
        pointer += Character.charCount(asciiIndex)
    }

    return matches == 0
}