package kz.course.lesson6

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.AutoCompleteTextView
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    private lateinit var yesButton: Button
    private lateinit var noButton: Button
    private lateinit var restartButton: Button
    private lateinit var messageTextView: TextView
    private var isClicked: Boolean = true
    private var arrText = arrayOf(
        "Вам понятен этот урок?", "Я рад, что все понятно. Продолжим?", "Ура!",
        "Мне жаль. Посмотрим урок еще раз?", "Тогда увидимся! Пока"
    )

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        initViews()
        yesClickButton()
        noClickButton()
        restartClickButton()
    }

    private fun initViews() {
        yesButton = findViewById(R.id.yesButton)
        noButton = findViewById(R.id.noButton)
        restartButton = findViewById(R.id.restartButton)
        messageTextView = findViewById(R.id.messageTextView)
    }

    private fun yesClickButton() {
        yesButton.setOnClickListener {
            if (isClicked) {
                messageTextView.text = arrText[1]
                isClicked = false
            } else {
                messageTextView.text = arrText[2]
                isClicked = true
            }
        }
    }

    private fun noClickButton() {
        noButton.setOnClickListener {
            if (isClicked) {
                messageTextView.text = arrText[3]
                isClicked = false
            } else {
                messageTextView.text = arrText[4]
                isClicked = true
            }
        }
    }

    private fun restartClickButton() {
        restartButton.setOnClickListener {
            messageTextView.text = arrText[0]
        }
    }
}