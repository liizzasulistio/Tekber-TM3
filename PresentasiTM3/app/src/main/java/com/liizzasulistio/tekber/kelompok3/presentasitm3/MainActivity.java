package com.liizzasulistio.tekber.kelompok3.presentasitm3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity implements View.OnClickListener
{
    //Variable declaration
    private EditText edtName;
    private EditText edtNRP;
    private Button btnMoveData, btnMove;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        edtName = findViewById(R.id.edt_name);
        edtNRP = findViewById(R.id.edt_nrp);
        btnMoveData = findViewById(R.id.btn_data);
        btnMove = findViewById(R.id.btn_move);

        btnMoveData.setOnClickListener(this);
        btnMove.setOnClickListener(this);
    }

    @Override
    public void onClick(View view)
    {
        if(view.getId() == R.id.btn_data)
        {
            String inputName = edtName.getText().toString().trim();
            String inputNRP = edtNRP.getText().toString().trim();

            //Check if value is null
            boolean isEmptyField = false;
            if(TextUtils.isEmpty(inputName))
            {
                isEmptyField = true;
                edtName.setError("Please fill out this field.");
            }
            if(TextUtils.isEmpty(inputNRP))
            {
                isEmptyField = true;
                edtNRP.setError("Please fill out this field.");
            }
            if(!isEmptyField)
            {
                Intent moveData = new Intent(MainActivity.this, ResultActivity.class);
                moveData.putExtra(ResultActivity.EXTRA_NAME, inputName);
                moveData.putExtra(ResultActivity.EXTRA_NRP, inputNRP);
                startActivity(moveData);
            }

        }

        if(view.getId() == R.id.btn_move)
        {
            //Move Activity
            Intent moveIntent = new Intent(MainActivity.this, OtherActivity.class);
            startActivity(moveIntent);
        }
    }
}