package org.mariusc.code.bitoperations


fun Int.merge(another: Int, to: Int): Int {
    val toAdd = another.shl(to)
    return this.or(toAdd)
}