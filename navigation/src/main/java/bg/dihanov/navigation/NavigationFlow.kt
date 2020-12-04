package bg.dihanov.navigation

sealed class NavigationFlow {
    object HomeFlow : NavigationFlow()
    object DashboardFlow : NavigationFlow()
}