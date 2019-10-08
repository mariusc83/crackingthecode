package org.mariusc.code.arraysandstrings

import java.lang.StringBuilder

fun String.simpleCompression(): String {
    if (isEmpty()) return this

    val sb = StringBuilder()
    var counter = 1
    for (i in 1 until length) {
        if (this[i] == this[i - 1]) {
            counter++
        } else {
            appendChar(counter, sb, i)
            counter = 1
        }
    }
    appendChar(counter, sb, length)

    return sb.toString()
}

private fun String.appendChar(counter: Int, sb: StringBuilder, i: Int) {
    if (counter > 1) {
        sb.append(this[i - 1]).append(counter)
    } else {
        sb.append(this[i - 1])
    }
}