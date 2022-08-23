package com.example.mytest.UnitTest

import com.example.mytest.Car
import com.example.mytest.Engine
import com.example.outsideintddexample.acceptancetests.MainCoroutineScopeRule
import com.nhaarman.mockitokotlin2.mock
import com.nhaarman.mockitokotlin2.times
import com.nhaarman.mockitokotlin2.verify
import kotlinx.coroutines.test.runTest
import org.junit.Assert.assertEquals
import org.junit.Rule
import org.junit.Test

class CarShould {

    val engine: Engine = mock()
    val car = Car( 5.0, engine)

    @get:Rule
    var coroutinesTestRule = MainCoroutineScopeRule()

    @Test
    fun loseFuelWhenTurnedOn() = runTest{
        car.turnOn()

        assertEquals("error", 4.5, car.fuel, 0.2)
    }

    @Test
    fun turnOnEngine() = runTest{
        car.turnOn()

        verify(engine, times(1)).turnOn()
    }

}
