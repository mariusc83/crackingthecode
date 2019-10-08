package org.marius.code.stacksandqueues

import org.junit.Before
import org.junit.Test
import org.mariusc.code.stacksandqueues.QueueWithStacks
import org.assertj.core.api.Assertions.assertThat

class QueueWithStacksTest {

    lateinit var underTest: QueueWithStacks

    @Before
    fun setUp() {
        underTest = QueueWithStacks()
    }

    @Test
    fun testCase1() {

        assertThat(underTest.peek()).isNull()
        assertThat(underTest.pop()).isNull()
        val list = mutableListOf<Int>()
        underTest.iterator().forEach {
            list.add(it)
        }

        assertThat(list).isEmpty()
    }

    @Test
    fun testCase2() {
        underTest.add(1)
        underTest.add(2)
        underTest.add(3)
        underTest.add(4)

        val list = mutableListOf<Int>()
        underTest.iterator().forEach {
            list.add(it)
        }

        assertThat(list).containsExactly(1, 2, 3, 4)
        assertThat(underTest.pop()).isEqualTo(1)
        assertThat(underTest.peek()).isEqualTo(2)
        assertThat(underTest.peek()).isEqualTo(2)
        assertThat(underTest.pop()).isEqualTo(2)

        val list1 = mutableListOf<Int>()
        underTest.iterator().forEach {
            list1.add(it)
        }

        assertThat(list1).containsExactly(3, 4)
    }
}