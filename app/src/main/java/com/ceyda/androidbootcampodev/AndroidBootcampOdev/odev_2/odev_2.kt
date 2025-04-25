package com.ceyda.androidbootcampodev.AndroidBootcampOdev.odev_2

class Odev_2() {

    fun soru1(celcius:Double) : String{
        val f = celcius*1.8 + 32
        val result = "$celcius derece = $f fahrenhiet"
        return result
    }

    fun soru2(edge1:Double, edge2:Double){
        val result = edge1*2 + edge2*2
        println("Dikdortgenin cevresi : $result")
    }

    fun soru3(number:Int) : Int{
        var result = 1
        for (i in 2..number)
            result = result*i

        return result
    }

    fun soru4(word:String){
        var count = 0
        for (i in word)
            if(i == 'a' || i == 'A')
                count ++

        println("$word kelimesinde $count adet a harfi var.")

    }


    fun soru5(numberOfEdge:Int){
        val result = (numberOfEdge-2) * 180
        println("Ic Acilar Toplami : $result")
    }

    fun soru6(gunSayisi:Int){
        val gunlukSaat = 8.0
        val normalSaatlikUcret = 10.0
        val mesaiSaatlikUcret = 20.0

        val toplamSaat = gunSayisi * gunlukSaat

        val normalSaat = if (toplamSaat <= 160) toplamSaat else 160.0
        val mesaiSaat = if (toplamSaat > 160) toplamSaat - 160 else 0.0

        var normalMaas = normalSaat * normalSaatlikUcret
        val mesaiMaas = mesaiSaat * mesaiSaatlikUcret

        val maas = normalMaas + mesaiMaas

        println("Hesaplanan Maas : $maas")
    }

    fun soru7(kota:Double) : Double{
        val sabitKota = 50.0
        val sabitKotaUcreti = 100.0
        val kotaAsimiUcretlendirme = 4.0

        return if(kota<=sabitKota)
                    sabitKotaUcreti
            else{
            val asilanKota = kota-sabitKota
            val ekUcret = asilanKota * kotaAsimiUcretlendirme
            sabitKotaUcreti + ekUcret
        }
    }
}