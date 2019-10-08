package org.marius.code.arraysandstrings

import org.junit.Test
import org.assertj.core.api.Assertions.assertThat
import org.mariusc.code.arraysandstrings.simpleCompression

class ASExercise6Test {

    @Test
    fun testCase1() {
        val s = "ssaabbcccdd"
        assertThat(s.simpleCompression()).isEqualTo("s2a2b2c3d2")
    }

    @Test
    fun testCase2() {
        val s = "s"
        assertThat(s.simpleCompression()).isEqualTo("s")
    }

    @Test
    fun testCase3() {
        val s = ""
        assertThat(s.simpleCompression()).isEqualTo("")
    }
}