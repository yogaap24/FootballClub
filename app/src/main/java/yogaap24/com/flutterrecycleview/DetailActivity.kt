package yogaap24.com.flutterrecycleview

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import com.bumptech.glide.Glide
import kotlinx.android.synthetic.main.activity_main.*
import org.jetbrains.anko.*


class DetailActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val data = intent.getSerializableExtra("data") as Football
        Glide.with(this)
                .load(data.image)
                .into(image_view_club_activity_detail_club)
        text_view_club_name_activity_detail_club.text = data.name
        text_view_club_detaiL_activity_detail_club.text = data.detail
    }
}