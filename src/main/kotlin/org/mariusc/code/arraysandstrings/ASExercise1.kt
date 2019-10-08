package org.mariusc.code.arraysandstrings

fun String.hasUniqueCharacters(): Boolean {
    val a = IntArray(255) {
        0
    }

    var pointer = 0
    while (pointer < this.length) {
        val charIndex = this.codePointAt(pointer)
        a[charIndex]++
        if (a[charIndex] > 1) {
            return false
        }

        pointer += Character.charCount(charIndex)
    }

    return true
}