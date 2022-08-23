package com.example.mytest.UnitTest

import com.example.mytest.Engine
import com.example.outsideintddexample.acceptancetests.MainCoroutineScopeRule
import kotlinx.coroutines.test.runTest
import org.junit.Assert.assertTrue
import org.junit.Rule
import org.junit.Test

class EngineShould {

    val engine = Engine(95, false)
    @get:Rule
    var coroutinesTestRule = MainCoroutineScopeRule()

    @Test
    fun turnOn() = runTest{
        engine.turnOn()

        assertTrue(engine.isTurnedOn)
    }
}