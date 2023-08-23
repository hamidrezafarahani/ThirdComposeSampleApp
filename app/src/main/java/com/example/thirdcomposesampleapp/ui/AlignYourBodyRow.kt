package com.example.thirdcomposesampleapp.ui

import android.content.res.Configuration
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.thirdcomposesampleapp.data.Repository
import com.example.thirdcomposesampleapp.ui.theme.ThirdComposeSampleAppTheme

@Composable
fun AlignYourBodyRow(
    modifier: Modifier = Modifier
) {
    LazyRow(
        modifier = modifier,
        horizontalArrangement = Arrangement.spacedBy(8.dp),
        contentPadding = PaddingValues(horizontal = 16.dp)
    ) {
        items(Repository.alignYourBodyData) {
            AlignYourBodyElement(drawable = it.drawable, text = it.text)
        }
    }
}


@Preview(
    "Light Mode",
    showBackground = true
)
@Preview(
    "Dark Mode",
    showBackground = true,
    uiMode = Configuration.UI_MODE_NIGHT_YES
)
@Composable
fun AlignYourBodyRowPreview() {
    ThirdComposeSampleAppTheme {
        AlignYourBodyRow()
    }
}