package org.marius.code.linkedlists

import org.junit.Before
import org.junit.Test
import org.mariusc.code.linkedlists.LinkedList
import org.assertj.core.api.Assertions.assertThat
import org.mariusc.code.linkedlists.elementAtPosFromTail

class LLExercise2Test {

    lateinit var underTest: LinkedList<Int>

    @Before
    fun setUp(){
        underTest = LinkedList()
    }

    @Test
    fun testCase1(){
        underTest.add(1)
        underTest.add(2)
        underTest.add(3)
        underTest.add(4)

        assertThat(underTest.elementAtPosFromTail(1)).isEqualTo(3)
    }

    @Test
    fun testCase2(){
        underTest.add(1)
        underTest.add(2)
        underTest.add(3)
        underTest.add(4)

        assertThat(underTest.elementAtPosFromTail(3)).isEqualTo(1)

    }

    @Test
    fun testCase3(){
        underTest.add(1)
        underTest.add(2)
        underTest.add(3)
        underTest.add(4)

        assertThat(underTest.elementAtPosFromTail(0)).isEqualTo(4)

    }

    @Test
    fun testCase4(){
        underTest.add(1)
        underTest.add(2)
        underTest.add(3)
        underTest.add(4)

        assertThat(underTest.elementAtPosFromTail(5)).isNull()

    }
}