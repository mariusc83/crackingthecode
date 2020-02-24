package org.mariusc.code.bitoperations

fun Int.nextLarger(): Int {
    if (this == Int.MAX_VALUE) {
        return this
    }
    var counter = Int.SIZE_BITS - 2
    var mask = 1.shl(counter)

    while (counter > 0) {
        if (this.and(mask) != 0) {

            do {
                mask = mask.shr(1)
                counter--
                if (this.and(mask) == 0) {
                    val toMaskToRemaining0 = Int.MAX_VALUE.shl(counter)
                    var toModify = this.and(toMaskToRemaining0)
                    return toModify.or(mask)
                }
            } while (counter >= 0)

            return this
        }
        mask = mask.shr(1)
        counter--


    }

    return this
}

fun Int.nextSmaller(): Int {
    if (this == 0) return 0
    var counter = 0
    var mask = 1

    while (counter < Int.SIZE_BITS) {
        if (this.and(mask) != 0) {
            return this.xor(mask)
        }
        mask = mask.shl(1)
        counter++
    }

    return this
}