package org.sdu.person1

class Student(var alias:String?) : Person(alias) {

    constructor(name:String?,age:Int?,address:String?):this(name){
        this.name = name
        this.age = age
        this.address = address
    }
}