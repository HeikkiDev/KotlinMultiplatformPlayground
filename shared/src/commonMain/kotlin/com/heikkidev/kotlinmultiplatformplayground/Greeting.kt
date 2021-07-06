package com.heikkidev.kotlinmultiplatformplayground

class Greeting {
    fun greeting(): String {
        return " Shared Hello, ${Platform().platform}!"
    }
}