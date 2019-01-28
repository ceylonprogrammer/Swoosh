package com.example.sameera.swoosh

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_welcome.*

class WelcomeActivity : BaseActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_welcome)
        getStartedBtn.setOnClickListener {
            //intent use for use moving one activity to another or intent use for open camera
            //Two types of intent explicit and implicit
            //with implicit intent specify action type and send to android system based on available apps and serve according to requirement
            //if matching the requirement then gave list to select the matching apps
            //with explicit intent type we define what is the exact class or application to open .This is using moving one activity to other
            val leagueIntent=Intent(this,LeagueActivity::class.java)
            startActivity(leagueIntent)
        }
    }
}
