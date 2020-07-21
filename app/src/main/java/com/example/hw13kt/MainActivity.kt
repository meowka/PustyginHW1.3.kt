package com.example.hw13kt



import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

       val post = Post("20.07.2020","homework", "my first post",50,25,5)
        dateTxt.text = post.date
        titleTxt.text = post.title
        contentTxt.text = post.content
        if (post.like!=0){
            likeTxt.text = post.like.toString()
            likeTxt.setTextColor(Color.parseColor("#DA0F0F"))
            imgBtnLike.setColorFilter(Color.parseColor("#DA0F0F"))
        }
        if (post.comment!=0){
        commentTxt.text = post.comment.toString()
        }
        if (post.share!=0){
            shareTxt.text = post.share.toString()
        }
    }
}