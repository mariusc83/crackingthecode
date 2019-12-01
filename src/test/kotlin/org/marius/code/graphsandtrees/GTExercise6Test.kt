package org.marius.code.graphsandtrees

import org.junit.Before
import org.junit.Test
import org.mariusc.code.graphsandtrees.Graph
import org.assertj.core.api.Assertions.assertThat
import org.mariusc.code.graphsandtrees.projectsPath

class GTExercise6Test {
    lateinit var underTest: Graph<Char>


    @Before
    fun setUp() {
        underTest = Graph()
    }

    @Test
    fun testCase1() {
        underTest.addVertex('a')
        underTest.addVertex('b')
        underTest.addVertex('c')
        underTest.addVertex('d')
        underTest.addVertex('e')
        underTest.addVertex('f')

        underTest.addEdge('d','a')
        underTest.addEdge('d','b')
        underTest.addEdge('a','f')
        underTest.addEdge('c','d')
        underTest.addEdge('b','f')
        assertThat(underTest.projectsPath()).isEqualTo("fabdce")
    }

}