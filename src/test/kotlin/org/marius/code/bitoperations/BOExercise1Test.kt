package org.marius.code.bitoperations

import org.mariusc.code.bitoperations.merge
import org.assertj.core.api.Assertions.assertThat
import org.junit.Test

class BOExercise1Test {

    @Test
    fun testCase1() {
        val number = 0b10000000000
        val merged = number.merge(0b10011, 2)
        assertThat(Integer.toBinaryString(merged)).isEqualTo("10001001100")
    }

}