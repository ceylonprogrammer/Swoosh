package com.example.sameera.swoosh

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class LeagueActivity : BaseActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_league)
    }
//Insted of using onCreate we are using onClick Method
    fun leagueNextClicked(view:View){
        val skilActivity=Intent(this,SkillActivity::class.java)
        startActivity(skilActivity)
    }
}
