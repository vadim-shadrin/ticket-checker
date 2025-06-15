import retrofit2.Response
import retrofit2.http.Body
import retrofit2.http.POST

interface ApiService {
    @POST("api/scan")
    suspend fun sendScanData(@Body request: ScanRequest): Response<ScanResponse>
}

data class ScanRequest(
    val qrData: String,
    val scanTime: String
)

data class ScanResponse(
    val success: Boolean,
    val message: String
)