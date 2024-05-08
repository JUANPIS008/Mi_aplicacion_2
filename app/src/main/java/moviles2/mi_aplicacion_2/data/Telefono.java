package moviles2.mi_aplicacion_2.data;

import android.content.ContentValues;
import android.database.Cursor;
import moviles2.mi_aplicacion_2.data.HuspedContract.HuespedEntry;
import moviles2.mi_aplicacion_2.data.TelefonoContract.TelefonoEntry;

public class Telefono {
    private String nombre;
    private long telefono;

    public Telefono(String nombre, long telefono) {
        this.nombre = nombre;
        this.telefono = telefono;
    }

    public ContentValues toContentValues() {
        ContentValues values = new ContentValues();
        values.put( HuespedEntry.col_nombre, nombre);
        values.put( TelefonoEntry.col_telefono, telefono);
        return values;
    }

    public Telefono(Cursor cursor){
        this.nombre = cursor.getString( cursor.getColumnIndex( HuespedEntry.col_nombre ) );
        this.telefono = cursor.getLong( cursor.getColumnIndex( TelefonoEntry.col_telefono ) );
    }
    public String getUsuario() {
        return nombre;
    }

    public long getTelefono() {
        return telefono;
    }
}
