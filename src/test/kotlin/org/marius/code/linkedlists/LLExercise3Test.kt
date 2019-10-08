package org.marius.code.linkedlists

import org.junit.Before
import org.mariusc.code.linkedlists.LinkedList
import org.mariusc.code.linkedlists.reorderAfter
import org.assertj.core.api.Assertions.assertThat
import org.junit.Test


class LLExercise3Test {

    lateinit var underTest: LinkedList<Int>

    @Before
    fun setUp() {
        underTest = LinkedList()
    }

    @Test
    fun testCase1() {
        underTest = LinkedList()
        underTest.add(3)
        underTest.add(5)
        underTest.add(8)
        underTest.add(5)
        underTest.add(10)
        underTest.add(2)
        underTest.add(1)

        underTest.reorderAfter(5)
        assertThat(underTest.toString()).isEqualTo("1 - 2 - 3 - 5 - 8 - 5 - 10")

    }
}