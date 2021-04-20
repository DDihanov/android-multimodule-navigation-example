package bg.dihanov.home

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import bg.dihanov.navigation.NavigationFlow
import bg.dihanov.navigation.ToFlowNavigatable
import kotlinx.android.synthetic.main.fragment_home.*


class HomeFragment : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_home, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        to_next_fragment_btn.setOnClickListener {
            findNavController().navigate(HomeFragmentDirections.actionHomeFragmentToNextFragment())
        }

        to_dashboard_flow.setOnClickListener {
            (requireActivity() as ToFlowNavigatable).navigateToFlow(NavigationFlow.DashboardFlow("From home fragment"))
        }
    }
}