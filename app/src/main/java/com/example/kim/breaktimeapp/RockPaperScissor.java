package com.example.kim.breaktimeapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Random;

public class RockPaperScissor extends AppCompatActivity {

    Button rockBtn, paperBtn, scissorsBtn;
    TextView user_score, sys_score;
    ImageView sys_image, user_image;
    int i_user_score = 0;
    int i_sys_score = 0;
    String result;

    Random r;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rock_paper_scissor);

        rockBtn = (Button) findViewById(R.id.btnRock);
        paperBtn = (Button) findViewById(R.id.btnPaper);
        scissorsBtn = (Button) findViewById(R.id.btnScissors);

        sys_image = (ImageView) findViewById(R.id.iv_system);
        user_image = (ImageView) findViewById(R.id.iv_user);

        user_score = (TextView) findViewById(R.id.tv_score_user);
        sys_score = (TextView) findViewById(R.id.tv_score_system);

        r = new Random();

        rockBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                user_image.setImageResource(R.drawable.rock_2);
                result = playGame("rock");
                Toast.makeText(RockPaperScissor.this, result, Toast.LENGTH_SHORT).show();
                user_score.setText(Integer.toString(i_user_score));
                sys_score.setText(Integer.toString(i_sys_score));
            }
        });
        paperBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                user_image.setImageResource(R.drawable.paper_2);
                result = playGame("paper");
                Toast.makeText(RockPaperScissor.this, result, Toast.LENGTH_SHORT).show();
                user_score.setText(Integer.toString(i_user_score));
                sys_score.setText(Integer.toString(i_sys_score));
            }
        });

        scissorsBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                user_image.setImageResource(R.drawable.scissor_2);
                result = playGame("scissor");
                Toast.makeText(RockPaperScissor.this, result, Toast.LENGTH_SHORT).show();
                user_score.setText(Integer.toString(i_user_score));
                sys_score.setText(Integer.toString(i_sys_score));
            }
        });
    }


    public String playGame(String s_user_choice) {
        String s_sys_choice = "";
        Random r = new Random();
        int i_sys_choice = r.nextInt(3) + 1;

        if (i_sys_choice == 1) s_sys_choice = "rock";
        else if (i_sys_choice == 2) s_sys_choice = "paper";
        else if (i_sys_choice == 3) s_sys_choice = "scissor";

        // ---------------

        if (s_sys_choice == "rock") sys_image.setImageResource(R.drawable.rock_2);
        else if (s_sys_choice == "paper") sys_image.setImageResource(R.drawable.paper_2);
        else if (s_sys_choice == "scissor") sys_image.setImageResource(R.drawable.scissor_2);

        // ----------------
        if (s_sys_choice == s_user_choice) return "Draw. No one won !!!";
        else if (s_user_choice == "rock" && s_sys_choice == "scissor") {
            i_user_score++;
            return "Rock crushes Scissor. You won !!!";
        } else if (s_user_choice == "rock" && s_sys_choice == "paper") {
            i_sys_score++;
            return "Paper covers Rock. You lost !!!";
        } else if (s_user_choice == "paper" && s_sys_choice == "rock") {
            i_user_score++;
            return "Paper covers Rock. You won !!!";
        } else if (s_user_choice == "paper" && s_sys_choice == "scissor") {
            i_sys_score++;
            return "Scissor cuts Paper. You lost !!!";
        } else if (s_user_choice == "scissor" && s_sys_choice == "rock") {
            i_sys_score++;
            return "Rock crushes scissor. You lost !!!";
        } else if (s_user_choice == "scissor" && s_sys_choice == "paper") {
            i_user_score++;
            return "Scissor cuts Paper. You won !!!";
        }
        else return "No thing";
    }
}
