package com.developpementmobile.cnam.ui

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.pluralStringResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.dp
import com.developpementmobile.cnam.model.Event
import com.developpementmobile.cnam.R

@Composable
fun EventDetailScreen(event: Event) {
    val scrollState = rememberScrollState()
    Column(
        modifier = Modifier
            .fillMaxSize()
            .verticalScroll(scrollState)
            .padding(16.dp)
    ) {
        Box(
            modifier = Modifier
                .fillMaxWidth()
                .height(200.dp)
                .background(MaterialTheme.colorScheme.primaryContainer)
        )
        Spacer(modifier = Modifier.height(16.dp))
        Text(text = event.title, style = MaterialTheme.typography.headlineMedium)
        Text(text = event.category, style = MaterialTheme.typography.bodyLarge)
        Text(text = event.location ?: stringResource(R.string.location_tbd))
        Text(text = pluralStringResource(R.plurals.places_count, event.capacity, event.capacity))
        Spacer(modifier = Modifier.height(16.dp))
        Text(text = event.description, style = MaterialTheme.typography.bodyMedium)
        Spacer(modifier = Modifier.height(16.dp))
        Button(
            onClick = {},
            enabled = event.capacity > 0,
            modifier = Modifier.fillMaxWidth()
        ) {
            Text(text = stringResource(R.string.reserve))
        }
    }
}
