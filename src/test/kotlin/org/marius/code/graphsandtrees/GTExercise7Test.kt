package org.marius.code.graphsandtrees

import org.junit.Before
import org.mariusc.code.graphsandtrees.BTree
import org.assertj.core.api.Assertions.assertThat
import org.junit.Test
import org.mariusc.code.graphsandtrees.findFirstCommonParent

class GTExercise7Test {


    lateinit var underTest: BTree<Int>

    @Before
    fun setUp() {
        underTest = BTree()
        underTest.add(5)
        underTest.add(2)
        underTest.add(7)
        underTest.add(1)
        underTest.add(3)
        underTest.add(6)
        underTest.add(8)
        underTest.add(4)
        underTest.add(9)

    }

    @Test
    fun testCase1() {
        assertThat(underTest.findFirstCommonParent(6, 8)).isEqualTo(7)
    }

    @Test
    fun testCase2() {
        assertThat(underTest.findFirstCommonParent(1, 9)).isEqualTo(5)
    }
}