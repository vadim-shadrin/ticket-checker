import android.Manifest
import androidx.activity.compose.rememberLauncherForActivityResult
import androidx.activity.result.contract.ActivityResultContracts
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.ui.platform.LocalContext
import com.journeyapps.barcodescanner.ScanContract
import com.journeyapps.barcodescanner.ScanOptions

@Composable
fun QrScannerScreen(
    viewModel: ScannerViewModel = viewModel()
) {
    val context = LocalContext.current
    val cameraPermissionLauncher = rememberLauncherForActivityResult(
        ActivityResultContracts.RequestPermission()
    ) { isGranted ->
        if (isGranted) viewModel.startScan()
    }

    val scanLauncher = rememberLauncherForActivityResult(
        contract = ScanContract(),
        onResult = { result ->
            result.contents?.let { qrData ->
                viewModel.processScan(qrData)
            }
        }
    )

    LaunchedEffect(Unit) {
        cameraPermissionLauncher.launch(Manifest.permission.CAMERA)
    }

    // Здесь будет ваш UI для сканера
}