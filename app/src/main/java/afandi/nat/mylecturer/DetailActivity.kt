package afandi.nat.mylecturer

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions
import kotlinx.android.synthetic.main.activity_detail.*


class DetailActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail)

        initActionBar()

        tbDetail.setNavigationOnClickListener {
            finish()
        }

        //actionbar?.setTitle(resources.getString(R.string.lecturer_name))
        val tvName: TextView = findViewById(R.id.tv_item_name)
        val tvKeahlian: TextView = findViewById(R.id.tv_item_keahlian)
        val imgLecturer: ImageView = findViewById(R.id.img_item_photo)
        val tvNIP: TextView = findViewById(R.id.tv_item_nip)
        val tvJabatan: TextView = findViewById(R.id.tv_item_jabatan)

        /*val eName = intent.getStringExtra(EXTRA_NAME)
        val eKeahlian = intent.getStringExtra(EXTRA_KEAHLIAN)
        val eNIP = intent.getStringExtra(EXTRA_NIP)
        val eJabatan = intent.getStringExtra(EXTRA_JABATAN)
        val ePhoto = intent.getIntExtra(EXTRA_PHOTO, 0)*/

        val lecturer: Lecturer = intent.getParcelableExtra(EXTRA_LECTURER)

        tvName.text = lecturer.name
        Glide.with(this)
            .load(lecturer.photo)
            .apply(RequestOptions())
            .into(imgLecturer)
        tvKeahlian.text = lecturer.keahlian
        tvNIP.text = lecturer.nip
        tvJabatan.text = lecturer.jabatan
    }

    companion object{
        /*const val EXTRA_NAME = "extra_name"
        const val EXTRA_KEAHLIAN = "extra_keahlian"
        const val EXTRA_NIP = "extra_nip"
        const val EXTRA_JABATAN = "extra_jabatan"
        const val EXTRA_PHOTO = "extra_photo"*/
        const val EXTRA_LECTURER = "extra_lecturer"
    }

    override fun onSupportNavigateUp(): Boolean {
        onBackPressed()
        return true
    }

    private fun initActionBar() {
        setSupportActionBar(tbDetail)
        supportActionBar?.setDisplayHomeAsUpEnabled(true)
        supportActionBar?.title = "Detail Dosen"
    }

}
