package org.marius.code.bitoperations

import org.junit.Test
import org.assertj.core.api.Assertions.assertThat
import org.mariusc.code.bitoperations.nextLarger
import org.mariusc.code.bitoperations.nextSmaller

class BOExercise4Test {

    @Test
    fun smallerTestCase1() {
        assertThat(0.nextSmaller()).isEqualTo(0)
    }

    @Test
    fun smallerTestCase2() {
        assertThat(5.nextSmaller()).isEqualTo(4)
    }

    @Test
    fun smallerTestCase3() {
        assertThat(Int.MAX_VALUE.nextSmaller()).isEqualTo(Int.MAX_VALUE - 1)
    }

    @Test
    fun largerTestCase1() {
        assertThat(Int.MAX_VALUE.nextLarger()).isEqualTo(Int.MAX_VALUE)
    }

    @Test
    fun largerTestCase2() {
        assertThat(5.nextLarger()).isEqualTo(6)
    }

    @Test
    fun largerTestCase3() {
        assertThat((Int.MAX_VALUE-1).nextLarger()).isEqualTo(Int.MAX_VALUE)
    }

}