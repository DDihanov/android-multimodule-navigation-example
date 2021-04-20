package bg.dihanov.home

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import bg.dihanov.navigation.DeepLinkDestination
import bg.dihanov.navigation.deepLinkNavigateTo
import kotlinx.android.synthetic.main.fragment_next.*


class NextFragment : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_next, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        to_dash_fragment_deeplink_btn.setOnClickListener {
            it.post {
                findNavController().deepLinkNavigateTo(DeepLinkDestination.Dashboard("From next fragment deeplink"))
            }
        }
    }
}