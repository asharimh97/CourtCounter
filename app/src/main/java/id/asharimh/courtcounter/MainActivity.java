package id.asharimh.courtcounter;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView skorTeamA, skorTeamB ;
    Button freeThrowB, twoPointsB,threePointsB, btnHasil ;
    int skorA = 0 ;
    int skorB = 0 ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        skorTeamA = (TextView) findViewById(R.id.skorTeamA) ;
        skorTeamB = (TextView) findViewById(R.id.skorTeamB) ;
        freeThrowB = (Button) findViewById(R.id.btnFreeB) ;
        twoPointsB = (Button) findViewById(R.id.btn2B);
        threePointsB = (Button) findViewById(R.id.btn3B);
        btnHasil = (Button) findViewById(R.id.btnHasil) ;

        freeThrowB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                skorB = skorB + 1 ;
                setSkorTeamB(skorB);
            }
        });

        twoPointsB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                skorB = skorB + 2 ;
                setSkorTeamB(skorB);
            }
        });

        threePointsB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                skorB = skorB + 3 ;
                setSkorTeamB(skorB);
            }
        });

        btnHasil.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(MainActivity.this, HasilActivity.class) ;
                i.putExtra("SkorA", skorA) ;
                i.putExtra("SkorB", skorB) ;
                startActivity(i);
            }
        });

    }

    private void setSkorTeamA(int number){
        skorTeamA.setText(number+"");
    }

    private void setSkorTeamB(int number){
        skorTeamB.setText(number+"");
    }

    public void freeThrowTeamA(View v){
        skorA = skorA + 1 ;
        setSkorTeamA(skorA);
    }

    public void twoPointsA(View v){
        skorA = skorA + 2 ;
        setSkorTeamA(skorA);
    }

    public void threePointsA(View v){
        skorA = skorA + 3 ;
        setSkorTeamA(skorA);
    }

    public void resetScore(View v){
        skorA = 0 ;
        skorB = 0 ;
        setSkorTeamA(skorA);
        setSkorTeamB(skorB);
    }

}
