package com.liizzasulistio.tekber.kelompok3.presentasitm3;

import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class ResultActivity extends AppCompatActivity
{
    public static final String EXTRA_NAME = "extra_name";
    public static final String EXTRA_NRP = "extra_nrp";

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);

        TextView tvNameRcv = findViewById(R.id.res_name);
        TextView tvNRPRcv = findViewById(R.id.res_nrp);

        //put intent here
        String name = getIntent().getStringExtra(EXTRA_NAME);
        String nrp = getIntent().getStringExtra(EXTRA_NRP);

        String txtName = name;
        String txtNRP = nrp;
        tvNameRcv.setText(txtName);
        tvNRPRcv.setText(txtNRP);
    }
}
