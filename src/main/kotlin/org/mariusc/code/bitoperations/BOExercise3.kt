package org.mariusc.code.bitoperations

fun Int.max1BitsNumberSequence(): Int {
    var mask1 = 1
    var counter = 0
    var toReturn = 0
    var bitsOf1Counter = 0
    var bits0Number = 0
    while (counter < Integer.BYTES * 8) {
        if (this.and(mask1) == 0) {
            bits0Number++
        }

        if (bits0Number > 1) {
            if (bitsOf1Counter > toReturn) {
                toReturn = bitsOf1Counter
            }
            bitsOf1Counter = 0
            bits0Number = 0
        } else {
            bitsOf1Counter++
        }
        mask1 = mask1.shl(1)
        counter++
    }
    return toReturn
}