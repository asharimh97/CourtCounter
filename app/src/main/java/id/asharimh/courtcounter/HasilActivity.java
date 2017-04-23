package id.asharimh.courtcounter;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class HasilActivity extends AppCompatActivity {

    TextView hasilSkorA, hasilSkorB, timPemenang ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hasil);

        hasilSkorA = (TextView) findViewById(R.id.hasilSkorA);
        hasilSkorB = (TextView) findViewById(R.id.hasilSkorB);
        timPemenang = (TextView) findViewById(R.id.timWinner);

        Intent i = getIntent() ;
        int skorA = i.getIntExtra("SkorA", 0) ;
        int skorB = i.getIntExtra("SkorB", 0) ;
        hasilSkorA.setText(skorA+"");
        hasilSkorB.setText(skorB+"");

    }
}
