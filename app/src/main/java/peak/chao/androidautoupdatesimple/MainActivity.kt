package peak.chao.androidautoupdatesimple

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import peak.chao.androidautoupdate.util.SeasonUtil

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        for (i in 1..12) {
            SeasonUtil.getSeason(i)
        }
    }
}
