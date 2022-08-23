package com.example.mytest.AcceptanceTest

import com.example.mytest.Car
import com.example.mytest.Engine
import com.example.outsideintddexample.acceptancetests.MainCoroutineScopeRule
import kotlinx.coroutines.test.runTest
import org.junit.Assert.*
import org.junit.Rule
import org.junit.Test

class carIs {

    val engine = Engine(95, false)
    val car = Car(6.0, engine)

    @get:Rule
    var coroutinesTestRule = MainCoroutineScopeRule()

    @Test
    fun carIslosingFuel() = runTest{
        car.turnOn()

        assertEquals(5.5, car.fuel, 0.2)

    }

    @Test
    fun carIsTurningOnAndIncreasingTemperature() = runTest{

        car.turnOn()

        assertEquals(95, car.engine.temp)
        assertTrue(car.engine.isTurnedOn)
    }


}