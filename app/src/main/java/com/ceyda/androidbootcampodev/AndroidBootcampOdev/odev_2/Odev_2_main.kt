package com.ceyda.androidbootcampodev.AndroidBootcampOdev.odev_2

fun main() {
    val o = Odev_2()

    println(o.soru1(50.0))

    o.soru2(50.0, 40.0)

    println(o.soru3(5))

    o.soru4("Ankara Anıtkabir")

    o.soru5(3)

    o.soru6(25)

    val result = o.soru7(50.1)
    println("Odenecek Tutar : $result")
}