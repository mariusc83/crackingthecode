package org.mariusc.code.arraysandstrings

fun String.isRotationOf(s: String): Boolean {
    if (s.length != this.length) return false
    val newString = this + this
    return newString.contains(s)
}