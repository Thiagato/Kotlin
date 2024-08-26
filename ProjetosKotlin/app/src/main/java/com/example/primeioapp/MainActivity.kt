package com.example.primeioapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.primeioapp.ui.theme.PrimeioAppTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ExemploEstado()
            }
        }
    }

@Composable
fun ExibirMensagem() {
    Text(text="oioioooi")
}

@Composable
fun ExemploColuna() {
    Column {
        Text(text="inferior")
        Text(text="superior")
    }

}

@Composable
fun ExemploLinha() {
    Row {
        Text(text = "Esquerdo ")
        Text(text = "Meio ")
        Text(text = "Bolsonaro ")
    }
}

@Preview(showBackground = true)
@Composable
fun PreviewLayout() {
    ExemploLinha()
}

@Composable
fun ExemploEstado() {

    var nome by remember {
        mutableStateOf("Calcular")
    }
    Column {
        Text(text = "23 + 21")
        Button(onClick = { nome = "Hello World" }) {
            Text(text = nome)
            
        }
    }

}