package benniner.iak.project.afinal.mu;

import android.content.Intent;
import android.support.annotation.IdRes;
import android.support.annotation.StringDef;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    int nilai;
    Button btn;
    RadioGroup radioGroup;
    RadioButton jawaban1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn = (Button) findViewById(R.id.Button1);

        radioGroup = (RadioGroup)findViewById(R.id.radioGroup);

        jawaban1 = (RadioButton) findViewById(R.id.southport);

        radioGroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, @IdRes int checkedId) {
                switch (checkedId) {
                    case R.id.southport:
                        nilai = 0;
                        getValue(nilai);
                        break;
                    case R.id.newton_health:
                        nilai = 20;
                        getValue(nilai);
                        break;
                    case R.id.preston:
                        nilai = 0;
                        getValue(nilai);
                        break;
                }
            }
        });

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (radioGroup.getCheckedRadioButtonId() == -1) {
                    Toast.makeText(MainActivity.this, "Pilih salah satu jawaban", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }

    public void getValue(final int nilai){
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                    Intent intent = new Intent(MainActivity.this, Pertanyaan2Activity.class);
                    intent.putExtra("nilai", String.valueOf(nilai));
                    startActivity(intent);
                }
        });

    }
}

