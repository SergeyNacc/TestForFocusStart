package nacc.sergey.testforfocusstart.model

import java.util.*


data class Currencies(

    val date: Date,
    val previousDate: String,
    val previousURL: String,
    val timeStamp: Date,
    val currency: List<Currency>

)
