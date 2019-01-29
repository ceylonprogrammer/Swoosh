package com.example.sameera.swoosh.Controllar

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Toast
import com.example.sameera.swoosh.Utilities.EXTRA_LEAGUE
import com.example.sameera.swoosh.R
import kotlinx.android.synthetic.main.activity_league.*

class LeagueActivity : BaseActivity() {
    var selectedLeague = ""

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_league)
    }

    fun onMensClicked(view: View) {
        womensLeagueBtn.isChecked = false
        coedLeagueBtn.isChecked = false
        selectedLeague = "mens"
    }

    fun onWomensClicked(view: View) {
        mensLeagueBtn.isChecked = false
        coedLeagueBtn.isChecked = false
        selectedLeague = "womens"
    }

    fun onCoedClicked(view: View) {
        mensLeagueBtn.isChecked = false
        womensLeagueBtn.isChecked = false
        selectedLeague = "co-ed"
    }

    //Insted of using onCreate we are using onClick Method
    fun leagueNextClicked(view: View) {
        if (selectedLeague != "") {
            val skilActivity = Intent(this, SkillActivity::class.java)
            //use constant to use selected league value so use put extra EXTRA_LEAGUE is constant
            skilActivity.putExtra(EXTRA_LEAGUE, selectedLeague)
            startActivity(skilActivity)
        } else {
            Toast.makeText(this, "Please Select a League .", Toast.LENGTH_SHORT).show()
        }
    }
}
