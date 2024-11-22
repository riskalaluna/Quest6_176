package com.example.praktikum7_176

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.praktikum7_176.navigation.MahasiswaApp
import com.example.praktikum7_176.ui.theme.Praktikum7_176Theme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            Praktikum7_176Theme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    MahasiswaApp(
                        modifier = Modifier.padding((innerPadding))
                    )
                    //Greeting( name = "Android", modifier = Modifier.padding(innerPadding)
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
    Praktikum7_176Theme {
        Greeting("Android")
    }
}