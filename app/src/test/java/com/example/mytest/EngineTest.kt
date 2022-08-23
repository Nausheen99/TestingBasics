package com.example.mytest

import com.example.outsideintddexample.acceptancetests.MainCoroutineScopeRule
import com.nhaarman.mockitokotlin2.mock
import kotlinx.coroutines.test.runBlockingTest
import kotlinx.coroutines.test.runTest
import org.junit.Test

import org.junit.Assert.*
import org.junit.Rule

class EngineTest {

    @get:Rule
    var coroutinesTestRule = MainCoroutineScopeRule()

    private val engine :Engine = mock()
    @Test
    fun engineOnTest() = runTest{
        engine.turnOn()

        assertEquals(true, engine.isTurnedOn)
        assertEquals(95, engine.temp)
    }

    @Test
    fun engineOffTest() = runTest{
        engine.turnOff()

        assertEquals(false, engine.isTurnedOn)
        assertEquals(20, engine.temp)
    }
}