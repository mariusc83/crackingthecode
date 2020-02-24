package org.marius.code.bitoperations

import org.junit.Test
import org.assertj.core.api.Assertions.assertThat
import org.mariusc.code.bitoperations.max1BitsNumberSequence

class BOExercise3Test {

    @Test
    fun testCase1(){
        val underTest = 0
        assertThat(underTest.max1BitsNumberSequence()).isEqualTo(1)
    }

    @Test
    fun testCase2(){
        val underTest = 1775
        assertThat(underTest.max1BitsNumberSequence()).isEqualTo(8)
    }

}