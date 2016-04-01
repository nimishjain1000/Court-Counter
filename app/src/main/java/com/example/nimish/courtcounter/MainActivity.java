package com.example.nimish.courtcounter;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
  int scoreTeamA=0;
  int scoreTeamB=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void reset(View view)
    { Context context = getApplicationContext();
      char a;
      if(scoreTeamA>scoreTeamB)
      {
        a='A';
      }else a='B';
      CharSequence text = "this game is won by "+a+" team .Let's play another game";
      int duration = Toast.LENGTH_LONG;
      Toast toast = Toast.makeText(context, text, duration);
      toast.show();



      scoreTeamA=0;
      scoreTeamB=0;
      displayForTeamA(scoreTeamA);
      displayForTeamB(scoreTeamB);


    }
    public void free(View view)
    {   switch(view.getId())
    {
      case R.id.team_a_free:   scoreTeamA+=1;
        displayForTeamA(scoreTeamA);
// handle button A click;
        break;
      case R.id.team_b_free:   scoreTeamB+=1;
        displayForTeamB(scoreTeamB);
// handle button B click;
        break;
      default:
        throw new RuntimeException("Unknow button ID");

    }
    }
    public void inc2(View view)
    {
      switch(view.getId())
      {
        case R.id.team_a_plus2:   scoreTeamA+=2;
          displayForTeamA(scoreTeamA);
// handle button A click;
          break;
        case R.id.team_b_plus2:   scoreTeamB+=2;
          displayForTeamB(scoreTeamB);
// handle button B click;
          break;
        default:
          throw new RuntimeException("Unknow button ID");

    }}
    public void inc3(View view)
    {  switch(view.getId())
    {
      case R.id.team_a_plus3:   scoreTeamA+=3;
        displayForTeamA(scoreTeamA);
// handle button A click;
        break;
      case R.id.team_b_plus3:   scoreTeamB+=3;
        displayForTeamB(scoreTeamB);
// handle button B click;
        break;
      default:
        throw new RuntimeException("Unknow button ID");

    }
    }
    public void displayForTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_score);
        scoreView.setText(String.valueOf(score));
    }
  public void displayForTeamB(int score) {
    TextView scoreView = (TextView) findViewById(R.id.team_b_score);
    scoreView.setText(String.valueOf(score));
  }
}
