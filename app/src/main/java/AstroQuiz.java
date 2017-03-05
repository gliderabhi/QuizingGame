package com.munna.com.quizinggame;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class AstroQuiz extends AppCompatActivity {
    String opt1;
   float score;
    int c=0;
    int n;
    int _id=1;
    String opt2;
    String opt3;
    String opt4;
    int ans;
    DBHelper db;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_astro_quiz);
        CreateViewAstro();

    }
    public void CreateViewAstro(){
        db=new DBHelper(this);
        c=0;n=0;
       db.insertValuesAstro();
        String Question = db.getDataAstro(_id).getString(1);
        String option1 = db.getDataAstro(_id).getString(2);
        String option2 = db.getDataAstro(_id).getString(3);
        String option3 = db.getDataAstro(_id).getString(4);
        String option4 = db.getDataAstro(_id).getString(5);
        int answer = db.getDataAstro(_id).getInt(6);
        Button b1 = (Button) findViewById(R.id.Astro1);
        Button b2 = (Button) findViewById(R.id.Astro2);
        Button b3 = (Button) findViewById(R.id.Astro3);
        Button b4 = (Button) findViewById(R.id.Astro4);
        b1.setText(option1);
        b2.setText(option2);
        b3.setText(option3);
        b4.setText(option4);
        TextView Quest = (TextView) findViewById(R.id.AstroQ);
        Quest.setText(Question);
        TextView s=(TextView)findViewById(R.id.AstroScore);
        String  str;
        str=String.valueOf(score);
        TextView t=(TextView)findViewById(R.id.AstroResult);
        t.setText("");
        opt1=option1;
        opt2=option2;
        opt3=option3;
        opt4=option4;
        ans=answer;

    }

    public void CheckAstro(View v){
        TextView t=(TextView)findViewById(R.id.AstroResult);
        TextView s=(TextView)findViewById(R.id.AstroScore);
        String  str;
         n++;


        str=String.valueOf(score);
        switch (v.getId()){

            case R.id.Astro1:{
                if(1==ans )
                {t.setText("Correct Answer");
                    if(c==0){c++;switch(n){
                        case 1: score++;break;
                        case 2: score+=0.75;break;
                        case 3: score+=0.5;break;
                        case 4: score+=0.25;break;
                    }
                        str=String.valueOf(score);
                        s.setText(str);
                    }else {t.setText("Next Question");}
                }
                else
                {t.setText("Try Again ");}
            }break;
            case R.id.Astro2:{
                if(2==ans )
                { t.setText("Correct Answer");

                    if(c==0){c++;switch(n){
                        case 1: score++;break;
                        case 2: score+=0.75;break;
                        case 3: score+=0.5;break;
                        case 4: score+=0.25;break;
                    }
                        str=String.valueOf(score);
                        s.setText(str);
                    }else {t.setText("Next Question");}
                }
                else
                {t.setText("Try Again ");}
            }break;
            case R.id.Astro3: {
                if(3==ans  )
                {t.setText("Correct Answer");

                    if(c==0){c++;switch(n){
                        case 1: score++;break;
                        case 2: score+=0.75;break;
                        case 3: score+=0.5;break;
                        case 4: score+=0.25;break;
                    }
                        str=String.valueOf(score);
                        s.setText(str);}
                    else {t.setText("Next Question");}
                }
                else
                {t.setText("Try Again ");}
            }break;
            case R.id.Astro4: {
                if(4==ans )
                {t.setText("Correct Answer");
                    if(c==0){c++;switch(n){
                        case 1: score++;break;
                        case 2: score+=0.75;break;
                        case 3: score+=0.5;break;
                        case 4: score+=0.25;break;
                    }
                        str=String.valueOf(score);
                        s.setText(str);
                    }else {t.setText("Next Question");}
                }
                else
                {t.setText("Try Again ");}
            }break;
        }


    }
    public void nextAstro(View view){
        _id++;
        CreateViewAstro();
    }
    public  void prevAstro(View view){
        if(_id==1){

        }
        else {
            _id--;
            CreateViewAstro();
        }
    }

}
