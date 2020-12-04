package bg.dihanov.navigation

import androidx.navigation.NavController

class Navigator {
    lateinit var navController: NavController

    fun navigateToFlow(navigationFlow: NavigationFlow) = when (navigationFlow) {
        NavigationFlow.HomeFlow -> navController.navigate(MainNavGraphDirections.actionGlobalHomeFlow())
        NavigationFlow.DashboardFlow -> navController.navigate(MainNavGraphDirections.actionGlobalDashboardFlow())
    }
}