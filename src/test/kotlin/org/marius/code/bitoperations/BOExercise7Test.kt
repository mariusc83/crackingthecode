package org.marius.code.bitoperations

import org.junit.Test
import org.assertj.core.api.Assertions.assertThat
import org.mariusc.code.bitoperations.flipEventWithOddBits

class BOExercise7Test {

    @Test
    fun testCase1(){
        assertThat(1.flipEventWithOddBits()).isEqualTo(2)
    }

    @Test
    fun testCase2(){
        assertThat(3.flipEventWithOddBits()).isEqualTo(3    )
    }
}