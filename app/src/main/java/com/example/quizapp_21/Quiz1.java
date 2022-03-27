package com.example.quizapp_21;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.app.Dialog;
import android.content.Intent;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.view.View;
import android.view.WindowManager;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class Quiz1 extends AppCompatActivity {
    
    CountDownTimer countDownTimer ;
    int timerValue = 20;
    TextView count, question,oa,ob,oc,od ;
    CardView cardA,cardB,cardC,cardD;
    int index = 0;
    List<ModelClass> allQestions;
    ModelClass modelClass;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz1);

        hooks();
        setAllData();

        allQestions = new ArrayList<>();
        allQestions.add(new ModelClass("1+1","2","3","4","0","2"));
        allQestions.add(new ModelClass("1+2","2","3","4","0","3"));
        allQestions.add(new ModelClass("1+3","2","3","4","0","4"));
        allQestions.add(new ModelClass("1+4","2","3","4","5","5"));
        Collections.shuffle(allQestions);

        modelClass=allQestions.get(index);
        count = (TextView) findViewById(R.id.countDown);

        countDownTimer = new CountDownTimer(20000,1000) {
            @Override
            public void onTick(long l) {
                timerValue = timerValue-1;
                count.setText(timerValue);
            }

            @Override
            public void onFinish() {
                Dialog dialog =     new Dialog(Quiz1.this,R.style.Dialoge);
                dialog.getWindow().addFlags(WindowManager.LayoutParams.FLAG_BLUR_BEHIND);
                dialog.setContentView(R.layout.time_out_layout);
                dialog.findViewById(R.id.btn_tryagain).setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Intent intent = new Intent(Quiz1.this,MainActivity.class);
                        startActivity(intent);
                    }
                });
                dialog.show();
            }
        }.start();
    }

    private void setAllData() {
        question.setText(modelClass.getQuestion());
        oa.setText(modelClass.getoA());
        ob.setText(modelClass.getOB());
        oc.setText(modelClass.getOC());
        od.setText(modelClass.getoD());

    }

    private void hooks() {
        question = (TextView) findViewById(R.id.cQuestion);
        oa = (TextView) findViewById(R.id.oa);
        ob = (TextView) findViewById(R.id.ob);
        oc = (TextView) findViewById(R.id.oc);
        od = (TextView) findViewById(R.id.od);

        cardA = (CardView) findViewById(R.id.cardA);
        cardB = (CardView) findViewById(R.id.cardB);
        cardC = (CardView) findViewById(R.id.cardC);
        cardD = (CardView) findViewById(R.id.cardD);
    }
}