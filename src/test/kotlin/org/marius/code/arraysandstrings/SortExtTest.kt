package org.marius.code.arraysandstrings

import org.assertj.core.api.Assertions.assertThat
import org.junit.Test
import org.mariusc.code.arraysandstrings.mergeSort
import java.math.BigInteger


class SortExtTest {


    @Test
    fun mergeSortTestCase1() {
        val underTest = arrayOf(0, 2, 4, 2, 5, 8)
        assertThat(underTest.mergeSort { it.toBigInteger() }).containsExactly(0, 2, 2, 4, 5, 8)
    }

    @Test
    fun mergeSortTestCase2() {
        val underTest = arrayOf(0, 1, 2, 3, 4, 5)
        assertThat(underTest.mergeSort { it.toBigInteger() }).containsExactly(0, 1, 2, 3, 4, 5)
    }

    @Test
    fun mergeSortTestCase3() {
        val v1 = View(0.0f, true)
        val v2 = View(1.0f, true)
        val v3 = View(2.0f, true)
        val underTest = arrayOf(v1, v2, v3)
        assertThat(underTest.mergeSort { it.resolveComparable() }).containsExactly(v1, v2, v3)
    }

    @Test
    fun mergeSortTestCase4() {
        val v1 = View(0.0f, true)
        val v2 = View(1.0f, true)
        val v3 = View(2.0f, false)
        val underTest = arrayOf(v1, v2, v3)
        assertThat(underTest.mergeSort { it.resolveComparable() }).containsExactly(v3, v1, v2)
    }

    @Test
    fun mergeSortTestCase5() {
        val v1 = View(0.0f, false)
        val v2 = View(1.0f, false)
        val v3 = View(2.0f, false)
        val underTest = arrayOf(v1, v2, v3)
        assertThat(underTest.mergeSort { it.resolveComparable() }).containsExactly(v1, v2, v3)
    }

    data class View(val zOrder: Float, val isVisible: Boolean) {
        companion object {
            val VISIBLE: BigInteger = 1.toBigInteger().shiftLeft(64)
            val INVISIBLE: BigInteger = 0.toBigInteger().shiftLeft(64)

        }


        fun resolveComparable(): BigInteger {
            val visibility = if (isVisible) VISIBLE else INVISIBLE
            return visibility.or(zOrder.toInt().toBigInteger())
        }

    }
}