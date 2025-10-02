import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ContenedorL cont = new ContenedorL();
        int op;

        do {
            System.out.println("Digite la informacion del paciente");
            System.out.println("Eliminar Paciente por fecha");
            System.out.println("Enseñar la info del paciente");
            System.out.println("Ordenar Paciente por fecha");
            System.out.println("Salir");
            System.out.print("Option: ");
            op = Integer.parseInt(sc.nextLine());

            if (op == 1) {
                System.out.print("ID (cedula): ");
                String ced = sc.nextLine();
                System.out.print("Name (nombre): ");
                String nom = sc.nextLine();
                System.out.print("Phone (telefono): ");
                String tel = sc.nextLine();
                System.out.print("Comorbidity number: ");
                int ncom = Integer.parseInt(sc.nextLine());

                System.out.print("Has ICU admission date? (y/n): ");
                String yn = sc.nextLine().trim().toLowerCase();
                Fecha f = null;
                if (yn.startsWith("y")) {
                    System.out.print("Ingrese la fecha");
                    String[] parts = sc.nextLine().trim().split("\\s+");
                    int d = Integer.parseInt(parts[0]);
                    int m = Integer.parseInt(parts[1]);
                    int a = Integer.parseInt(parts[2]);
                    f = new Fecha(d, m, a);
                }

                PacienteCovid p = new PacienteCovid(ced, nom, tel, ncom, f);
                cont.ingresaDePrimero(p);
                System.out.println("Se inserto correctamente!");
            } else if (op == 2) {
                System.out.print("Ponga la fecha que desea eliminar del sistema");
                String[] parts = sc.nextLine().trim().split("\\s+");
                int d = Integer.parseInt(parts[0]);
                int m = Integer.parseInt(parts[1]);
                int a = Integer.parseInt(parts[2]);
                boolean ok = cont.eliminarPacientePorFecha(new Fecha(d, m, a));
                System.out.println("Borrado");
            } else if (op == 3) {
                System.out.println(cont);
            } else if (op == 4) {
                cont.ordenaPacientesPorFecha();
                System.out.println("Ordenado Correctamente");
            }
        } while (op != 0);

        sc.close();
    }
}
