package org.marius.code.stacksandqueues

import org.junit.Before
import org.junit.Test
import org.mariusc.code.stacksandqueues.MinHeap
import org.assertj.core.api.Assertions.assertThat


class MinHeapTest {

    lateinit var underTest: MinHeap

    @Before
    fun setUp() {
        underTest = MinHeap(10)
    }

    @Test
    fun testCase1() {
        underTest.add(3)
        underTest.add(3)
        underTest.add(6)
        underTest.add(2)
        underTest.add(1)
        underTest.add(8)
        underTest.add(10)

        assertThat(underTest.peek()).isEqualTo(1)
    }

    @Test
    fun testCase2() {
        underTest.add(3)
        underTest.add(3)
        underTest.add(6)
        underTest.add(2)
        underTest.add(1)
        underTest.add(8)
        underTest.add(10)

        assertThat(underTest.pop()).isEqualTo(1)
        assertThat(underTest.pop()).isEqualTo(2)
        assertThat(underTest.pop()).isEqualTo(3)
        assertThat(underTest.pop()).isEqualTo(3)
        assertThat(underTest.pop()).isEqualTo(6)
        assertThat(underTest.pop()).isEqualTo(8)
        assertThat(underTest.pop()).isEqualTo(10)
    }
}