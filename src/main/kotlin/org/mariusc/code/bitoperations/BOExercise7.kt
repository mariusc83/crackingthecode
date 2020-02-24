package org.mariusc.code.bitoperations

fun Int.flipEventWithOddBits(): Int {
    var mask = 1
    var toReturn = this
    repeat(Int.SIZE_BITS / 2) {
        var clearEvenBitMask = mask.inv()
        val evenBit = mask.and(this).shl(1)
        mask = mask.shl(1)
        var clearOddBitMask = mask.inv()
        val oddBit = mask.and(this).shr(1)

        // switch bits
        toReturn = toReturn.and(clearEvenBitMask)
        toReturn = toReturn.or(oddBit)
        toReturn = toReturn.and(clearOddBitMask)
        toReturn = toReturn.or(evenBit)

        // update mask to next bit
        mask = mask.shl(1)
    }
    return toReturn
}