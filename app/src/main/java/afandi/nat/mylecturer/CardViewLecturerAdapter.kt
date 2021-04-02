package afandi.nat.mylecturer

import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions

class CardViewLecturerAdapter(private val listLecturer: ArrayList<Lecturer>) : RecyclerView.Adapter<CardViewLecturerAdapter.CardViewViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CardViewViewHolder {
        val view: View = LayoutInflater.from(parent.context).inflate(R.layout.item_card_lecturer, parent, false)
        return CardViewViewHolder(view)
    }

    override fun getItemCount(): Int {
        return listLecturer.size
    }

    override fun onBindViewHolder(holder: CardViewViewHolder, position: Int) {
        val lecturer = listLecturer[position]

        Glide.with(holder.itemView.context)
            .load(lecturer.photo)
            .apply(RequestOptions())
            .into(holder.imgPhoto)

        holder.tvName.text = lecturer.name
        holder.tvNIP.text = lecturer.nip
        holder.tvJabatan.text = lecturer.jabatan
       // holder.itemView.setOnClickListener { Toast.makeText(holder.itemView.context, "Kamu memilih " + listLecturer[holder.adapterPosition].name, Toast.LENGTH_SHORT).show() }
        val mContext = holder.itemView.context

        holder.itemView.setOnClickListener {
            /*val moveDetail = Intent(mContext, DetailActivity::class.java)
            moveDetail.putExtra(DetailActivity.EXTRA_NAME, lecturer.name)
            moveDetail.putExtra(DetailActivity.EXTRA_KEAHLIAN, lecturer.keahlian)
            moveDetail.putExtra(DetailActivity.EXTRA_PHOTO, lecturer.photo)
            moveDetail.putExtra(DetailActivity.EXTRA_NIP, lecturer.nip)
            moveDetail.putExtra(DetailActivity.EXTRA_JABATAN, lecturer.jabatan)
            mContext.startActivity(moveDetail)*/

            val moveDetail = Intent(mContext, DetailActivity::class.java)
            moveDetail.putExtra(DetailActivity.EXTRA_LECTURER, lecturer)
            mContext.startActivity(moveDetail)
        }
    }

    inner class CardViewViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        var imgPhoto: ImageView = itemView.findViewById(R.id.img_item_photo)
        var tvName: TextView = itemView.findViewById(R.id.tv_item_name)
        var tvNIP: TextView = itemView.findViewById(R.id.tv_item_nip)
        var tvJabatan: TextView = itemView.findViewById(R.id.tv_item_jabatan)
    }
}