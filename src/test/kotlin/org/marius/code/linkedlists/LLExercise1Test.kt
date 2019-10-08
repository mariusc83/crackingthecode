package org.marius.code.linkedlists

import org.junit.Before
import org.junit.Test
import org.mariusc.code.linkedlists.LinkedList
import org.assertj.core.api.Assertions.assertThat
import org.mariusc.code.linkedlists.removeDuplicates

class LLExercise1Test {

    lateinit var underTest: LinkedList<Int>

    @Before
    fun setUp() {
        underTest = LinkedList()
    }


    @Test
    fun testCase1() {
        underTest.removeDuplicates()
        assertThat(underTest.toString()).isEqualTo("")
    }

    @Test
    fun testCase2() {
        underTest.add(1)
        underTest.add(1)
        underTest.add(2)
        underTest.add(1)
        underTest.add(3)
        underTest.add(2)
        underTest.add(3)
        underTest.removeDuplicates()
        assertThat(underTest.toString()).isEqualTo("1 - 2 - 3")
    }

}