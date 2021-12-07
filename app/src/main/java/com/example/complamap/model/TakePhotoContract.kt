package com.example.complamap.model

import android.app.Activity
import android.content.Context
import android.content.Intent
import android.net.Uri
import androidx.activity.result.contract.ActivityResultContract
import androidx.core.net.toUri
import com.example.complamap.views.activities.TakePhotoActivity

class TakePhotoContract : ActivityResultContract<String?, Uri?>() {

    override fun createIntent(context: Context, input: String?): Intent {
        return Intent(
            context,
            TakePhotoActivity::class.java
        )
    }

    override fun parseResult(resultCode: Int, intent: Intent?): Uri? {
        if (resultCode == Activity.RESULT_OK) {
            return intent?.getStringExtra("uri")?.toUri()
        }
        return null
    }
}
