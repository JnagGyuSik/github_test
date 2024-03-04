package com.example.myapplication

import java.util.Collections.list
import kotlin.math.min
import kotlin.math.sqrt

fun main() {
    var num : Int = 626331
    var result = num.toLong()
    var count : Int = 0
    var answer = 0

        while (result != 1.toLong()){
            count += 1
            if (count > 500){
                count = -1
                break
            } else if(result % 2 == 1.toLong()){
                result = (result * 3)+1
                println("$result , 카운트 : $count")
            } else if  (result % 2 == 0.toLong()){
                result = result/2
                println("$result , 카운트 : $count")
            }
        }

    println(count)
}