package benniner.iak.project.afinal.mu;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class Pertanyaan4Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pertanyaan4);

    }
    {
        startActivity(new Intent(Pertanyaan4Activity.this,Pertanyaan5Activity.class));
        finish();

    }
}
