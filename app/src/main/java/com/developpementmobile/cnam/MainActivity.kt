package com.developpementmobile.cnam

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import com.developpementmobile.cnam.model.sampleEvents
import com.developpementmobile.cnam.ui.EventDetailScreen
import com.developpementmobile.cnam.ui.EventListScreen
import com.developpementmobile.cnam.ui.theme.Exo1Part1Theme

// Activité principale de l'application
class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            Exo1Part1Theme {
                EventListScreen(sampleEvents)
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun EventListPreview() {
    Exo1Part1Theme {
        EventListScreen(sampleEvents)
    }
}

// liste en mode sombre à retenir ici voir partie cours
@Preview(showBackground = true, uiMode = android.content.res.Configuration.UI_MODE_NIGHT_YES)
@Composable
fun EventListDarkPreview() {
    Exo1Part1Theme {
        EventListScreen(sampleEvents)
    }
}

// écran de détail d'un événement
@Preview(showBackground = true)
@Composable
fun EventDetailPreview() {
    Exo1Part1Theme {
        EventDetailScreen(sampleEvents[0])
    }
}


@Preview(showBackground = true)
@Composable
fun EventDetailCompletePreview() {
    Exo1Part1Theme {
        EventDetailScreen(sampleEvents[2])
    }
}