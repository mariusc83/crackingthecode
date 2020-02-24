package org.mariusc.code.misc

import java.math.BigInteger

// 1 2 3 3 4 4 5 9
fun Array<Int>.searchLowerBound(forValue: Int): Int {
    var l = -1
    var h = this.size

    while (h - 1 > l) {
        val m = (h + l).ushr(1)
        if (this[m] >= forValue) {
            h = m
        } else {
            l = m
        }
    }

    return h
}
