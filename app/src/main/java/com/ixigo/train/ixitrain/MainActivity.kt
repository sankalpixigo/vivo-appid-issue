package com.ixigo.train.ixitrain

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.ixigo.train.ixitrain.ui.theme.RawApplicationTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val modelList: MutableList<String> = mutableListOf()
        for (i in 0..1000) {
            modelList.add("Station $i")
        }
        setContent {
            RawApplicationTheme {
                LazyColumn(modifier = Modifier.fillMaxWidth()) {
                    items(modelList){ station->
                        Greeting(name = station)
                    }
                }
            }
        }
    }
}

@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Text(
        text = "Hello $name!",
        modifier = modifier
    )
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    RawApplicationTheme {
        Greeting("Android")
    }
}