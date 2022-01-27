package nacc.sergey.testforfocusstart.data.dto

import com.google.gson.annotations.SerializedName


data class CurrencyResponse(

    @SerializedName("ID")
    val ID: String,

    @SerializedName("NumCode")
    val NumCode: String,

    @SerializedName("CharCode")
    val CharCode: String,

    @SerializedName("Nominal")
    val Nominal: String,

    @SerializedName("Value")
    val Value: String,

    @SerializedName("Previous")
    val Previous: String,

)
