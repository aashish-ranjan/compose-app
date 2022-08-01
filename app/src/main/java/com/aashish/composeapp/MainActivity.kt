package com.aashish.composeapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.*
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.aashish.composeapp.ui.theme.ComposeAppTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ComposeAppTheme {
                TriNestedBlockWithOffsetOnInnerBlockHavingText()
            }
        }
    }
}

@Composable
fun HorizontallyEndVerticallyCenteredSingleText(text: String) {
    Column(
        modifier = Modifier.fillMaxSize(),
        horizontalAlignment = Alignment.End,
        verticalArrangement = Arrangement.Center) {
        Text(text = text)
    }
}

@Composable
fun HorizonatallyEquiSeparatedVerticallyBottomAlignedTexts() {
    Row(
        modifier = Modifier.fillMaxSize(),
        horizontalArrangement = Arrangement.SpaceEvenly,
        verticalAlignment = Alignment.Bottom

    ) {
        Text("start")
        Text("center")
        Text("end")
    }
}

@Composable
fun TriNestedBlockWithOffsetOnInnerBlockHavingText() {
    Column(
        modifier = Modifier
            .height(200.dp)
            .fillMaxWidth(0.9f)
            .border(5.dp, Color.Green)
            .padding(5.dp)
            .border(10.dp, Color.Yellow)
            .padding(10.dp)
            .border(20.dp, Color.Red)
            .padding(20.dp)

    ) {
        Text(text = "Ranjan")
        Spacer(modifier = Modifier.height(40.dp))
        Text(
            text = "Aashish",
            modifier = Modifier
                .offset(10.dp, 20.dp)
                .border(2.dp, Color.Black)
                .padding(2.dp)
        )
    }
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    ComposeAppTheme {
        TriNestedBlockWithOffsetOnInnerBlockHavingText()
    }
}