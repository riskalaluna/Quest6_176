package com.example.praktikum7_176.navigation

import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.lifecycle.viewmodel.compose.viewModel
import androidx.navigation.NavController
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.praktikum7_176.ui.view.screen.SplashView
import com.example.praktikum7_176.ui.view.viewmodel.Mahasiswaviewmodel
import java.lang.reflect.Modifier

enum class Halaman {
    Splash,
    Mahasiswa
}

@Composable
fun MahasiswaApp(
    mahasiswaviewmodel: Mahasiswaviewmodel = viewModel(),
    navController: NavHostController = rememberNavController()
) {
    val mahasiswaUiState = mahasiswaviewmodel.mahasiswaUiState.collectAsState().value

    NavHost(
        navController = NavController,
        startDestination = Halaman.Splash.name,
        modifier = modifier .padding()
    ) {
        composable(route = Halaman.Splash.name) {
            SplashView {

            }

        }
    }
}