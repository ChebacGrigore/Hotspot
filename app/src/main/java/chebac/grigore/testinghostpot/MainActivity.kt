package chebac.grigore.testinghostpot

import android.os.Bundle
import android.util.Log

import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val isOne = ApManager::isApOn.invoke(applicationContext)

         val isState = ApManager::configApState.invoke(applicationContext)


        Log.e("test", "$isOne + $isState")

    }
}