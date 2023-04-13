package org.sdu.person1

//open = 상속이 가능한 클래스다.
open class Person(var name: String?) {

    var age: Int? = null
    var address: String? = null

    init {
        println("Person 기본 생성자 호출됨")
    }

    //기본 생성자 호출
    constructor(name: String?, age: Int?, address: String?) : this(name) {
        println("Person의 직접 정의한 생성자 호출됨")

        this.name = name
        this.age = age
        this.address = address
    }


    fun toText(): String {
        return "Person입니다."
    }
}