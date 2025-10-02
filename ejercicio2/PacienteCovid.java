class PacienteCovid implements Comparable<PacienteCovid> {
    String cedula;
    String nombre;
    String telefono;
    int numComorbilidades;
    Fecha fechaIngresoUCI;

    public PacienteCovid(String cedula, String nombre, String telefono, int numComorbilidades, Fecha fechaIngresoUCI) {
        this.cedula = cedula;
        this.nombre = nombre;
        this.telefono = telefono;
        this.numComorbilidades = numComorbilidades;
        this.fechaIngresoUCI = fechaIngresoUCI;
    }

    
    public int compareTo(PacienteCovid o) {
        if (this.fechaIngresoUCI == null && o.fechaIngresoUCI == null) return this.cedula.compareTo(o.cedula);
        if (this.fechaIngresoUCI == null) return 1;
        if (o.fechaIngresoUCI == null) return -1;

        if (this.fechaIngresoUCI.anio != o.fechaIngresoUCI.anio)
            return this.fechaIngresoUCI.anio - o.fechaIngresoUCI.anio;
        if (this.fechaIngresoUCI.mes != o.fechaIngresoUCI.mes)
            return this.fechaIngresoUCI.mes - o.fechaIngresoUCI.mes;
        if (this.fechaIngresoUCI.dia != o.fechaIngresoUCI.dia)
            return this.fechaIngresoUCI.dia - o.fechaIngresoUCI.dia;

        return this.cedula.compareTo(o.cedula);
    }

    public String toString() {
        return "PacienteCovid{cedula='" + cedula + "', nombre='" + nombre + "', telefono='" + telefono +
               "', numComorbilidades=" + numComorbilidades +
               ", fechaIngresoUCI=" + fechaIngresoUCI + "}";
    }
}
