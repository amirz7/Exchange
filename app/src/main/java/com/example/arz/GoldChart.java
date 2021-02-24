package com.example.arz;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Build;
import android.os.Bundle;

import com.github.mikephil.charting.charts.LineChart;
import com.github.mikephil.charting.components.Description;
import com.github.mikephil.charting.components.XAxis;
import com.github.mikephil.charting.data.Entry;
import com.github.mikephil.charting.data.LineData;
import com.github.mikephil.charting.data.LineDataSet;
import com.github.mikephil.charting.formatter.ValueFormatter;
import com.github.mikephil.charting.interfaces.datasets.ILineDataSet;
import com.github.mikephil.charting.utils.ColorTemplate;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.Map;

import okhttp3.OkHttpClient;
import okhttp3.logging.HttpLoggingInterceptor;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.converter.gson.GsonConverterFactory;

public class GoldChart extends AppCompatActivity {

    public static final String BASE_URL = "https://wft-geo-db.p.rapidapi.com/";
    private YahooFinanceAPI yahooFinanceAPI;

    private LineChart lineChart;
//    private TextInputLayout stockTickerTextInputLayout;
//    private RadioGroup periodRadioGroup, intervalRadioGroup;
//    private CheckBox highCheckBox, lowCheckBox, closeCheckBox;

        LineData lineData;
        LineDataSet lineDataSet;
        ArrayList lineEntries;
        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_gold_chart);
            lineChart = findViewById(R.id.lineChart);
            getEntries();
            lineDataSet = new LineDataSet(lineEntries, "");
            lineData = new LineData(lineDataSet);
            lineChart.setData(lineData);
            lineDataSet.setColors(ColorTemplate.JOYFUL_COLORS);
            lineDataSet.setValueTextColor(Color.BLACK);
            lineDataSet.setValueTextSize(18f);
        }
        private void getEntries() {
            lineEntries = new ArrayList<>();
            lineEntries.add(new Entry(2f, 0));
            lineEntries.add(new Entry(4f, 1));
            lineEntries.add(new Entry(6f, 1));
            lineEntries.add(new Entry(8f, 3));
            lineEntries.add(new Entry(7f, 4));
            lineEntries.add(new Entry(3f, 3));
        }
}