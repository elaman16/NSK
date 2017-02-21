package kz.dreamwings.nsk.navdraw;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.Spinner;
import android.widget.TextView;

import com.dreamwings.azamat.navdraw.R;

public class Calkulator_Health extends AppCompatActivity {

    Spinner spinner1;
    Spinner spinner2;
    Spinner spinner3;
    Spinner spinner4;
    Spinner spinner5;
    EditText sena;
    TextView itogo;
    LinearLayout itogo_ll;

    int san = 1000;
    @Override
    protected void onCreate(final Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.calk_avto);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        getSupportActionBar().setTitle("Калькулятор");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(true);
        toolbar.setNavigationOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onBackPressed();
            }
        });
         spinner1 = (Spinner) findViewById(R.id.spinner1);
         spinner2 = (Spinner) findViewById(R.id.spinner2);
         spinner3 = (Spinner) findViewById(R.id.spinner3);
         spinner4 = (Spinner) findViewById(R.id.spinner4);
         spinner5 = (Spinner) findViewById(R.id.spinner5);
         sena = (EditText) findViewById(R.id.emailText);
         itogo = (TextView) findViewById(R.id.itogo);
        itogo_ll = (LinearLayout) findViewById(R.id.ll_itogo);

        Button submitButton = (Button) findViewById(R.id.submitButton);


        submitButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (!sena.getText().toString().trim().isEmpty() && !sena.getText().toString().equals("")) {

                    if (Integer.parseInt(sena.getText().toString())>100000){
                    Log.d("lala","lala");
                    san = 1000;
                    String text1 = spinner1.getSelectedItem().toString();
                    String text2 = spinner2.getSelectedItem().toString();
                    String text3 = spinner3.getSelectedItem().toString();
                    String text4 = spinner4.getSelectedItem().toString();
                    String text5 = spinner5.getSelectedItem().toString();
                    int stoimost = Integer.parseInt(sena.getText().toString());

                    if (Integer.parseInt(text1) < 2000) {
                        san = san * 5;
                    } else san = san * 2;

                    if (text2.equals("Легковой автомобиль")) {
                        san = san * 2;
                    } else san = san * 5;

                    if (!text3.equals("Казахстан")) {
                        san = san + 2500;
                    } else san = san + 1000;

                    if (stoimost < 1000000) {
                        san = san + 2000;
                    } else if (stoimost > 1000000 && stoimost < 20000000) {
                        san = san + 10000;
                    } else san = san + 20000;


                    itogo.setText(Integer.toString(san) + "тг");
                    itogo_ll.setVisibility(View.VISIBLE);
                }
                    else {
                        sena.setError("Цена автомобиля не может быть такой, введите реальную стоимость");
                        requestFocus(sena);
                    }

                }


                else if(sena.getText().toString().trim().isEmpty()) {
                    sena.setError("Заполните это поле");
                    requestFocus(sena);
                    Log.d("lala","blabla");}
            }

        });




    }

    private void requestFocus(View view) {
        if (view.requestFocus()) {
            getWindow().setSoftInputMode(WindowManager.LayoutParams.SOFT_INPUT_STATE_ALWAYS_VISIBLE);
        }
    }

}
