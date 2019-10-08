package org.marius.code.linkedlists

import org.junit.Before
import org.mariusc.code.linkedlists.LinkedList
import org.assertj.core.api.Assertions.assertThat
import org.junit.Test
import org.mariusc.code.linkedlists.isPalindrome

class LLExercise5Test {

    lateinit var underTest: LinkedList<Char>

    @Before
    fun setUp(){
        underTest = LinkedList()
    }

    @Test
    fun testCase1(){
        underTest.add('a')
        underTest.add('b')
        underTest.add('c')
        underTest.add('b')
        underTest.add('a')

        assertThat(underTest.isPalindrome()).isTrue()
    }

    @Test
    fun testCase2(){
        underTest.add('a')
        underTest.add('b')
        underTest.add('c')
        underTest.add('d')
        underTest.add('e')

        assertThat(underTest.isPalindrome()).isFalse()
    }

    @Test
    fun testCase3(){
        underTest.add('a')
        underTest.add('b')
        underTest.add('b')
        underTest.add('a')

        assertThat(underTest.isPalindrome()).isTrue()
    }

    @Test
    fun testCase4(){
        assertThat(underTest.isPalindrome()).isTrue()
    }
}