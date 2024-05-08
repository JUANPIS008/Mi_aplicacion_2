package moviles2.mi_aplicacion_2.data;

public class Spa {
    private String nombre_huesped;
    private String fecha_reserva;
    private String tipo_tratamiento;
    private int duracion_tratamiento;
    private String email_huesped;

    public Spa(String nombre_huesped, String fecha_reserva, String tipo_tratamiento, int duracion_tratamiento, String email_huesped) {
        this.nombre_huesped = nombre_huesped;
        this.fecha_reserva = fecha_reserva;
        this.tipo_tratamiento = tipo_tratamiento;
        this.duracion_tratamiento = duracion_tratamiento;
        this.email_huesped = email_huesped;
    }

}
