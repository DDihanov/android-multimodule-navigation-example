package bg.dihanov.navigation

sealed class NavigationFlow {
    object HomeFlow : NavigationFlow()
    class DashboardFlow(val msg: String) : NavigationFlow()
}