package org.marius.code.graphsandtrees

import org.junit.Before
import org.junit.Test
import org.mariusc.code.graphsandtrees.BTree
import org.assertj.core.api.Assertions.assertThat
import org.mariusc.code.graphsandtrees.isBST

class GTExercise5Test {
    lateinit var underTest:BTree<Int>


    @Before
    fun  setUp(){
        underTest = BTree()
    }
    @Test
    fun testCase1(){
        underTest.add(5)
        underTest.add(3)
        underTest.add(7)
        underTest.add(2)
        underTest.add(4)
        underTest.add(7)
        underTest.add(8)

        assertThat(underTest.isBST()).isTrue()
    }

    @Test
    fun testCase2(){
        underTest.add(1)
        underTest.add(2)
        underTest.add(3)
        underTest.add(4)
        underTest.add(5)
        underTest.add(6)
        underTest.add(7)


        assertThat(underTest.isBST()).isFalse()

    }
}