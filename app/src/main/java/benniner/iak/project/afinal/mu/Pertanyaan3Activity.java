package benniner.iak.project.afinal.mu;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class Pertanyaan3Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pertanyaan3);

    }
    {
        startActivity(new Intent(Pertanyaan3Activity.this,Pertanyaan4Activity.class));
        finish();

    }
}
