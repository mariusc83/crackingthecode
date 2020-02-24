package org.marius.code.misc

import org.assertj.core.api.Assertions.assertThat
import org.junit.Test
import org.mariusc.code.misc.searchLowerBound

class ArrayExtTest {

    @Test
    fun searchLowerBandTestCase1() {
        val toTest = arrayOf(1, 2, 3, 3, 4, 5, 7)
        assertThat(toTest.searchLowerBound(3)).isEqualTo(2)
    }

    @Test
    fun searchLowerBandTestCas2() {
        val toTest = emptyArray<Int>()
        assertThat(toTest.searchLowerBound(3)).isEqualTo(0)
    }

    @Test
    fun searchLowerBandTestCase3() {
        val toTest = arrayOf(1)
        assertThat(toTest.searchLowerBound(1)).isEqualTo(0)
    }

}