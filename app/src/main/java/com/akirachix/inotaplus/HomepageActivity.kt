package com.akirachix.inotaplus
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import com.akirachix.inotaplus.databinding.ActivityHomepageBinding

class HomepageActivity : AppCompatActivity() {

    lateinit var binding: ActivityHomepageBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityHomepageBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.rvHome.layoutManager = LinearLayoutManager(this)

        display()
    }
    fun display() {
        val detail1 = Home("Production History", "Upload Files")
        val detail2 = Home("Apply Loan", "My Profile")
        val details = listOf(detail1, detail2)
        val homeAdapter = HomeAdapter(details)
        binding.rvHome.adapter = homeAdapter
    }
}