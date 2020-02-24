package org.mariusc.code.bitoperations

fun Int.diffsInBits(inComparisonWith: Int): Int {
    var mask = 1
    var counter = 0
    repeat(Int.SIZE_BITS - 1) {
        if (mask.and(this) != mask.and(inComparisonWith)) {
            counter++
        }
        mask = mask.shl(1)
    }

    return counter
}