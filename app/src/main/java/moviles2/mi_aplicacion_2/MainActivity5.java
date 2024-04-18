package moviles2.mi_aplicacion_2;

import android.annotation.SuppressLint;
import android.app.DatePickerDialog;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

import java.nio.file.Files;
import java.util.Calendar;

public class MainActivity5 extends AppCompatActivity implements View.OnClickListener {
    Button dateStar;
    Button dateEnd;
    EditText fechaInicio;
    EditText fechaFIn;
    private int dia,mes,año;

    @SuppressLint("CutPasteId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.menu_principal);

        dateStar = (Button) findViewById(R.id.idStart);
        dateEnd = (Button) findViewById(R.id.idEnd);
        fechaInicio = (EditText) findViewById(R.id.idInicio);
        fechaFIn = (EditText) findViewById(R.id.idFin);
        dateStar.setOnClickListener(this);
        dateEnd.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        if (v == dateStar){
            final Calendar calendar = Calendar.getInstance();
            dia = calendar.get(Calendar.DAY_OF_MONTH);
            mes = calendar.get(Calendar.MONTH);
            año = calendar.get(Calendar.YEAR);

            DatePickerDialog datePickerDialog = new DatePickerDialog(this, new DatePickerDialog.OnDateSetListener() {
                @Override
                public void onDateSet(DatePicker view, int year, int month, int dayOfMonth) {
                    fechaInicio.setText(dayOfMonth+"/"+(month+1)+"/"+year);
                }
            }
            ,dia,mes,año);
            datePickerDialog.show();

        }if (v == dateEnd) {
            final Calendar calendar = Calendar.getInstance();
            dia = calendar.get(Calendar.DAY_OF_MONTH);
            mes = calendar.get(Calendar.MONTH);
            año = calendar.get(Calendar.YEAR);

            DatePickerDialog datePickerDialog = new DatePickerDialog(this, new DatePickerDialog.OnDateSetListener() {
                @Override
                public void onDateSet(DatePicker view, int year, int month, int dayOfMonth) {
                    fechaFIn.setText(dayOfMonth + "/" + (month + 1) + "/" + year);
                }
            }, dia, mes, año);
            datePickerDialog.show();
        }
    }
}