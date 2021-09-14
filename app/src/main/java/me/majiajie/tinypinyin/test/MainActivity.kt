package me.majiajie.tinypinyin.test

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import me.majiajie.tinypinyin.Pinyin
import me.majiajie.tinypinyin.test.databinding.MainActivityBinding

class MainActivity : AppCompatActivity() {

    private lateinit var mViewBinding: MainActivityBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        mViewBinding = MainActivityBinding.inflate(layoutInflater)
        setContentView(mViewBinding.root)

        Pinyin.init(Pinyin.newConfig().with(CnCityDict(this)))

        mViewBinding.mTvText.text = Pinyin.toPinyin("中国 重庆", "")
    }
}