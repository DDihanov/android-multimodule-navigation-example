package bg.dihanov.commonui

import android.os.Bundle
import com.google.android.material.bottomnavigation.BottomNavigationView
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.findNavController
import androidx.navigation.ui.setupWithNavController
import bg.dihanov.navigation.NavigationFlow
import bg.dihanov.navigation.Navigator
import bg.dihanov.navigation.ToFlowNavigatable

class MainActivity : AppCompatActivity(), ToFlowNavigatable {
    private val navigator: Navigator = Navigator()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val navView: BottomNavigationView = findViewById(R.id.nav_view)

        val navController = findNavController(R.id.nav_host_fragment)

        navigator.navController = navController

        navView.setupWithNavController(navController)
    }

    override fun navigateToFlow(flow: NavigationFlow) {
        navigator.navigateToFlow(flow)
    }
}