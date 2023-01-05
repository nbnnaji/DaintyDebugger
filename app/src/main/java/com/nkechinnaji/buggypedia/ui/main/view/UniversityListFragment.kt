package com.nkechinnaji.buggypedia.ui.main.view


import android.app.Dialog
import android.content.Intent
import android.content.res.Resources
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.coordinatorlayout.widget.CoordinatorLayout
import com.google.android.material.bottomsheet.BottomSheetBehavior
import com.google.android.material.bottomsheet.BottomSheetDialog
import com.google.android.material.bottomsheet.BottomSheetDialogFragment
import com.nkechinnaji.buggypedia.data.model.DataConfig.universityList
import com.nkechinnaji.buggypedia.ui.main.adapter.UniversityListAdapter
import com.nkechinnaji.daintydebugger.R
import com.nkechinnaji.daintydebugger.databinding.BugsBottomSheetBinding


class UniversityListFragment : BottomSheetDialogFragment(), ItemClickListener {

    lateinit var dialog: BottomSheetDialog
    lateinit var bottomSheetBehavior: BottomSheetBehavior<View>
    var rootView: View? = null

    private lateinit var universityListAdapter: UniversityListAdapter
    private lateinit var viewBinding: BugsBottomSheetBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setHasOptionsMenu(true)
    }

    override fun onCreateDialog(savedInstanceState: Bundle?): Dialog {
        dialog = super.onCreateDialog(savedInstanceState) as (BottomSheetDialog)
        return dialog
    }


    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        rootView = inflater.inflate(R.layout.bugs_bottom_sheet, container, false)
        return rootView
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val binding = BugsBottomSheetBinding.bind(view)
        viewBinding = binding
        bottomSheetBehavior = BottomSheetBehavior.from(view.parent as View)
        bottomSheetBehavior.setState(BottomSheetBehavior.STATE_EXPANDED)

        val layout: CoordinatorLayout? = dialog.findViewById(R.id.bottomSheetLayout)
        assert(layout != null)
        layout?.minimumHeight = Resources.getSystem().displayMetrics.heightPixels

        universityListAdapter = UniversityListAdapter(this)
        viewBinding.recyclerview.apply {
            adapter = universityListAdapter
        }

        universityListAdapter.setBugsList(universityList)

        //dismiss dialog on navigation icon click
        viewBinding.bugsToolbar.setNavigationOnClickListener {
            dialog.dismiss()
        }

    }

    override fun onClick(selectedTextDesc: String?) {
        viewBinding.recyclerview.post(
            {
                universityListAdapter.notifyDataSetChanged()
            }
        )
       Toast.makeText(requireContext(), "Selected : $selectedTextDesc", Toast.LENGTH_LONG).show()

        viewBinding.submitSelectionButton.setOnClickListener{
            val intent = Intent(activity, UniversityProfileDetailActivity::class.java)
            startActivity(intent)
        }

    }

}