package org.marius.code.arraysandstrings
import org.assertj.core.api.Assertions.assertThat
import org.junit.Test
import org.mariusc.code.arraysandstrings.isPermutationOf
import org.mariusc.code.arraysandstrings.isRotationOf

class ASExercise9Test {

    @Test
    fun testCase1(){
        val s = "helloworld"
        assertThat(s.isRotationOf("worldhello")).isTrue()
    }

    @Test
    fun testCase2(){
        val s = "helloworld"
        assertThat(s.isRotationOf("dlhellowor")).isFalse()
    }

    @Test
    fun testCase5(){
        val s = "helloworld"
        assertThat(s.isRotationOf("ldhellowor")).isTrue()
    }

    @Test
    fun testCase3(){
        val s = "helloworld"
        assertThat(s.isRotationOf("helloworlds")).isFalse()
    }

    @Test
    fun testCase4(){
        val s = "helloworlds"
        assertThat(s.isRotationOf("helloworld")).isFalse()
    }
}