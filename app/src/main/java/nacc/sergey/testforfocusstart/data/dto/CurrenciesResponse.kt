package nacc.sergey.testforfocusstart.data.dto


import com.google.gson.annotations.SerializedName

data class CurrenciesResponse(
    @SerializedName("Date")
    val date: String,

    @SerializedName("PreviousDate")
    val previousDate: String,

    @SerializedName("PreviousURL")
    val previousURL: String,

    @SerializedName("Timestamp")
    val timestamp: String,

    @SerializedName("Valute")
    val valute: List<CurrencyResponse> = emptyList()
)