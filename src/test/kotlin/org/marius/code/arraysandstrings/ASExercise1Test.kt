package org.marius.code.arraysandstrings

import org.junit.Test
import org.assertj.core.api.Assertions.assertThat
import org.mariusc.code.arraysandstrings.hasUniqueCharacters

class ASExercise1Test {

    @Test
    fun testCase1(){
        val s = "abcdefghijk"
        assertThat(s.hasUniqueCharacters()).isTrue()
    }

    @Test
    fun testCase2(){
        val s = "abcdefghijka"
        assertThat(s.hasUniqueCharacters()).isFalse()
    }
}