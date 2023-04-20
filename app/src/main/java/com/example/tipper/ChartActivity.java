package com.example.tipper;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

import com.github.mikephil.charting.animation.Easing;
import com.github.mikephil.charting.charts.LineChart;
import com.github.mikephil.charting.data.Entry;
import com.github.mikephil.charting.data.LineData;
import com.github.mikephil.charting.data.LineDataSet;
import com.github.mikephil.charting.interfaces.datasets.ILineDataSet;

import java.util.ArrayList;

public class ChartActivity extends AppCompatActivity {

    private LineChart lineChart;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState); // call superclass onCreate
        setContentView(R.layout.chart_layout); // inflate the GUI

        lineChart = findViewById(R.id.getTheGraph);
        ArrayList<String> xAxisValues = new ArrayList<String>();
        xAxisValues.add("11/2022");
        xAxisValues.add("12/2022");
        xAxisValues.add("01/2023");
        xAxisValues.add("02/2023");
        xAxisValues.add("03/2023");
        xAxisValues.add("04/2023");

        lineChart.getXAxis().setValueFormatter(new com.github.mikephil.charting.formatter.IndexAxisValueFormatter(xAxisValues));

        ArrayList<Entry> entries = new ArrayList<>();

        ArrayList<Entry> marathi = new ArrayList<>();
        marathi.add(new Entry(0, 20));
        marathi.add(new Entry(1, 21));
        marathi.add(new Entry(2, 19));
        marathi.add(new Entry(3, 24));
        marathi.add(new Entry(4, 25));
        marathi.add(new Entry(5, 22));


        ArrayList<LineDataSet> lines = new ArrayList<LineDataSet>();


        LineDataSet set3 = new LineDataSet(marathi, "BMI");
        set3.setDrawFilled(true);
        set3.setFillColor(Color.WHITE);
        set3.setColor(Color.BLACK);
        set3.setCircleColor(Color.parseColor("#000000"));
        lines.add(set3);


        ArrayList<ILineDataSet> dataSets = new ArrayList<>();
        dataSets.add(set3);

        lineChart.setData(new LineData(dataSets));
        lineChart.getDescription().setText("");
        lineChart.getDescription().setTextColor(Color.RED);
        lineChart.animateY(1400, Easing.EaseInOutBounce);
    }
}
