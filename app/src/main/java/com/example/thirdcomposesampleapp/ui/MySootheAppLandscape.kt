package com.example.thirdcomposesampleapp.ui

import android.content.res.Configuration
import androidx.compose.foundation.layout.Row
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.thirdcomposesampleapp.ui.theme.ThirdComposeSampleAppTheme

@Composable
fun MySootheAppLandscape(
    modifier: Modifier = Modifier
) {
    Row(modifier = modifier) {
        SootheNavigationRail()
        HomeScreen()
    }
}


@Preview(
    "Light Mode",
    showBackground = true,
    widthDp = 640, heightDp = 360
)
@Preview(
    "Dark Mode",
    showBackground = true,
    uiMode = Configuration.UI_MODE_NIGHT_YES,
    widthDp = 640, heightDp = 360
)
@Composable
fun MySootheAppLandscapePreview() {
    ThirdComposeSampleAppTheme {
        MySootheAppLandscape()
    }
}