package com.developpementmobile.cnam.ui

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.dp
import com.developpementmobile.cnam.model.Event
import com.developpementmobile.cnam.R

@Composable
fun EventCard(
    event: Event,
    onClick: () -> Unit,
    onBook: () -> Unit
) {
    Card(
        modifier = Modifier
            .fillMaxWidth()
            .padding(8.dp)
            .clickable(onClick = onClick)
    ) {
        Column(modifier = Modifier.padding(16.dp)) {
            Text(text = event.title, style = MaterialTheme.typography.titleMedium)
            Text(text = event.category, style = MaterialTheme.typography.bodySmall)
            Text(text = event.location ?: stringResource(R.string.location_tbd))
            Spacer(modifier = Modifier.height(8.dp))
            Button(
                onClick = onBook,
                enabled = event.capacity > 0
            ) {
                Text(text = stringResource(R.string.reserve))
            }
        }
    }
}
