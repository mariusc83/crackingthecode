package org.mariusc.code.arraysandstrings

import java.math.BigInteger

inline fun <reified T> Array<T>.mergeSort(comparable: (T) -> BigInteger): Array<T> {
    if (size <= 1) return this
    val a = Array<Array<T>?>(size) {
        arrayOf(this[it])
    }
    var middle = a.size / 2
    var newArraySize = a.size
    while (middle > 0) {
        val prevSize = newArraySize
        val rem = newArraySize.rem(2)
        newArraySize = newArraySize / 2 + rem
        for (i in 0 until middle) {
            a[i] = merge(a[2 * i]!!, a[2 * i + 1]!!, comparable)
        }
        if (rem > 0) {
            a[newArraySize - 1] = a[prevSize - 1]
        }
        middle = newArraySize / 2
    }

    return a[0]!!
}

inline fun <reified T> merge(a: Array<T>, b: Array<T>, comparable: (T) -> BigInteger): Array<T> {
    var aIndex = 0
    var bIndex = 0
    var i = 0
    val merged = arrayOfNulls<T>(a.size + b.size)
    while (aIndex < a.size && bIndex < b.size) {
        val comparableA = comparable(a[aIndex])
        val comparableB = comparable(b[bIndex])
        when {
            comparableA < comparableB -> {
                merged[i] = a[aIndex]
                aIndex++
            }
            comparableB < comparableA -> {
                merged[i] = b[bIndex]
                bIndex++
            }
            else -> {
                merged[i] = a[aIndex]
                i++
                merged[i] = b[bIndex]
                bIndex++
                aIndex++
            }
        }
        i++
    }

    while (aIndex < a.size) {
        merged[i] = a[aIndex]
        aIndex++
        i++
    }
    while (bIndex < b.size) {
        merged[i] = b[bIndex]
        bIndex++
        i++
    }

    return merged as Array<T>
}

