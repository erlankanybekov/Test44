package com.example.test44

import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.action.ViewActions.click

import androidx.test.espresso.action.ViewActions.typeText
import androidx.test.espresso.assertion.ViewAssertions.matches
import androidx.test.espresso.matcher.ViewMatchers.withId
import androidx.test.espresso.matcher.ViewMatchers.withText
import androidx.test.ext.junit.rules.ActivityScenarioRule


import org.junit.After
import org.junit.Test


import org.junit.Assert.*
import org.junit.Before

import androidx.test.platform.app.InstrumentationRegistry
import androidx.test.ext.junit.runners.AndroidJUnit4

import org.junit.runner.RunWith

import org.junit.Assert.*
import org.junit.Rule

/**
 * Instrumented test, which will execute on an Android device.
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */
@RunWith(AndroidJUnit4::class)
class MainActivityTest {

    @Rule @JvmField
   open var rule:ActivityScenarioRule<*> = ActivityScenarioRule(MainActivity::class.java)


    var math:Math? = null

    @Before
    fun init(){
        math = Math()
    }

    @Test
    fun simpleAdd() {
        onView(withId(R.id.firstNum)).perform(typeText("2"))
        onView(withId(R.id.secondNum)).perform(typeText("2"))
        onView(withId(R.id.calculate)).perform(click())
        onView(withId(R.id.txtRes)).check(matches(withText("4")))

    }
    @Test
    fun simpleDivide() {
        onView(withId(R.id.firstNum)).perform(typeText("2"))
        onView(withId(R.id.secondNum)).perform(typeText("0"))
        onView(withId(R.id.calculate)).perform(click())
        onView(withId(R.id.txtRes)).check(matches(withText("на ноль делить нельзя")))

    }


    @After
    fun detach() {
        math = null
    }



}