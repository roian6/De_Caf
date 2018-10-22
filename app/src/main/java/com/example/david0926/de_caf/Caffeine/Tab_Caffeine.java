package com.example.david0926.de_caf.Caffeine;

import android.graphics.Color;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.david0926.de_caf.R;
import com.github.mikephil.charting.charts.BarChart;
import com.github.mikephil.charting.charts.Chart;
import com.github.mikephil.charting.charts.LineChart;
import com.github.mikephil.charting.data.BarData;
import com.github.mikephil.charting.data.BarDataSet;
import com.github.mikephil.charting.data.BarEntry;
import com.github.mikephil.charting.data.Entry;
import com.github.mikephil.charting.data.LineData;
import com.github.mikephil.charting.data.LineDataSet;
import com.github.mikephil.charting.utils.ColorTemplate;

import java.util.ArrayList;
import java.util.List;

public class Tab_Caffeine extends android.support.v4.app.Fragment{

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.tab_caffeine, container, false);

        BarChart barChart = v.findViewById(R.id.barchart);

        List<BarEntry> entries = new ArrayList<BarEntry>();
        entries.add(new BarEntry(1, 3));
        entries.add(new BarEntry(2, 5));
        entries.add(new BarEntry(3, 2));
        entries.add(new BarEntry(4, 7));
        entries.add(new BarEntry(5, 2));
        entries.add(new BarEntry(6, 4));
        entries.add(new BarEntry(7, 1));

        BarDataSet dataset = new BarDataSet(entries,"");

        BarData data = new BarData(dataset);
        dataset.setColors(ColorTemplate.JOYFUL_COLORS);
        dataset.setDrawValues(false);
        //barChart.getXAxis().setValueFormatter(new IndexAxisValueFormatter(labels));
        barChart.getXAxis().setTextColor(Color.WHITE);
        barChart.setDrawValueAboveBar(false);

        barChart.getXAxis().setEnabled(false);
        barChart.getAxisRight().setEnabled(false);
        barChart.getAxisLeft().setEnabled(false);
        barChart.getXAxis().setDrawGridLines(false);
        barChart.getAxisLeft().setDrawGridLines(false);
        barChart.getAxisRight().setDrawGridLines(false);
        barChart.setData(data);
        barChart.animateY(1000);
        barChart.getDescription().setEnabled(false);
        barChart.getLegend().setEnabled(false);











        LineChart lineChart = v.findViewById(R.id.linechart);

        List<Entry> entries2 = new ArrayList<Entry>();
        entries2.add(new Entry(1, 3));
        entries2.add(new Entry(2, 5));
        entries2.add(new Entry(3, 2));
        entries2.add(new Entry(4, 7));
        entries2.add(new Entry(5, 2));
        entries2.add(new Entry(6, 4));
        entries2.add(new Entry(7, 1));

        LineDataSet dataset2 = new LineDataSet(entries2,"");

        LineData data2 = new LineData(dataset2);
        dataset2.setColor(Color.WHITE);
        dataset2.setDrawValues(false);
        //barChart.getXAxis().setValueFormatter(new IndexAxisValueFormatter(labels));
        barChart.getXAxis().setTextColor(Color.WHITE);
        barChart.setDrawValueAboveBar(false);

        lineChart.getXAxis().setEnabled(false);
        lineChart.getAxisRight().setEnabled(false);
        lineChart.getAxisLeft().setEnabled(false);
        lineChart.getXAxis().setDrawGridLines(false);
        lineChart.getAxisLeft().setDrawGridLines(false);
        lineChart.getAxisRight().setDrawGridLines(false);
        lineChart.setData(data2);
        lineChart.animateY(1000);
        lineChart.getDescription().setEnabled(false);
        lineChart.getLegend().setEnabled(false);



        return v;
    }
}
