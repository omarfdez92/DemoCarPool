package com.omarparra.democarpool

/**
 * @author Ing. Omar Parra
 * @date 11/7/19
 */
object DataService {

    val employees = listOf(
        Persons("Aarav Huiqui", "Plaza del Sol", "avatartwo"),
        Persons("Mariana Higuera", "Plaza Galerias", "avatarone"),
        Persons("Karthik Vedagiri", "Plaza Andares", "avatartwo"),
        Persons("Shakti Anand", "Estadio Jalisco", "avatarthree"),
        Persons("Roberto Prado", "Plaza de Toros", "avatartwo"),
        Persons("Julia Esparza", "Plaza de la Bandera", "avatarone"),
        Persons("Ismael Rivera", "Plaza Brasil", "avatartwo"),
        Persons("Elena Monraz", "La Gran Plaza", "avatarthree"),
        Persons("Juan Perez", "Ciudadela", "avatartwo"),
        Persons("Adriana Lima", "Americana", "avatarone"),
        Persons("Joaquin Escutia", "Catedral de Zapopan", "avatartwo"),
        Persons("Karla Diaz", "Central Camionera", "avatarthree")
    )

    val buses = listOf(
        Buses("PeriNorte","Periferico Norte y Belisario","busone"),
        Buses("Tetlan","Tetlan y Solidaridad","bustwo"),
        Buses("Minerva","Vallarta y Lopez Mateos","busthree"),
        Buses("Las Torres","Avenidad de las torres","busone"),
        Buses("Mariano Otero", "Av. Mariano Otero","bustwo"),
        Buses("Especial Tata 2","Av. iteso y Lopez Mateos","busthree"),
        Buses("Tata 3", "Camino Real al Iteso","busone")
    )

}