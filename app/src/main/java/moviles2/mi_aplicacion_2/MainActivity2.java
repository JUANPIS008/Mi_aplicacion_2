package moviles2.mi_aplicacion_2;

import androidx.activity.result.contract.ActivityResultContracts;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;



public class MainActivity2 extends AppCompatActivity implements View.OnClickListener{
    Button btLongin;
    Button btSing;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.lineaar_layout);

        btLongin = findViewById(R.id.btLogin_in);
        btLongin.setOnClickListener(this);

        btSing = findViewById(R.id.btSing_in);
        btSing.setOnClickListener(this);
    }


    @Override
    public void onClick(View vista) {
        if (vista.getId() == R.id.btLogin_in){
            Intent login_in = new Intent(getApplicationContext(),MainActivity5.class);
            startActivity(login_in);
        } else if (vista.getId() == R.id.btSing_in){
            Intent sing_in = new Intent(getApplicationContext(),MainActivity3.class);
            startActivity(sing_in);
        }
    }

}