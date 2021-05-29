package com.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.view.View;
import android.webkit.WebView;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import org.w3c.dom.Text;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class GameWindow extends AppCompatActivity {

    //曜日配列の宣言
    String[] randomWeeks = {"月曜日","火曜日","水曜日","木曜日","金曜日","土曜日","日曜日"};
    List<String> list = new ArrayList<String>(Arrays.asList(randomWeeks));
    Random random = new Random();
    int cnt = list.size() - 1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game_window);

        //コントロール結び付け
        TextView txtResult = findViewById(R.id.tvResult);
        TextView txtRoadToVictory = findViewById(R.id.tvRoadToVictory);
        Button monday = findViewById(R.id.btnMonday);
        Button tuesday = findViewById(R.id.btnTuesDay);
        Button wednesday = findViewById(R.id.btnWednesDay);
        Button thursday = findViewById(R.id.btnThursday);
        Button friday = findViewById(R.id.btnFriday);
        Button saturday = findViewById(R.id.btnSaturday);
        Button sunday = findViewById(R.id.btnSunday);
        Button restart = findViewById(R.id.btnRestart);
        
        findViewById(R.id.btnMonday).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                int week = random.nextInt(list.size());
                String randomWeek = list.get(week);
                ((TextView)findViewById(R.id.tvResult)).setText(randomWeek);

                String txtTmpResult = txtResult.getText().toString();
                if (txtTmpResult == "月曜日")
                {
                    txtResult.setText("ゲームオーバー");
                    btnEnableChange(false,
                            monday,
                            tuesday,
                            wednesday,
                            thursday,
                            friday,
                            saturday,
                            sunday);
                }
                else
                {
                    cnt--;
                    list.remove("月曜日");
                    monday.setEnabled(false);
                    txtRoadToVictory.setText("あと" + cnt + "勝");
                }

                if (cnt == 0)
                {
                    txtResult.setText("優勝おめでとう！！");
                    txtRoadToVictory.setText("Congraturation！！");
                }


            }
        });
        findViewById(R.id.btnTuesDay).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                int week = random.nextInt(list.size());
                String randomWeek = list.get(week);
                ((TextView)findViewById(R.id.tvResult)).setText(randomWeek);

                String txtTmpResult = txtResult.getText().toString();
                if (txtTmpResult == "火曜日")
                {
                    txtResult.setText("ゲームオーバー");
                    btnEnableChange(false,
                            monday,
                            tuesday,
                            wednesday,
                            thursday,
                            friday,
                            saturday,
                            sunday);
                }
                else
                {
                    cnt--;
                    list.remove("火曜日");
                    tuesday.setEnabled(false);
                    txtRoadToVictory.setText("あと" + cnt + "勝");
                }

                if (cnt == 0)
                {
                    txtResult.setText("優勝おめでとう！！");
                    txtRoadToVictory.setText("Congraturation！！");
                }
            }
        });
        findViewById(R.id.btnWednesDay).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                int week = random.nextInt(list.size());
                String randomWeek = list.get(week);
                ((TextView)findViewById(R.id.tvResult)).setText(randomWeek);

                String txtTmpResult = txtResult.getText().toString();
                if (txtTmpResult == "水曜日")
                {
                    txtResult.setText("ゲームオーバー");
                    btnEnableChange(false,
                            monday,
                            tuesday,
                            wednesday,
                            thursday,
                            friday,
                            saturday,
                            sunday);
                }
                else
                {
                    cnt--;
                    list.remove("水曜日");
                    wednesday.setEnabled(false);
                    txtRoadToVictory.setText("あと" + cnt + "勝");
                }

                if (cnt == 0)
                {
                    txtResult.setText("優勝おめでとう！！");
                    txtRoadToVictory.setText("Congraturation！！");
                }
            }
        });
        findViewById(R.id.btnThursday).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                int week = random.nextInt(list.size());
                String randomWeek = list.get(week);
                ((TextView)findViewById(R.id.tvResult)).setText(randomWeek);

                String txtTmpResult = txtResult.getText().toString();
                if (txtTmpResult == "木曜日")
                {
                    txtResult.setText("ゲームオーバー");
                    btnEnableChange(false,
                            monday,
                            tuesday,
                            wednesday,
                            thursday,
                            friday,
                            saturday,
                            sunday);
                }
                else
                {
                    cnt--;
                    list.remove("木曜日");
                    thursday.setEnabled(false);
                    txtRoadToVictory.setText("あと" + cnt + "勝");
                }

                if (cnt == 0)
                {
                    txtResult.setText("優勝おめでとう！！");
                    txtRoadToVictory.setText("Congraturation！！");
                }
            }
        });
        findViewById(R.id.btnFriday).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                int week = random.nextInt(list.size());
                String randomWeek = list.get(week);
                ((TextView)findViewById(R.id.tvResult)).setText(randomWeek);

                String txtTmpResult = txtResult.getText().toString();
                if (txtTmpResult == "金曜日")
                {
                    txtResult.setText("ゲームオーバー");
                    btnEnableChange(false,
                            monday,
                            tuesday,
                            wednesday,
                            thursday,
                            friday,
                            saturday,
                            sunday);
                }
                else
                {
                    cnt--;
                    list.remove("金曜日");
                    friday.setEnabled(false);
                    txtRoadToVictory.setText("あと" + cnt + "勝");
                }

                if (cnt == 0)
                {
                    txtResult.setText("優勝おめでとう！！");
                    txtRoadToVictory.setText("Congraturation！！");
                }
            }
        });
        findViewById(R.id.btnSaturday).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                int week = random.nextInt(list.size());
                String randomWeek = list.get(week);
                ((TextView)findViewById(R.id.tvResult)).setText(randomWeek);

                String txtTmpResult = txtResult.getText().toString();
                if (txtTmpResult == "土曜日")
                {
                    txtResult.setText("ゲームオーバー");
                    btnEnableChange(false,
                            monday,
                            tuesday,
                            wednesday,
                            thursday,
                            friday,
                            saturday,
                            sunday);
                }
                else
                {
                    cnt--;
                    list.remove("土曜日");
                    saturday.setEnabled(false);
                    txtRoadToVictory.setText("あと" + cnt + "勝");
                }

                if (cnt == 0)
                {
                    txtResult.setText("優勝おめでとう！！");
                    txtRoadToVictory.setText("Congraturation！！");
                }
            }
        });
        findViewById(R.id.btnSunday).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                int week = random.nextInt(list.size());
                String randomWeek = list.get(week);
                ((TextView)findViewById(R.id.tvResult)).setText(randomWeek);

                String txtTmpResult = txtResult.getText().toString();
                if (txtTmpResult == "日曜日")
                {
                    txtResult.setText("ゲームオーバー");
                    btnEnableChange(false,
                            monday,
                            tuesday,
                            wednesday,
                            thursday,
                            friday,
                            saturday,
                            sunday);

                }
                else
                {
                    cnt--;
                    list.remove("日曜日");
                    sunday.setEnabled(false);
                    txtRoadToVictory.setText("あと" + cnt + "勝");
                }

                if (cnt == 0)
                {
                    txtResult.setText("優勝おめでとう！！");
                    txtRoadToVictory.setText("Congraturation！！");
                }
            }
        });

        findViewById(R.id.btnRestart).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String[] randomWeeks = {"月曜日","火曜日","水曜日","木曜日","金曜日","土曜日","日曜日"};
                list = new ArrayList<String>(Arrays.asList(randomWeeks));
                cnt = list.size() - 1;
                txtResult.setText("ボタンをタップしてね");
                txtRoadToVictory.setText("あと" + cnt + "勝");
                btnEnableChange(true,
                                 monday,
                                 tuesday,
                                 wednesday,
                                 thursday,
                                 friday,
                                 saturday,
                                 sunday);
            }

        });

    }
    
    public void btnEnableChange(boolean isEnable,
                                Button monday,
                                Button tuesday,
                                Button wednesday,
                                Button thursday,
                                Button friday,
                                Button saturday,
                                Button sunday)
    {
            monday.setEnabled(isEnable);
            tuesday.setEnabled(isEnable);
            wednesday.setEnabled(isEnable);
            thursday.setEnabled(isEnable);
            friday.setEnabled(isEnable);
            saturday.setEnabled(isEnable);
            sunday.setEnabled(isEnable);
    }
}