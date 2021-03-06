package com.example.ladm_u5_practica1_romerobautistabryanhassiel

import com.google.firebase.firestore.GeoPoint

class Data {
    var nombre : String = ""
    var posicion1 : GeoPoint = GeoPoint(0.0,0.0)
    var posicion2 : GeoPoint = GeoPoint(0.0,0.0)

    fun estoyEn(posicionActual : GeoPoint) : Boolean {
        if(posicionActual.latitude >= posicion1.latitude && posicionActual.latitude <= posicion2.latitude) {
            if(invertir(posicionActual.longitude) >= invertir(posicion1.longitude)  && invertir(posicionActual.longitude) <= invertir(posicion2.longitude)) {
                return true
            }
        }
        return false
    }

    private fun invertir(valor : Double) : Double {
        return valor * -1
    }
}