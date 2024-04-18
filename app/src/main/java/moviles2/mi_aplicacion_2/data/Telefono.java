package moviles2.mi_aplicacion_2.data;

import android.content.ContentValues;
import android.database.Cursor;
import moviles2.mi_aplicacion_2.data.HuspedContract.HuespedEntry;
import moviles2.mi_aplicacion_2.data.TelefonoContract.TelefonoEntry;

public class Telefono {
    private String usuario;
    private long telefono;

    public Telefono(String usuario, long telefono) {
        this.usuario = usuario;
        this.telefono = telefono;
    }

    public ContentValues toContentValues() {
        ContentValues values = new ContentValues();
        values.put( HuespedEntry.col_usuario, usuario);
        values.put( TelefonoEntry.col_telefono, telefono);
        return values;
    }

    public Telefono(Cursor cursor){
        this.usuario = cursor.getString( cursor.getColumnIndex( HuespedEntry.col_usuario ) );
        this.telefono = cursor.getLong( cursor.getColumnIndex( TelefonoEntry.col_telefono ) );
    }
    public String getUsuario() {
        return usuario;
    }

    public long getTelefono() {
        return telefono;
    }
}