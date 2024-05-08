package moviles2.mi_aplicacion_2.data;

import android.content.ContentValues;
import android.database.Cursor;
import moviles2.mi_aplicacion_2.data.HuspedContract.HuespedEntry;
public class Huesped {
    private String fullnombre;
    private String email;
    private String nacionalidad;
    private String password;


    public Huesped(String fullnombre, String email, String nacionalidad, String password) {
        this.fullnombre = fullnombre;
        this.email = email;
        this.nacionalidad = nacionalidad;
        this.password = password;
    }

    public ContentValues toContentValues() {
        ContentValues values = new ContentValues();
        values.put(HuespedEntry.col_nombre, fullnombre);
        values.put(HuespedEntry.col_email, email);
        values.put(HuespedEntry.col_nacionalidad, nacionalidad);
        values.put(HuespedEntry.col_password, password);
        return values;
    }

    public Huesped(Cursor cursor){
        this.fullnombre = cursor.getString( cursor.getColumnIndex( HuespedEntry.col_nombre ) );
        this.email = cursor.getString( cursor.getColumnIndex( HuespedEntry.col_email ) );
        this.nacionalidad = cursor.getString( cursor.getColumnIndex( HuespedEntry.col_nacionalidad ) );
        this.password = cursor.getString( cursor.getColumnIndex( HuespedEntry.col_password ) );
    }

    public String getUsuario() {
        return fullnombre;
    }
    public String getEmail() {
        return email;
    }
    public String getNombre() {
        return nacionalidad;
    }
    public String getPassword() {
        return password;
    }

}
