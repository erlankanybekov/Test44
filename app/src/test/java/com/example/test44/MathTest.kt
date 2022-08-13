package com.example.test44
import junit.framework.Assert.assertEquals
import org.junit.After
import org.junit.Before
import org.junit.Test

class MathTest {

     var math:Math? = null
    @Before
    fun init(){
        math = Math()
    }

    @Test
    fun simpleAdd(){
        assertEquals("4",math?.add("2","2"))
    }
    @Test
    fun negativeAdd(){
        assertEquals("4",math?.add("6","-2"))

    }
    @Test
    fun withDotAdd(){
        assertEquals(" у вас лишняя точка",math?.add("2.","2"))
    }
    @Test
    fun floatAdd(){
        assertEquals("4.0",math?.add("2f","2f"))
    }
    @Test
    fun zeroAdd(){
        assertEquals("4",math?.add("02","02"))
    }
    @Test
    fun symbolAdd(){
        assertEquals("Вы ввели символы",math?.add("2xmnnbm","2"))
    }
    @Test
    fun plusAdd(){
        assertEquals("Вы ввели символы",math?.add("2","+2"))

    }
    @Test
    fun emptyAdd(){
        assertEquals("Вы не дописали",math?.add("2",""))

    }
    @Test
    fun zeroDivide(){
        assertEquals("на ноль делить нельзя",math?.divide("2","0"))

    }


    @After
    fun detach(){
        math = null
    }



}