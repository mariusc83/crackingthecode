package org.marius.code.stacksandqueues

import org.junit.Before
import org.junit.Test
import org.mariusc.code.linkedlists.LinkedList
import org.assertj.core.api.Assertions.assertThat
import org.mariusc.code.stacksandqueues.sort

class SQExercise5Test {

    lateinit var underTest: LinkedList<Int>

    @Before
    fun setUp() {
        underTest = LinkedList()
    }

    @Test
    fun testCase1(){
        underTest.addFirst(3)
        underTest.addFirst(1)
        underTest.addFirst(2)
        underTest.addFirst(6)
        underTest.addFirst(3)


        assertThat(underTest.sort().toString()).isEqualTo("1 - 2 - 3 - 3 - 6")
    }
}