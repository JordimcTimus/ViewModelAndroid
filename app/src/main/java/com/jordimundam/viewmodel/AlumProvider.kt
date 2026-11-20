package com.jordimundam.viewmodel

class AlumProvider {

    companion object{

        fun random(): AlumModel {
            val position = (0..10).random()
            return alumns[position]
        }

        private val alumns = listOf(
            AlumModel(
                nom = "Neil",
                edat = "19"
            ),
            AlumModel(
                nom = "Kevin",
                edat = "19"
            ),
            AlumModel(
                nom = "Airam",
                edat = "21"
            ),
            AlumModel(
                nom = "Marc",
                edat = "19"
            ),
            AlumModel(
                nom = "Yousefe",
                edat = "18"
            ),
            AlumModel(
                nom = "Luis",
                edat = "19"
            ),
            AlumModel(
                nom = "Jordi",
                edat = "19"
            ),
            AlumModel(
                nom = "Ferran",
                edat = "20"
            ),
            AlumModel(
                nom = "Eric",
                edat = "20"
            ),
            AlumModel(
                nom = "Leo",
                edat = "Rumano"
            )
        )
    }
}