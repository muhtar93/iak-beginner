package benniner.iak.project.afinal.mu;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.IdRes;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.RadioGroup;
import android.widget.Toast;

public class Pertanyaan3Activity extends AppCompatActivity {
    int nilai;
    Button btn;
    RadioGroup radioGroup;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pertanyaan3);

        btn = (Button) findViewById(R.id.Button1);

        radioGroup = (RadioGroup)findViewById(R.id.radioGroup);
        radioGroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, @IdRes int checkedId) {
                switch (checkedId) {
                    case R.id.jawaban1:
                        nilai = 0;
                        getValue(nilai);
                        break;
                    case R.id.jawaban2:
                        nilai = 20;
                        getValue(nilai);
                        break;
                    case R.id.jawaban3:
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
                    Toast.makeText(Pertanyaan3Activity.this, "Pilih salah satu jawaban", Toast.LENGTH_SHORT).show();
                }
            }
        });

    }

    public void getValue(final int nilai){
        Intent intent = getIntent();
        String nilaiSebelumnya = intent.getStringExtra("nilai");
        int intNilaiSebelumnya = Integer.parseInt(nilaiSebelumnya);
        final int nilaiTotal = intNilaiSebelumnya + nilai;

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Pertanyaan3Activity.this, Pertanyaan4Activity.class);
                intent.putExtra("nilai", String.valueOf(nilaiTotal));
                startActivity(intent);
            }
        });

    }
}
