import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.launch
import java.util.Date

class ScannerViewModel : ViewModel() {
    private val apiService = RetrofitClient.instance

    fun startScan() {
        // Логика запуска сканера
    }

    fun processScan(qrData: String) {
        viewModelScope.launch {
            try {
                val response = apiService.sendScanData(
                    ScanRequest(
                        qrData = qrData,
                        scanTime = Date().toString()
                    )
                )

                if (response.isSuccessful) {
                    // Обработка успешного ответа
                } else {
                    // Обработка ошибки
                }
            } catch (e: Exception) {
                // Обработка исключения
            }
        }
    }
}