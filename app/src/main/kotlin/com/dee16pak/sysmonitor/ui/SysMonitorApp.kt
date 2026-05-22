package com.dee16pak.sysmonitor.ui

import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.dee16pak.sysmonitor.ui.navigation.BottomNavigationBar
import com.dee16pak.sysmonitor.ui.screens.ProcessesScreen
import com.dee16pak.sysmonitor.ui.screens.FilesScreen
import com.dee16pak.sysmonitor.ui.screens.NetworkScreen
import com.dee16pak.sysmonitor.ui.screens.SystemScreen
import com.dee16pak.sysmonitor.ui.screens.SecurityScreen

@Composable
fun SysMonitorApp() {
    val navController = rememberNavController()

    Scaffold(
        modifier = Modifier.fillMaxSize(),
        bottomBar = {
            BottomNavigationBar(navController)
        }
    ) { _ ->
        NavHost(
            navController = navController,
            startDestination = "processes",
            modifier = Modifier.fillMaxSize()
        ) {
            composable("processes") { ProcessesScreen() }
            composable("files") { FilesScreen() }
            composable("network") { NetworkScreen() }
            composable("system") { SystemScreen() }
            composable("security") { SecurityScreen() }
        }
    }
}
