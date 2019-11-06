package org.marius.code.graphsandtrees

import org.junit.Before
import org.junit.Test
import org.mariusc.code.graphsandtrees.BTree
import org.assertj.core.api.Assertions.assertThat

class BTreeTest {

    lateinit var underTest: BTree<Int>

    @Before
    fun setUp(){
        underTest = BTree()
    }

    @Test
    fun testAddInAscendingOrder(){
        underTest.add(0)
        underTest.add(1)
        underTest.add(2)
        underTest.add(3)
        underTest.add(4)

        assertThat(underTest.toString().trim()).isEqualTo("0\n1\n2\n3\n4")
    }

    @Test
    fun testBinaryTreeOrder(){
        underTest.add(2)
        underTest.add(1)
        underTest.add(4)
        underTest.add(0)
        underTest.add(3)
        underTest.add(5)

        assertThat(underTest.toString().trim()).isEqualTo("2\n1 4\n0 3 5")
    }
}