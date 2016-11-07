package com.example;

import org.junit.Test

class DemoApplicationTests{

    @Test
    fun testTypeCast(){
        val obj : Any? = null
        val list:MutableList<Any>? = obj as MutableList<Any>? ?: mutableListOf(1,"12")
        print(list)
    }
}
