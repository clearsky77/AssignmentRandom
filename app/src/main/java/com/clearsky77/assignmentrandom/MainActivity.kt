package com.clearsky77.assignmentrandom

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val randomNumArr = ArrayList<Int>()

        for (i in 0 until 6) {
            while (true) {
                val randomNum = (Math.random() * 45 + 1).toInt()
                var isDuplOk = !randomNumArr.contains(randomNum)

                if (isDuplOk) {
                    randomNumArr.add(randomNum)
                    Log.d(" ${i + 1}번째 숫자", randomNum.toString())
                    break;
                }
            }
        }

        randomNumArr.sort()

        Log.d("결과", "====== 순서대로 출력 ========")
        for (num in randomNumArr) {
            Log.d("숫자", num.toString())
        }
    }
}