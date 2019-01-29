package com.example.sameera.swoosh.Controllar

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Toast
import com.example.sameera.swoosh.Utilities.EXTRA_LEAGUE
import com.example.sameera.swoosh.R
import com.example.sameera.swoosh.Utilities.EXTRA_SKILL
import kotlinx.android.synthetic.main.activity_skill.*

class SkillActivity : BaseActivity() {
    var league = ""
    var skill = ""
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_skill)
        //Getting value of EXTRA LEAAGUE in final destination
        league = intent.getStringExtra(EXTRA_LEAGUE)

    }

    fun onBeginnerClicked(view: View) {
        ballerSkillBtn.isChecked = false
        skill = "beginner"
    }

    fun onBallerClicked(view: View) {
        beginnerSkillBtn.isChecked = false
        skill = "baller"
    }

    fun onSkillFinishClicked(view: View) {
        if (skill != "") {
            val finishActivity = Intent(this, FinishActivity::class.java)
            //passing data to next final activity using putExtra this will pass league and skill data
            finishActivity.putExtra(EXTRA_LEAGUE, league)
            finishActivity.putExtra(EXTRA_SKILL, skill)
            startActivity(finishActivity)
        } else {
            Toast.makeText(this, "Please select a skill level", Toast.LENGTH_SHORT).show()
        }

    }
}
