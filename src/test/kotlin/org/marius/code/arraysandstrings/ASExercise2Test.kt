package org.marius.code.arraysandstrings

import org.assertj.core.api.Assertions.assertThat
import org.junit.Test
import org.mariusc.code.arraysandstrings.isPermutationOf

class ASExercise2Test{

    @Test
    fun testCase1(){
        val s1 = "abcdeffabc"
        val s2 = "ffcbadecab"

        assertThat(s1.isPermutationOf(s2)).isTrue()
    }

    @Test
    fun testCase2(){
        val s1 = "abcdefg"
        val s2 = "abcdegg"

        assertThat(s1.isPermutationOf(s2)).isFalse()

    }

    @Test
    fun testCase3(){
        val s1 = "aaaaabbb"
        val s2 = "aaaaaabb"

        assertThat(s1.isPermutationOf(s2)).isFalse()

    }
}