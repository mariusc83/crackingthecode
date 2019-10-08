package org.marius.code.arraysandstrings

import org.junit.Test
import org.assertj.core.api.Assertions.assertThat
import org.mariusc.code.arraysandstrings.stripCharacters

class ASExercise3Test {

    @Test
    fun testCase1(){
        val s = "Mr John Smith    "
        assertThat(stripCharacters(s, 13)).isEqualTo("Mr%20John%20Smith")
    }
}