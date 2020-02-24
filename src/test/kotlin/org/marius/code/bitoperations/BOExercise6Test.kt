package org.marius.code.bitoperations

import org.junit.Test
import org.assertj.core.api.Assertions.assertThat
import org.mariusc.code.bitoperations.diffsInBits

class BOExercise6Test{

    @Test
    fun testCase1(){
        assertThat(7.diffsInBits(13)).isEqualTo(2)
    }

    @Test
    fun testCase2(){
        assertThat(8.diffsInBits(4)).isEqualTo(2)
    }

    @Test
    fun testCase3(){
        assertThat(0.diffsInBits(0)).isEqualTo(0)
    }
}