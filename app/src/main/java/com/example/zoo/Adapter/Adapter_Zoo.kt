package com.example.zoo.Adapter


import android.app.Dialog
import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.view.Window
import android.widget.ImageView
import android.widget.TextView
import androidx.cardview.widget.CardView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.zoo.Mode.Animal
import com.example.zoo.R

class Adapter_Zoo (
    val  content: Context,
    val slist:List<Animal>
        ): RecyclerView.Adapter<Adapter_Zoo.ZooviewHodel>() {

    class ZooviewHodel(itemView:View): RecyclerView.ViewHolder(itemView){
         val cardView: CardView by lazy { itemView.findViewById<CardView>(R.id.cardView) }
         val imgDongvat: ImageView by lazy { itemView.findViewById<ImageView>(R.id.img_dongvat) }
         val txtName: TextView by lazy { itemView.findViewById<TextView>(R.id.txt_name) }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ZooviewHodel {
        return ZooviewHodel(LayoutInflater.from(parent.context).inflate(R.layout.item_animals,parent,false))
    }

    override fun onBindViewHolder(holder: ZooviewHodel, position: Int) {

       val animal = slist[position]
        Glide.with(content).load(animal.image).centerCrop().into(holder.imgDongvat)
        holder.txtName.text=animal.name
        holder.cardView.setOnClickListener {
            Dialog(content).apply {
                setContentView(R.layout.dialog_information)

                 val imgDiologAnh: ImageView by lazy { findViewById<ImageView>(R.id.img_diolog_anh) }
                 val txtDialogName: TextView by lazy { findViewById<TextView>(R.id.txt_dialog_name) }
                 val txtDialogWeight: TextView by lazy { findViewById<TextView>(R.id.txt_dialog_weight) }
                 val txtDialogSpeed: TextView by lazy { findViewById<TextView>(R.id.txt_dialog_speed) }
                 val txtDialogHabitat: TextView by lazy { findViewById<TextView>(R.id.txt_dialog_habitat) }
                 val txtDialogProperties: TextView by lazy { findViewById<TextView>(R.id.txt_dialog_properties) }


                Glide.with(content).load(animal.image).centerCrop().into(imgDiologAnh)
                txtDialogName.text=animal.name
                txtDialogWeight.text=animal.longevity
                txtDialogSpeed.text=animal.speed
                txtDialogHabitat.text=animal.habitat
                txtDialogProperties.text=animal.properties
            }.show()
        }
    }



    override fun getItemCount(): Int {
        return slist.size
    }
}