package com.example.thirdcomposesampleapp.ui

import android.content.res.Configuration
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.thirdcomposesampleapp.R
import com.example.thirdcomposesampleapp.ui.theme.ThirdComposeSampleAppTheme

@Composable
fun HomeScreen(
    modifier: Modifier = Modifier
) {
    Column(modifier.verticalScroll(rememberScrollState())) {
        Spacer(modifier = modifier.height(16.dp))
        SearchBar(modifier = modifier.padding(horizontal = 16.dp))
        HomeSection(title = R.string.align_your_body) {
            AlignYourBodyRow()
        }
        HomeSection(title = R.string.favorite_collections) {
            FavoriteCollectionsGrid()
        }
        Spacer(modifier = modifier.height(16.dp))
    }
}


@Preview(
    "Light Mode",
    showBackground = true,
    heightDp = 180
)
@Preview(
    "Dark Mode",
    showBackground = true,
    uiMode = Configuration.UI_MODE_NIGHT_YES
)
@Composable
fun HomeScreenPreview() {
    ThirdComposeSampleAppTheme {
        HomeScreen()
    }
}