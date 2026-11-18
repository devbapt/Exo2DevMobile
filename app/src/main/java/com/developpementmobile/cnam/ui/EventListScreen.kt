package com.developpementmobile.cnam.ui

import android.util.Log
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.dp
import com.developpementmobile.cnam.model.Event
import com.developpementmobile.cnam.R

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun EventListScreen(events: List<Event>) {
    Scaffold(
        topBar = {
            TopAppBar(title = { Text(stringResource(R.string.campus_title)) })
        }
    ) { padding ->
        LazyColumn(
            modifier = Modifier
                .fillMaxSize()
                .padding(padding)
        ) {
            item {
                LazyRow(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(8.dp),
                    horizontalArrangement = Arrangement.spacedBy(8.dp)
                ) {
                    item { FilterChip(selected = true, onClick = {}, label = { Text(stringResource(R.string.category_all)) }) }
                    item { FilterChip(selected = false, onClick = {}, label = { Text(stringResource(R.string.category_tech)) }) }
                    item { FilterChip(selected = false, onClick = {}, label = { Text(stringResource(R.string.category_art)) }) }
                }
            }
            items(events, key = { it.id }) { event ->
                EventCard(
                    event = event,
                    onClick = { Log.d("Campus", "Click event ${event.title}") },
                    onBook = { Log.d("Campus", "Book event ${event.title}") }
                )
            }
        }
    }
}
