package com.example.practical5_133;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity
{

    private TextView mTextViewResult;
    private EditText mEditTextNumber1;
    private EditText mEditTextNumber2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mTextViewResult = findViewById(R.id.text_view_result);
        mEditTextNumber1 = findViewById(R.id.edit_text_number1);
        mEditTextNumber2 = findViewById(R.id.edit_text_number2);

        Button buttonOpenActivity2 = findViewById(R.id.button_open_activity2);
        buttonOpenActivity2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (mEditTextNumber1.getText().toString().equals("")
                        || mEditTextNumber2.getText().toString().equals("")) {
                    Toast.makeText(MainActivity.this, "Please insert numbers", Toast.LENGTH_SHORT).show();
                } else {

                    int number1 = Integer.parseInt(mEditTextNumber1.getText().toString());
                    int number2 = Integer.parseInt(mEditTextNumber2.getText().toString());

                    Intent intent = new Intent(MainActivity.this, Activity2.class);
                    intent.putExtra("number1", number1);
                    intent.putExtra("number2", number2);
                    startActivityForResult(intent, 1);
                }
            }
        });
}