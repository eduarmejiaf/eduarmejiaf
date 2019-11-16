package tallerfinal;

import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int msg = 0, opc = 0, cantidad = 0, indexComunidades = 0, indexProfesores = 0, indexEstudiantes = 0, indexAsignaturas = 0, indexMatriculas = 0, tvec = 0, cantidadComunidades = 0;
        int validar = 0, cantidadProfesores = 0, cantidadEstudiantes = 0, cantidadMatriculas = 0, cantidadAsignaturas = 0;
        String nombre = "";
        String cedula = "";
        String profesion = "";
        String categoria = "";
        Comunidad[] comunidades = new Comunidad[50];
        Profesores[] profesores = new Profesores[50];
        Estudiante[] estudiantes = new Estudiante[50];
        Asignatura[] asignaturas = new Asignatura[50];
        Matriculas[] matriculas = new Matriculas[50];
        System.out.println("Digite la opción que desea realizar: ");
        while (opc != 8) {
            System.out.println("1.Ingreso de comunidad\n2.Ingreso de profesor\n3.Ingreso de estudiante\n4.Ingreso de asignaturas\n5.Listados\n6.Proceso de matricula\n7.Consultas");
            opc = sc.nextInt();
            switch (opc) {
                case 1:

                    System.out.println("Ingrese la cantidad de personas que desea registrar en la comunidad. ");
                    int i = 0,
                     validarComunidad = 0;
                    cantidad = sc.nextInt();
                    sc.nextLine();
                    while (i < cantidad) {
                        int swC = 0;
                        validarComunidad = 0;
                        do {
                            swC = 0;
                            System.out.println("Ingrese la cédula de la persona:  " + (cantidadComunidades + 1));
                            cedula = sc.nextLine();

                            validarComunidad = validarComunidad(cedula, cantidadComunidades, comunidades);

                            if (validarComunidad < cantidadComunidades) {
                                System.out.println("La cédula ya existe en la comunidad, intente nuevamente.");
                            } else {
                                System.out.println("Ingrese el nombre de la persona:  " + (cantidadComunidades + 1));
                                nombre = sc.nextLine();
                                comunidades[cantidadComunidades] = new Comunidad(cedula, nombre);
                                validarComunidad++;
                                swC = 1;

                            }
                        } while (validarComunidad < cantidadComunidades);
                        if (swC == 1) {
                            cantidadComunidades++;
                        }
                        i++;
                    }
                    break;
                case 2:
                    int swP = 0;
                    System.out.println("Ingrese cedula del profesor: " + (cantidadProfesores + 1));
                    cedula = sc.nextLine();
                    sc.nextLine();
                    validar = validarComunidad(cedula, cantidadComunidades, comunidades);
                    if (validar < cantidadComunidades) {
                        int validarProfesores = validarProfesores(profesores, cantidadProfesores, cedula);
                        if (validarProfesores >= cantidadProfesores) {
                            nombre = comunidades[validar].getNombre();
                            System.out.println("Ingrese la profesión del profesor" + (cantidadProfesores + 1));////
                            profesion = sc.nextLine();
                            System.out.println("Ingrese la categoria del profesor " + (cantidadProfesores + 1));///
                            categoria = sc.nextLine();
                            profesores[cantidadProfesores] = new Profesores(cedula, nombre, profesion, categoria);
                            validar = cantidadComunidades;
                            swP = 1;
                        } else {
                            System.out.println("El profesor ya se encuentra registrado.");
                        }

                    } else {
                        System.out.println("La cédula no se encuentra registrada en la comunidad.");
                    }

                    if (swP == 1) {
                        cantidadProfesores++;
                    }

                    break;
                case 3:
                    break;
                case 4:
                    break;
                case 5:
                    int submenu = 0;
                    System.out.println("Listados");
                    while (submenu != 5) {
                        System.out.println("1)Listado Comunidad\n2)Listado Profesores\n3)Listado de Estudiantes\n4)Listado de Asignaturas\n5)Volver al menú principal");
                        submenu = sc.nextInt();
                        sc.nextLine();
                        switch (submenu) {
                            case 1:
                                if (comunidades[0] == null) {
                                    System.out.println("No se ha registrado ninguna persona en la comunidad. ");
                                } else {
                                    i = 0;
                                    System.out.println("Listado de comunidad");
                                    for (i = 0; i < cantidadComunidades; i++) {
                                        comunidades[i].Mostrar();
                                    }
                                }
                                break;
                            case 2:
                                if (profesores[0] == null) {
                                    System.out.println("No se ha registrado ningún profesor en la comunidad. ");
                                } else {
                                    i = 0;
                                    System.out.println("Listado de Profesores");
                                    for (i = 0; i < cantidadProfesores; i++) {
                                        profesores[i].Mostrar();
                                    }
                                }
                                break;
                            case 3:
                                if (estudiantes[0] == null) {
                                    System.out.println("No se ha registrado ningún estudiante en la comunidad. ");
                                } else {
                                    i = 0;
                                    System.out.println("Listado de Estudiantes");
                                    for (i = 0; i < cantidadEstudiantes; i++) {
                                        estudiantes[i].Mostrar();
                                    }
                                }
                                ;
                            case 4:
                                if (asignaturas[0] == null) {
                                    System.out.println("No se ha registrado ninguna asignatura en la comunidad. ");
                                } else {
                                    i = 0;
                                    System.out.println("Listado de Asignatura");
                                    for (i = 0; i < cantidadAsignaturas; i++) {
                                        asignaturas[i].Mostrar();
                                    }
                                }
                                break;
                            case 5:
                                System.out.println("Menú principal...");
                                break;
                        }
                    }
                    break;
                case 6:
                    break;
                case 7:
                    break;
                default:
                    System.out.println("Gracias por utilizar nuestro programa.");
            }
        }
    }

    public static int validarComunidad(String cedula, int tvec, Comunidad comunidades[]) {
        int indexComunidades = 0, sw = 0;
        if (tvec != 0) {
            indexComunidades = 0;
            while (indexComunidades < tvec && sw == 0) {
                if (comunidades[indexComunidades].getCedula().equals(cedula)) {
                    sw = 1;
                } else {
                    indexComunidades++;
                }
            }
        }
        return indexComunidades;
    }

    public static int validarProfesores(Profesores profesores[], int tvec, String cedula) {
        int indexProfesores = 0, sw = 0;
        if (tvec != 0) {
            indexProfesores = 0;
            while (indexProfesores < tvec && sw == 0) {
                if (profesores[indexProfesores].getCedula().equals(cedula)) {
                    sw = 1;
                } else {
                    indexProfesores++;
                }
            }

        }
        return indexProfesores;
    }
}
