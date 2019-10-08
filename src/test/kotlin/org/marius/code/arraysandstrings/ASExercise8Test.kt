package org.marius.code.arraysandstrings

import org.junit.Test
import org.mariusc.code.arraysandstrings.emptyColumnsAndRows
import org.assertj.core.api.Assertions.assertThat

class ASExercise8Test {


    @Test
    fun testCase1() {
        val m = Array<Array<Int>>(3) {
            when (it) {
                0 -> arrayOf(1, 5, 0)
                1 -> arrayOf(7, 0, 4)
                else -> arrayOf(9, 1, 2)
            }
        }
        m.emptyColumnsAndRows()

        m.forEachIndexed { index, a ->
            when (index) {
                0 -> assertThat(a).containsExactly(0, 0, 0)
                1 -> assertThat(a).containsExactly(0, 0, 0)
                2 -> assertThat(a).containsExactly(9, 0, 0)
            }
        }
    }

    @Test
    fun testCase2() {
        val m = Array<Array<Int>>(1) {
            arrayOf(1, 5, 0)
        }
        m.emptyColumnsAndRows()

        m.forEachIndexed { index, a ->
            when (index) {
                0 -> assertThat(a).containsExactly(0, 0, 0)
            }
        }
    }

    @Test
    fun testCase3() {
        val m = Array<Array<Int>>(3) {
            when (it) {
                0 -> arrayOf(1)
                1 -> arrayOf(7)
                else -> arrayOf(0)
            }
        }
        m.emptyColumnsAndRows()

        m.forEachIndexed { index, a ->
            when (index) {
                0 -> assertThat(a).containsExactly(0)
                1 -> assertThat(a).containsExactly(0)
                2 -> assertThat(a).containsExactly(0)
            }
        }
    }
}