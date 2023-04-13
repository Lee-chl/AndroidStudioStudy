package org.sdu.person1

import android.widget.TextView

class Student(override var name:String?) : Person(name) {

    constructor(name:String?,age:Int?,address:String?):this(name){
        this.name = name
        this.age = age
        this.address = address
    }

    override fun walk(){
        super.walk()

        println("학생이 걷는다.")
    }
    
    fun run(output1: TextView){
        println("학생이 뛴다")

        output1.text = "학생이 뛴다."
    }
}