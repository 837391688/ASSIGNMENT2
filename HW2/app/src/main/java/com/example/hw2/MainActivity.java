package com.example.hw2;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;

import android.text.Editable;
import android.text.TextWatcher;
import android.util.Log;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    EditText txtF, txtC, txtKM, txtMI, txtKG, txtLB, txtLI, txtGA;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txtF = findViewById(R.id.txtF);
        txtC = findViewById(R.id.txtC);
        txtKM = findViewById(R.id.txtKM);
        txtMI = findViewById(R.id.txtMI);
        txtKG = findViewById(R.id.txtKG);
        txtLB = findViewById(R.id.txtLB);
        txtLI = findViewById(R.id.txtLI);
        txtGA = findViewById(R.id.txtGA);


        txtF.addTextChangedListener(new TextWatcher() {
            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) { }

            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) { }

            @Override
            public void afterTextChanged(Editable s) {
                String strF = s.toString();
                Log.i("UnitConverter", "Value in txtF = " + strF);

                if (!txtF.isFocused()) return;
                if (strF.length() == 0) return;


                try {
                    double valF = Double.parseDouble(strF);
                    double valC = (valF - 32.0)*5/9;
                    String strC = Double.toString(valC);
                    Log.i("UnitConverter", "Value in txtC = " + strC);

                    MainActivity.this.txtC.setText(strC);

                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        } );

        txtC.addTextChangedListener(new TextWatcher() {
            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) { }

            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) { }

            @Override
            public void afterTextChanged(Editable s) {
                String strC = s.toString();
                Log.i("UnitConverter", "Value in txtC = " + strC);

                if (!txtC.isFocused()) return;
                if (strC.length() == 0) return;

                try {
                    double valC = Double.parseDouble(strC);
                    double valF = valC*9/5 + 32;
                    String strF = Double.toString(valF);
                    Log.i("UnitConverter", "Value in txtF = " + strF);

                    MainActivity.this.txtF.setText(strF);

                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        } );

        txtKM.addTextChangedListener(new TextWatcher() {
            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) { }

            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) { }

            @Override
            public void afterTextChanged(Editable s) {
                String strKM = s.toString();
                Log.i("UnitConverter", "Value in txtKM = " + strKM);

                if (!txtKM.isFocused()) return;
                if (strKM.length() == 0) return;


                try {
                    double valKM = Double.parseDouble(strKM);
                    double valMI = valKM * 1.61;
                    String strMI = Double.toString(valMI);
                    Log.i("UnitConverter", "Value in txtMI = " + strMI);

                    MainActivity.this.txtMI.setText(strMI);

                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        } );

        txtMI.addTextChangedListener(new TextWatcher() {
            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) { }

            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) { }

            @Override
            public void afterTextChanged(Editable s) {
                String strMI = s.toString();
                Log.i("UnitConverter", "Value in txtMI = " + strMI);

                if (!txtMI.isFocused()) return;
                if (strMI.length() == 0) return;


                try {
                    double valMI = Double.parseDouble(strMI);
                    double valKM = valMI * 0.62;
                    String strKM = Double.toString(valKM);
                    Log.i("UnitConverter", "Value in txtKM = " + strKM);

                    MainActivity.this.txtKM.setText(strKM);

                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        } );

        txtKG.addTextChangedListener(new TextWatcher() {
            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) { }

            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) { }

            @Override
            public void afterTextChanged(Editable s) {
                String strKG = s.toString();
                Log.i("UnitConverter", "Value in txtKG = " + strKG);

                if (!txtKG.isFocused()) return;
                if (strKG.length() == 0) return;


                try {
                    double valKG = Double.parseDouble(strKG);
                    double valLB = valKG * 0.45;
                    String strLB = Double.toString(valLB);
                    Log.i("UnitConverter", "Value in txtLB = " + strLB);

                    MainActivity.this.txtLB.setText(strLB);

                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        } );

        txtLB.addTextChangedListener(new TextWatcher() {
            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) { }

            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) { }

            @Override
            public void afterTextChanged(Editable s) {
                String strLB = s.toString();
                Log.i("UnitConverter", "Value in txtLB = " + strLB);

                if (!txtLB.isFocused()) return;
                if (strLB.length() == 0) return;


                try {
                    double valLB = Double.parseDouble(strLB);
                    double valKG = valLB * 2.20;
                    String strKG = Double.toString(valKG);
                    Log.i("UnitConverter", "Value in txtKG = " + strKG);

                    MainActivity.this.txtKG.setText(strKG);

                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        } );

        txtLI.addTextChangedListener(new TextWatcher() {
            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) { }

            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) { }

            @Override
            public void afterTextChanged(Editable s) {
                String strLI = s.toString();
                Log.i("UnitConverter", "Value in txtLI = " + strLI);

                if (!txtLI.isFocused()) return;
                if (strLI.length() == 0) return;


                try {
                    double valLI = Double.parseDouble(strLI);
                    double valGA = valLI * 3.79;
                    String strGA = Double.toString(valGA);
                    Log.i("UnitConverter", "Value in txtGA = " + strGA);

                    MainActivity.this.txtGA.setText(strGA);

                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        } );

        txtGA.addTextChangedListener(new TextWatcher() {
            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) { }

            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) { }

            @Override
            public void afterTextChanged(Editable s) {
                String strGA = s.toString();
                Log.i("UnitConverter", "Value in txtGA = " + strGA);

                if (!txtGA.isFocused()) return;
                if (strGA.length() == 0) return;


                try {
                    double valGA = Double.parseDouble(strGA);
                    double valLI = valGA * 0.26;
                    String strLI = Double.toString(valLI);
                    Log.i("UnitConverter", "Value in txtLI = " + strLI);

                    MainActivity.this.txtLI.setText(strLI);

                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        } );
    }
}


