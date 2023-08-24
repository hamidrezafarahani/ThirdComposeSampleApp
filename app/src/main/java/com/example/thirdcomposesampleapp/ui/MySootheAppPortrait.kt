package com.example.thirdcomposesampleapp.ui

import android.content.res.Configuration
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.thirdcomposesampleapp.ui.theme.ThirdComposeSampleAppTheme

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun MySootheAppPortrait() {
    Scaffold(
        bottomBar = { SootheBottomNavigation() }
    ) {
        HomeScreen(modifier = Modifier.padding(it))
    }
}


@Preview(
    "Light Mode",
    showBackground = true,
    widthDp = 360, heightDp = 640
)
@Preview(
    "Dark Mode",
    showBackground = true,
    uiMode = Configuration.UI_MODE_NIGHT_YES
)
@Composable
fun MySootheAppPortraitPreview() {
    ThirdComposeSampleAppTheme {
        MySootheAppPortrait()
    }
}

