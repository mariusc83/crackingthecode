package org.marius.code.graphsandtrees

import org.mariusc.code.graphsandtrees.createBinaryTree
import org.assertj.core.api.Assertions.assertThat
import org.junit.Test
import org.mariusc.code.graphsandtrees.BTree
import org.mariusc.code.graphsandtrees.isBalanced


class GTExercise4Test {

    @Test
    fun testCase1(){
        val bTree = createBinaryTree(intArrayOf(0, 1, 2, 3, 4, 5, 6))
        assertThat(bTree.isBalanced()).isTrue()
    }

    @Test
    fun testCase2(){
        val bTree = BTree<Int>()
        bTree.add(0)
        bTree.add(1)
        bTree.add(2)
        bTree.add(3)
        bTree.add(4)
        bTree.add(5)
        assertThat(bTree.isBalanced()).isFalse()
    }
}