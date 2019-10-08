package org.marius.code.stacksandqueues

import org.junit.Before
import org.junit.Test
import org.mariusc.code.linkedlists.LinkedList
import org.mariusc.code.stacksandqueues.ThreeStacks
import org.assertj.core.api.Assertions.assertThat

class ThreeStacksTest {

    lateinit var underTest: ThreeStacks
    lateinit var stack1: LinkedList<Int>
    lateinit var stack2: LinkedList<Int>
    lateinit var stack3: LinkedList<Int>

    @Before
    fun setUp() {
        stack1 = LinkedList()
        stack2 = LinkedList()
        stack3 = LinkedList()
    }

    @Test
    fun testCase1() {
        stack1.add(1)
        stack1.add(2)
        stack2.add(3)
        stack2.add(4)
        stack3.add(5)
        stack3.add(6)

        underTest = ThreeStacks(stack1, stack2, stack3)

        assertThat(underTest.pop(0)).isEqualTo(1)
        assertThat(underTest.pop(1)).isEqualTo(3)
        assertThat(underTest.pop(0)).isEqualTo(2)
        assertThat(underTest.pop(2)).isEqualTo(5)
        assertThat(underTest.pop(2)).isEqualTo(6)
        assertThat(underTest.pop(2)).isNull()
    }
}