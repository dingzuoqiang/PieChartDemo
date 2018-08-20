package com.dzq.piechart;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        PieChart vPie = f(R.id.v_pie);
        List<PieData> pieData = new ArrayList<>();
        for (int i = 0; i < 6; i++) {
            pieData.add(new PieData("text" + i, (float) Math.random() * 90, vPie.getCOLORS()[i]));
        }
        vPie.setData(pieData);
    }

    public <T extends View> T f(int id) {
        return (T) findViewById(id);
    }
}
