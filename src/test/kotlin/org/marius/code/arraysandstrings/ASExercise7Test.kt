package org.marius.code.arraysandstrings

import org.junit.Test
import org.mariusc.code.arraysandstrings.rotateNinetyDegrees
import org.assertj.core.api.Assertions.assertThat

class ASExercise7Test {

    @Test
    fun testCase1() {
        val matrix = Array<Array<Int>>(3) { outsideIndex: Int ->
            Array<Int>(3) {
                outsideIndex * 2 + it + outsideIndex
            }
        }
        matrix.rotateNinetyDegrees()

        assertThat(matrix[0]).containsExactly(6, 3, 0)
        assertThat(matrix[1]).containsExactly(7, 4, 1)
        assertThat(matrix[2]).containsExactly(8, 5, 2)
    }
}