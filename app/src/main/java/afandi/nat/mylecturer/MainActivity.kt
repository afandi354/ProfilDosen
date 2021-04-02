package afandi.nat.mylecturer

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    private lateinit var rvLecturer: RecyclerView
    private var list: ArrayList<Lecturer> = arrayListOf()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        rvLecturer = findViewById(R.id.rv_lecturer)
        rvLecturer.setHasFixedSize(true)

        list.addAll(LecturerData.listData)
        showRecyclerCardView()

        initActionBar()
    }

    private fun initActionBar() {
        setSupportActionBar(tbMain)
        //supportActionBar?.setDisplayHomeAsUpEnabled(true)
        supportActionBar?.title=""
    }

    private fun showRecyclerCardView() {
        rvLecturer.layoutManager = LinearLayoutManager(this)
        val cardViewLecturerAdapter = CardViewLecturerAdapter(list)
        rvLecturer.adapter = cardViewLecturerAdapter
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.profile_menu, menu)
        return super.onCreateOptionsMenu(menu)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        setMode(item.itemId)
        return super.onOptionsItemSelected(item)
    }

    private fun setMode(itemId: Int) {
        when(itemId){
            R.id.profileMenu -> {
                startActivity(Intent(this, ProfileActivity::class.java))
            }
        }
    }

}