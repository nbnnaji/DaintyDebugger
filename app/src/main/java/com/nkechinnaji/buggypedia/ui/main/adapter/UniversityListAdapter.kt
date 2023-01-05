package com.nkechinnaji.buggypedia.ui.main.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.CompoundButton
import android.widget.RadioButton
import androidx.recyclerview.widget.RecyclerView
import com.nkechinnaji.buggypedia.data.model.DataConfig
import com.nkechinnaji.buggypedia.data.model.UniversityProfile
import com.nkechinnaji.buggypedia.ui.main.view.ItemClickListener
import com.nkechinnaji.daintydebugger.R


class UniversityListAdapter (var listener : ItemClickListener): RecyclerView.Adapter<UniversityListAdapter.ViewHolder>(){

    var universityList : List<UniversityProfile> = DataConfig.universityList
    var itemClickListener : ItemClickListener? = null
    var selectedPosition = -1

    inner class ViewHolder(view: View) : RecyclerView.ViewHolder(view){
        val checkbox : RadioButton = view.findViewById(R.id.check_box)

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        return ViewHolder(LayoutInflater.from(parent.context).inflate(R.layout.bugs_layout_item, parent, false))
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val itemPosition = universityList[position]
        holder.checkbox.text = itemPosition.name

        itemClickListener = listener

        holder.checkbox.setChecked(position == selectedPosition);

        holder.checkbox.setOnCheckedChangeListener(object: CompoundButton.OnCheckedChangeListener{
            override fun onCheckedChanged(compundButton: CompoundButton?, b: Boolean) {
                if(b){
                    selectedPosition = holder.absoluteAdapterPosition
                    DataConfig.selectedSchoolWebsite = itemPosition.webPages[0]
                    DataConfig.selectedSchool = itemPosition.name
                    itemClickListener!!.onClick(holder.checkbox.getText().toString())
                }
            }

        })
    }

    override fun getItemId(position: Int): Long {
        return position.toLong()
    }

    override fun getItemViewType(position: Int): Int {
        return position
    }

    override fun getItemCount(): Int {
       return universityList.size
    }

    fun setBugsList(list : List<UniversityProfile>){
        this.universityList = list as ArrayList<UniversityProfile>
        notifyDataSetChanged()
    }


}

