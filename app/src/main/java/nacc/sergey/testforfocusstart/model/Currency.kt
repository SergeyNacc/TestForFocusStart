package nacc.sergey.testforfocusstart.model

import java.io.Serializable


data class Currency(

    val charCode: String,
    val id: String,
    val name: String,
    val nominal: Int,
    val numCode: String,
    val previous: Int,
    var value: Int

) : Serializable
