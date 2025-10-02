
import java.util.ArrayList;

class ContenedorL {
    
    private ArrayList<PacienteCovid> ppio = new ArrayList<PacienteCovid>();

    
    public void ingresaDePrimero(PacienteCovid ptrPac) {
        ppio.add(0, ptrPac);
    }


    public boolean eliminarPacienteCon(int numComorb) {
        boolean removed = false;
        for (int i = 0; i < ppio.size(); ) {
            if (ppio.get(i).numComorbilidades == numComorb) {
                ppio.remove(i);
                removed = true;
            } else {
                i++;
            }
        }
        return removed;
    }

    public boolean eliminarPacientePorFecha(Fecha f) {
        boolean removed = false;
        for (int i = 0; i < ppio.size(); ) {
            PacienteCovid p = ppio.get(i);
            if (p.fechaIngresoUCI != null && f != null &&
                p.fechaIngresoUCI.dia == f.dia &&
                p.fechaIngresoUCI.mes == f.mes &&
                p.fechaIngresoUCI.anio == f.anio) {
                ppio.remove(i);
                removed = true;
            } else {
                i++;
            }
        }
        return removed;
    }


    public void ordenaPacientesPorFecha() {
    
        int n = ppio.size();
        boolean swapped = true;
        while (swapped) {
            swapped = false;
            for (int i = 0; i < n - 1; i++) {
                PacienteCovid a = ppio.get(i);
                PacienteCovid b = ppio.get(i + 1);
                Fecha fa = a.fechaIngresoUCI;
                Fecha fb = b.fechaIngresoUCI;

                boolean shouldSwap = false;
                if (fa == null && fb != null) {
                    shouldSwap = false;
                } else if (fa != null && fb == null) {
                    shouldSwap = false;
                } else if (fa == null && fb == null) {
                    shouldSwap = false;
                } else {
                    if (fa.anio > fb.anio) shouldSwap = true;
                    else if (fa.anio == fb.anio && fa.mes > fb.mes) shouldSwap = true;
                    else if (fa.anio == fb.anio && fa.mes == fb.mes && fa.dia > fb.dia) shouldSwap = true;
                }

                if (shouldSwap) {
                    ppio.set(i, b);
                    ppio.set(i + 1, a);
                    swapped = true;
                }
            }
            n = n - 1;
        }
    }

    public String toString() {
        if (ppio.isEmpty()) return "[ContenedorL] (sin pacientes)";
        String s = "[ContenedorL] Pacientes:\n";
        for (int i = 0; i < ppio.size(); i++) {
            s += (i + 1) + ") " + ppio.get(i).toString() + "\n";
        }
        return s;
    }
}
