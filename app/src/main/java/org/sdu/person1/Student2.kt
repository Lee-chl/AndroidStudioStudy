package org.sdu.person1

import java.net.Inet4Address

class Student2 : Person {

    constructor(name: String?, age: Int?, address: String?) : super(name) {
        this.age = age
        this.address = address
    }
}