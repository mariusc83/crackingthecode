package org.marius.code.arraysandstrings

import org.junit.Test
import org.assertj.core.api.Assertions.assertThat
import org.mariusc.code.arraysandstrings.hasAPalyndromePermutation

class ASExercise4Test
{

    @Test
    fun testCase1(){
        val s = "tact coa"
        assertThat(s.hasAPalyndromePermutation())
    }

    @Test
    fun testCase2(){

    }
}