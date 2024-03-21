package moviles2.mi_aplicacion_2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity3 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.relative_layout);
    }

    public void constrain_layout (View vista){
        Intent constrain = new Intent(this,MainActivity4.class);
        startActivity(constrain);
    }
}