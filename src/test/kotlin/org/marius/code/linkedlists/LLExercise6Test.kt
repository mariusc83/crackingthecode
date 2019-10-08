package org.marius.code.linkedlists

import org.junit.Before
import org.junit.Test
import org.mariusc.code.linkedlists.LinkedList
import org.mariusc.code.linkedlists.Node
import org.assertj.core.api.Assertions.assertThat
import org.mariusc.code.linkedlists.findCircularNode

class LLExercise6Test {

    lateinit var underTest: LinkedList<Int>

    @Before
    fun setUp() {
        underTest = LinkedList()
    }

    @Test
    fun testCase1() {
        val node1 = Node<Int>(1, null)
        val node2 = Node<Int>(2, null)
        val node3 = Node<Int>(3, null)
        val node4 = Node<Int>(4, null)
        val node5 = Node<Int>(5, null)
        val node6 = Node<Int>(6, null)
        underTest.add(node1)
        underTest.add(node2)
        underTest.add(node3)
        underTest.add(node4)
        underTest.add(node5)
        underTest.add(node6)
        underTest.add(node2)

        assertThat(underTest.findCircularNode()).isEqualTo(node2)
    }

    @Test
    fun testCase2() {
        val node1 = Node<Int>(1, null)
        val node2 = Node<Int>(2, null)
        val node3 = Node<Int>(3, null)
        val node4 = Node<Int>(4, null)
        val node5 = Node<Int>(5, null)
        val node6 = Node<Int>(6, null)
        underTest.add(node1)
        underTest.add(node2)
        underTest.add(node3)
        underTest.add(node4)
        underTest.add(node5)
        underTest.add(node6)

        assertThat(underTest.findCircularNode()).isNull()
    }
}