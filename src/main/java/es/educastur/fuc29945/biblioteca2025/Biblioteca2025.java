/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package es.educastur.fuc29945.biblioteca2025;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author 1dawd27
 */
public class Biblioteca2025 {
    private static ArrayList<Libro> libros=new ArrayList();
    private static ArrayList <Usuario> usuarios= new ArrayList();
    private static ArrayList <Prestamo> prestamos= new ArrayList();
    private static ArrayList <Prestamo> prestamosHistorico= new ArrayList();
    private static Scanner sc=new Scanner(System.in);
    
    
    public static void main(String[] args) {
        //Biblioteca2025.cargaDatos();
        cargaDatosPrueba();
        menu();
        
        
        
    }
    public static void cargaDatosPrueba() {
        libros.add(new Libro("1-11", "El Hobbit", "JRR Tolkien", "Aventuras", 3));
        libros.add(new Libro("1-22", "El Silmarillon", "JRR Tolkien", "Aventuras", 3));
        libros.add(new Libro("1-33", "El Medico", "N. Gordon", "Aventuras", 4));
        libros.add(new Libro("1-44", "Chaman", "N. Gordon", "Aventuras", 3));
        libros.add(new Libro("1-55", "Momo", "M. Ende", "Aventuras", 2));
        libros.add(new Libro("1-66", "Paraiso inhabitado", "A.M.Matute", "Aventuras", 0));
        libros.add(new Libro("1-77", "Olvidado Rey Gudu", "A.M.Matute", "Aventuras", 0));
        libros.add(new Libro("1-88", "El ultimo barco", "D.Villar", "Novela Negra", 3));
        libros.add(new Libro("1-99", "Ojos de agua", "D.Villar", "Novela Negra", 0));

        usuarios.add(new Usuario("11", "Ana", "ana@email.com", "621111111"));
        usuarios.add(new Usuario("22", "David", "david@email.com", "622222222"));
        usuarios.add(new Usuario("33", "Bea", "bea@email.com", "623333333"));
        usuarios.add(new Usuario("44", "Lucas", "lucas@email.com", "624444444"));
        usuarios.add(new Usuario("55", "Carlota", "carlota@email.com", "625555555"));
        usuarios.add(new Usuario("66", "Juan", "juan@email.com", "626666666"));

        LocalDate hoy = LocalDate.now(); //OBTENEMOS LA FECHA DE HOY CON EL MÉTODO now()

        //PRESTAMOS "NORMALES" REALIZADOS HOY Y QUE SE HAN DE DEVOLVER EN 15 DÍAS
        prestamos.add(new Prestamo(libros.get(0), usuarios.get(0), hoy, hoy.plusDays(15)));
        prestamos.add(new Prestamo(libros.get(1), usuarios.get(0), hoy, hoy.plusDays(15)));
        prestamos.add(new Prestamo(libros.get(5), usuarios.get(0), hoy, hoy.plusDays(15)));
        prestamos.add(new Prestamo(libros.get(0), usuarios.get(4), hoy, hoy.plusDays(15)));
        prestamos.add(new Prestamo(libros.get(0), usuarios.get(1), hoy, hoy.plusDays(15)));
        //PRESTAMOS QUE YA TENIAN QUE HABER SIDO DEVUELTOS PORQUE SU FECHA DE DEVOLUCIÓN ES ANTERIOR A HOY
        prestamos.add(new Prestamo(libros.get(5), usuarios.get(1), hoy.minusDays(17), hoy.minusDays(2)));
        prestamos.add(new Prestamo(libros.get(1), usuarios.get(4), hoy.minusDays(18), hoy.minusDays(3)));
        prestamos.add(new Prestamo(libros.get(2), usuarios.get(4), hoy.minusDays(20), hoy.minusDays(5)));
        prestamos.add(new Prestamo(libros.get(3), usuarios.get(4), hoy.minusDays(20), hoy.minusDays(5)));

        //PRESTAMOS HISTORICOS QUE YA HAN SIDO DEVUELTOS Y POR TANTO ESTÁN EN LA COLECCION prestamosHist
        prestamosHistorico.add(new Prestamo(libros.get(0), usuarios.get(0), hoy.minusDays(30), hoy.minusDays(15)));
        prestamosHistorico.add(new Prestamo(libros.get(2), usuarios.get(0), hoy.minusDays(30), hoy.minusDays(15)));
        prestamosHistorico.add(new Prestamo(libros.get(7), usuarios.get(4), hoy.minusDays(30), hoy.minusDays(15)));
        prestamosHistorico.add(new Prestamo(libros.get(5), usuarios.get(4), hoy.minusDays(20), hoy.minusDays(15)));
        prestamosHistorico.add(new Prestamo(libros.get(1), usuarios.get(1), hoy.minusDays(20), hoy.minusDays(5)));
        prestamosHistorico.add(new Prestamo(libros.get(7), usuarios.get(2), hoy.minusDays(10), hoy));
        prestamosHistorico.add(new Prestamo(libros.get(6), usuarios.get(3), hoy.minusDays(10), hoy));
    }
    public static void cargaDatos(){
        libros.add(new Libro("1-11","El Hobbit","JRR Tolkien","Aventuras",3)); 
        libros.add(new Libro("1-22","El Silmarillon","JRR Tolkien","Aventuras",3)); 
        libros.add(new Libro("1-33","El Medico","N. Gordon","Aventuras",4)); 
        libros.add(new Libro("1-44","Chaman","N. Gordon","Aventuras",3)); 
        libros.add(new Libro("1-55","Momo","M. Ende","Aventuras",2)); 
        libros.add(new Libro("1-66","Paraiso inhabitado","A.M.Matute","Aventuras",2)); 
        libros.add(new Libro("1-77","Olvidado Rey Gudu","A.M.Matute","Aventuras",0)); 
        libros.add(new Libro("1-88","El ultimo barco","D.Villar","Novela Negra",3)); 
        libros.add(new Libro("1-99","Ojos de agua","D.Villar","Novela Negra",0));  

        usuarios.add(new Usuario("11","Ana","ana@email.com","621111111")); 
        usuarios.add(new Usuario("22","David","david@email.com","622222222")); 
        usuarios.add(new Usuario("33","Bea","bea@email.com","623333333")); 
        usuarios.add(new Usuario("44","Lucas","lucas@email.com","624444444")); 
        usuarios.add(new Usuario("55","Carlota","carlota@email.com","625555555")); 
        usuarios.add(new Usuario("66","Juan","juan@email.com","626666666"));
        
        LocalDate hoy= LocalDate.now(); //OBTENEMOS LA FECHA DE HOY CON EL MÉTODO now()
        
	//PRESTAMOS "NORMALES" REALIZADOS HOY Y QUE SE HAN DE DEVOLVER EN 15 DÍAS
	prestamos.add(new Prestamo(libros.get(0),usuarios.get(0), hoy,hoy.plusDays(15)));
        prestamos.add(new Prestamo(libros.get(1),usuarios.get(0), hoy,hoy.plusDays(15)));
        prestamos.add(new Prestamo(libros.get(5),usuarios.get(0), hoy,hoy.plusDays(15)));
        prestamos.add(new Prestamo(libros.get(6),usuarios.get(4), hoy,hoy.plusDays(15)));
        prestamos.add(new Prestamo(libros.get(6),usuarios.get(1), hoy,hoy.plusDays(15)));
	//PRESTAMOS QUE YA TENIAN QUE HABER SIDO DEVUELTOS PORQUE SU FECHA DE DEVOLUCIÓN ES ANTERIOR A HOY
        prestamos.add(new Prestamo(libros.get(5),usuarios.get(1), hoy.minusDays(17),hoy.minusDays(2)));
        prestamos.add(new Prestamo(libros.get(1),usuarios.get(4), hoy.minusDays(18),hoy.minusDays(3)));
        prestamos.add(new Prestamo(libros.get(2),usuarios.get(4), hoy.minusDays(20),hoy.minusDays(5)));
        prestamos.add(new Prestamo(libros.get(3),usuarios.get(4), hoy.minusDays(20),hoy.minusDays(5)));
        
        //PRESTAMOS HISTORICOS QUE YA HAN SIDO DEVUELTOS Y POR TANTO ESTÁN EN LA COLECCION prestamosHist
	prestamosHistorico.add(new Prestamo(libros.get(0),usuarios.get(0), hoy.minusDays(20),hoy.minusDays(5)));
        prestamosHistorico.add(new Prestamo(libros.get(2),usuarios.get(0), hoy.minusDays(20),hoy.minusDays(5)));
        prestamosHistorico.add(new Prestamo(libros.get(7),usuarios.get(4), hoy.minusDays(20),hoy.minusDays(5)));
        prestamosHistorico.add(new Prestamo(libros.get(5),usuarios.get(4), hoy.minusDays(20),hoy.minusDays(5)));
        prestamosHistorico.add(new Prestamo(libros.get(1),usuarios.get(1), hoy.minusDays(20),hoy.minusDays(5)));
        prestamosHistorico.add(new Prestamo(libros.get(7),usuarios.get(2), hoy.minusDays(15),hoy));
        prestamosHistorico.add(new Prestamo(libros.get(6),usuarios.get(3), hoy.minusDays(15),hoy));
}
    public static void menu(){
        int opcion=0;
        do{
            System.out.println("\n\n\n\n\n\t\t\t\tBIBLIOTECA\n");
            System.out.println("\t\t\t\t1 - LIBROS");
            System.out.println("\t\t\t\t2 - USUARIOS");
            System.out.println("\t\t\t\t3 - PRESTAMOS");
            System.out.println("\t\t\t\t4 - LISTADOS");
            System.out.println("\t\t\t\t9 - SALIR");
            opcion=sc.nextInt();
            switch (opcion){
                case 1:{
                    menuLibros();
                    break;
                }    
                case 2:{
                    menuUsuarios();
                    break;
                } 
                case 3:{
                    menuPrestamos();
                    break;
                } 
                case 4:{
                    menuListados();
                    break;
                } 
            }
        }while (opcion != 9);
    }
    private static void menuLibros() {
        int opcion=0;
        do{
            System.out.println("\n\n\n\n\n\t\t\t\tLIBROS\n");
            System.out.println("\t\t\t\t1 - NUEVO LIBRO");
            System.out.println("\t\t\t\t2 - ELIMINAR LIBRO");
            System.out.println("\t\t\t\t3 - MODIFICAR LIBRO");
            System.out.println("\t\t\t\t4 - LISTADO GENERAL DE LIBROS");
            System.out.println("\t\t\t\t9 - SALIR");
            opcion=sc.nextInt();
            switch (opcion){
                case 1:{
                    nuevoLibro();
                    break;
                }    
                case 2:{
                    eliminarLibro();
                    break;
                } 
                case 3:{
                    modificarLibros();
                    break;
                } 
                case 4:{
                    listaLibros();
                    break;
                } 
                
            }
        }while (opcion != 9);
    }
    private static void menuUsuarios() {
        int opcion=0;
        do{
            System.out.println("\n\n\n\n\n\t\t\t\tUSUARIOS");
            System.out.println("\t\t\t\t1 - NUEVO USUARIO");
            System.out.println("\t\t\t\t2 - ELIMINAR USUARIO");
            System.out.println("\t\t\t\t3 - MODIFICAR USUARIO");
            System.out.println("\t\t\t\t4 - LISTADO GENERAL DE USUARIOS");
            System.out.println("\t\t\t\t9 - SALIR");
            opcion=sc.nextInt();
            switch (opcion){
                case 1:{
                    nuevoUsuario();
                    break;
                }    
                case 2:{
                    eliminarUsuario();
                    break;
                } 
                case 3:{
                    modificarUsuario();
                    break;
                } 
                case 4:{
                    listaUsuarios();
                    break;
                } 
            }
        }while (opcion != 9);
    }
    private static void menuPrestamos() {
        int opcion=0;
        do{
            System.out.println("\n\n\n\n\n\t\t\t\tPRESTAMOS\n");
            System.out.println("\t\t\t\t1 - NUEVO PRESTAMO");
            System.out.println("\t\t\t\t2 - DEVOLUCION PRESTAMO");
            System.out.println("\t\t\t\t3 - PRORROGAR PRESTAMO");
            System.out.println("\t\t\t\t4 - LISTADO GENERAL DE PRESTAMOS");
            System.out.println("\t\t\t\t9 - SALIR");
            opcion=sc.nextInt();
            switch (opcion){
                case 1:{
                    nuevoPrestamo();
                    break;
                }    
                case 2:{
                    devolucion();
                    break;
                } 
                case 3:{
                    prorroga();
                    break;
                } 
                case 4:{
                    listaPrestamos();
                    break;
                } 
            }
        }while (opcion != 9);
    }
    private static void menuListados() {
        int opcion=0;
        do{
            System.out.println("\n\n\n\n\n\t\t\t\tLISTADOS\n");
            System.out.println("\t\t\t\t1 - LISTADO 1");
            System.out.println("\t\t\t\t2 - LISTADO 2");
            System.out.println("\t\t\t\t3 - LISTADO 3");
            System.out.println("\t\t\t\t4 - LISTADO 4");
            System.out.println("\t\t\t\t5 - LISTADO 5");
            System.out.println("\t\t\t\t6 - LISTADO 6");
            System.out.println("\t\t\t\t7 - LISTADO 7");
            System.out.println("\t\t\t\t8 - LISTADO 8");
            System.out.println("\t\t\t\t9 - LISTADO 9");
            System.out.println("\t\t\t\t10 - SALIR");
            opcion=sc.nextInt();
            switch (opcion){
                case 1:{
                    listaPrestamosUsuario();
                    break;
                } 
                case 2:{
                    listaPrestamosLibro();
                    break;
                } 
                case 3:{
                    libroMasLeido();
                    break;
                } 
                case 4:{
                    usuarioMasLector();
                    break;
                } 
                case 5:{
                    librosPrestadosActualmente();
                    break;
                }
                case 6:{
                    librosNuncaPrestados();
                    break;
                }
                case 7:{
                    fueraPlazo();
                    break;
                }
                case 8:{
                    usuariosPrestamosActivos();
                    break;
                }
                case 9:{
                    prestadosNoviembre();
                    break;
                }
            }
        }while (opcion != 10);
    }
    private static void nuevoLibro () {
        System.out.println("Dame el titulo del libro");
        String titulo= sc.next();
        System.out.println("Dame el isbn");
        String isbn=sc.next();
        System.out.println("Dame el autor");
        String autor=sc.next();
        System.out.println("Dame el genero");
        String genero=sc.next();
        libros.add(new Libro(isbn, titulo, autor, genero, 1));
    }
    private static int buscarLibro(String isbn) {
        int posicion = -1;
        int i = 0;
        for (Libro l : libros) {
            if (l.getIsbn().equalsIgnoreCase(isbn)) {
                posicion = i;
                break;
            }
            i++;
        }
        return posicion;
    }
    private static int buscarUsuario (String dni){
        int posicion = -1;
        int i = 0;
        for (Usuario u : usuarios) {
            if (u.getDni().equalsIgnoreCase(dni)) {
                posicion = i;
                break;
            }
            i++;
        }
        return posicion;
    }
    private static int buscaPrestamo(String dni, String isbn){
        int pos=-1;
        for (int i = 0; i < prestamos.size(); i++) {
            if (prestamos.get(i).getUsuarioPrestado().getDni().equals(dni) && prestamos.get(i).getLibroPrestado().getIsbn().equals(isbn)){   
                pos=i;
                break;
            }
        }
        return pos;       
    }
    private static void eliminarLibro(){
        /*ArrayList<Libro> librosBorrar=new ArrayList();
        System.out.println("Dime el titulo del libro que quieres eliminar");
        String eliminar = sc.next();
        for (Libro l : libros) {
            if (l.getTitulo().equalsIgnoreCase(eliminar)) {
                librosBorrar.add(l);
            }
        }
        libros.removeAll(librosBorrar);*/
        System.out.println("Dame el isbn del libro que quieras borrar");
        String isbn = sc.next();
        int p=buscarLibro(isbn);
        if (p == -1) {
            System.out.println("No se ha encontrado ningún libro con ese isbn");
        } else {
            libros.remove(p);
            System.out.println("El libro ha sido eliminado correctamente");
        }
    }
    private static void listaLibros(){
        for (Libro l : libros) {
            System.out.println(l.getIsbn() + "-" + l.getTitulo() + "-" + l.getAutor() + "-" + l.getGenero() + "-" + l.getEjemplares());
        }
    }
    private static void modificarLibros(){
        System.out.println("Dame el isbn del libro que quieras modificar");
        String isbn = sc.next();
        int p = buscarLibro(isbn);
        if (p == -1) {
            System.out.println("No se ha encontrado ningún libro con ese isbn");
        } else {
            System.out.println("Dame el isbn nuevo");
            isbn = sc.next();
            System.out.println("Dame el nuevo titulo");
            String titulo = sc.next();
            System.out.println("Dame el nuevo autor");
            String autor = sc.next();
            System.out.println("Dame el nuevo genero");
            String genero= sc.next();
            System.out.println("Dime el nº de ejemplares");
            int ejemplares = sc.nextInt();
            
            libros.get(p).setIsbn(isbn);
            libros.get(p).setTitulo(titulo);
            libros.get(p).setAutor(autor);
            libros.get(p).setGenero(genero);
            libros.get(p).setEjemplares(ejemplares);
        }
    }
    private static void nuevoUsuario(){
        System.out.println("Ingrese su nombre");
        String nombre=sc.next();
        System.out.println("Ingrese su dni");
        String dni=sc.next();
        System.out.println("Ingrese su nº de telefono");
        String telefono=sc.next();
        System.out.println("Ingrese su email");
        String email=sc.next();
        usuarios.add(new Usuario(dni,nombre,email,telefono));
    }
    private static void eliminarUsuario() {
        System.out.println("Dame el dni del usuario que quieras borrar");
        String dni = sc.next();
        int p=buscarUsuario(dni);
        if (p == -1) {
            System.out.println("No se ha encontrado ningún usuario con ese dni");
        } else {
            usuarios.remove(p);
            System.out.println("El usuario ha sido eliminado correctamente");
        }
    }
    private static void modificarUsuario() {
        System.out.println("Dame el nombre del usuario que quieras modificar");
        String dni = sc.next();
        int p = buscarUsuario(dni);
        if (p == -1) {
            System.out.println("No se ha encontrado ningún usuario con ese dni");
        } else {
            System.out.println("Dame el nombre nuevo");
            String nombre = sc.next();
            System.out.println("Dame el nuevo email");
            String email = sc.next();
            System.out.println("Dame el nuevo telefono");
            String telefono = sc.next();
            
            usuarios.get(p).setNombre(nombre);
            usuarios.get(p).setEmail(email);
            usuarios.get(p).setTelefono(telefono);

        }

    }
    private static void listaUsuarios() {
        for (Usuario u:usuarios){
            System.out.println(u.getDni()+"-"+u.getNombre()+"-"+u.getEmail()+"-"+u.getTelefono());
        }
    }
    private static void nuevoPrestamo(){
        int posicionUsuario, posicionLibro;
        System.out.print("Teclea DNI del usuario:");
        String dni=sc.next();
        posicionUsuario=buscarUsuario(dni);
        if (posicionUsuario==-1){
            System.out.println("El dni emitido "+dni+" no coincide con el de ningun usuario de la biblioteca");
        }else{
            System.out.print("Teclea ISBN libro:");
            String isbn=sc.next();
            try {
               posicionLibro=stockLibro(isbn);
               LocalDate hoy=LocalDate.now();
               prestamos.add(new Prestamo(libros.get(posicionLibro),usuarios.get(posicionUsuario),hoy,hoy.plusDays(15)));
               libros.get(posicionUsuario).setEjemplares(libros.get(posicionUsuario).getEjemplares()-1);
            } catch (LibroNoExiste e) {
                System.out.println(e.getMessage());
            }catch (LibroNoDisponible e){
                System.out.println(e.getMessage());              
            }
        }
    }
    private static void devolucion (){
        System.out.print("DNI usuario: ");
        String dni=sc.next();
        System.out.print("ISBN Libro: ");
        String isbn=sc.next();
        int posicionPrestamo=buscaPrestamo(dni,isbn);
        if (posicionPrestamo==-1){
            System.out.println("No hay ningun préstamo con esos datos");
        }else{
            prestamos.get(posicionPrestamo).setFechaDevolucion(LocalDate.now());
            libros.get(buscarLibro(isbn)).setEjemplares(libros.get(buscarLibro(isbn)).getEjemplares()+1);
            prestamosHistorico.add(prestamos.get(posicionPrestamo));
            prestamos.remove(posicionPrestamo);
        }
    }
    private static void prorroga(){
        System.out.print("DNI usuario: ");
        String dni=sc.next();
        System.out.print("ISBN Libro: ");
        String isbn=sc.next();
        int posicionPrestamo=buscaPrestamo(dni, isbn);
        if (posicionPrestamo==-1){
            System.out.println("No hay ningun préstamo con esos datos");
        }else{
            prestamos.get(posicionPrestamo).setFechaDevolucion(prestamos.get(posicionPrestamo).getFechaDevolucion().plusDays(15));
            System.out.println("Se amplió el plazo del préstamo 15 días");
        }
    }
    private static void listaPrestamos() {
        for (Prestamo p:prestamos){
            System.out.println(p.getLibroPrestado()+"-"+p.getUsuarioPrestado()+"-"+p.getFechaPrestamo()+"-"+p.getFechaDevolucion());

        }
    }
    private static void listaPrestamosUsuario() {
        System.out.print("DNI usuario para consultar prestamos:");
        String dni=sc.next();
        int posicion=buscarUsuario(dni);
        if (posicion==-1) {
            System.out.println("Ese no DNI no existe en la biblioteca"); 
        }else{
            System.out.println("Prestamos activos de " + usuarios.get(posicion).getNombre());   
            int cuentaActivos=0;
            for (Prestamo p:prestamos) {
                if(p.getUsuarioPrestado().equals(usuarios.get(posicion))){
                    System.out.println(p);
                    cuentaActivos++;
                }
            }
            System.out.println(usuarios.get(posicion).getNombre() + " tiene " + cuentaActivos + " prestamos actualmente");
            System.out.println("\nPrestamos históricos de " + usuarios.get(posicion).getNombre());
            int cuentaHistoricos=0;
            for (Prestamo p : prestamosHistorico) {
                if(p.getUsuarioPrestado().getDni().equalsIgnoreCase(dni)){
                    System.out.println(p);
                    cuentaHistoricos++;
                }
            }
            System.out.println(usuarios.get(posicion).getNombre() + " tiene " + cuentaHistoricos + " prestamos historicos");
            int totales=cuentaActivos+cuentaHistoricos;
            System.out.println(usuarios.get(posicion).getNombre() + " tiene " + totales + " prestamos en total");
        }
    }
    private static void listaPrestamosLibro() {
        System.out.print("ISBN del libro para consultar prestamos:");
        String isbn=sc.next();
        int posicion=buscarLibro(isbn);
        if (posicion==-1) {
            System.out.println("Ese ISBN no existe en la biblioteca"); 
        }else{
            System.out.println("Prestamos activos de " + libros.get(posicion).getTitulo());   
            int cuentaActivos=0;
            for (Prestamo p:prestamos) {
                if(p.getLibroPrestado().equals(libros.get(posicion))){
                    System.out.println(p);
                    cuentaActivos++;
                }
            }
            System.out.println(libros.get(posicion).getTitulo()+ " tiene " + cuentaActivos + " prestamos actualmente");
            System.out.println("\nPrestamos históricos de " + libros.get(posicion).getTitulo());
            int cuentaHistoricos=0;
            for (Prestamo p : prestamosHistorico) {
                if(p.getLibroPrestado().getIsbn().equalsIgnoreCase(isbn)){
                    System.out.println(p);
                    cuentaHistoricos++;
                }
            }
            System.out.println(libros.get(posicion).getTitulo()+ " tiene " + cuentaHistoricos + " prestamos historicos");
            int totales=cuentaActivos+cuentaHistoricos;
            System.out.println(libros.get(posicion).getTitulo()+ " tiene " + totales + " prestamos en total");
        }
    }
    private static void libroMasLeido() {
        int maxPrestamos = -1;
        Libro libroMasLeido=null;
        for (Libro l : libros) {
            int contador = 0;
            for (Prestamo p : prestamos) {
                if (p.getLibroPrestado().getIsbn().equals(l.getIsbn())) {
                    contador++;
                }
            }
            for (Prestamo p : prestamosHistorico) {
                if (p.getLibroPrestado().getIsbn().equals(l.getIsbn())) {
                    contador++;
                }
            }
            if (contador > maxPrestamos) {
                maxPrestamos = contador;
                libroMasLeido = l;
            }
        }

        if (libroMasLeido != null) {
            System.out.println("El libro más leído es: " + libroMasLeido.getTitulo() +" con " + maxPrestamos + " préstamos.");
        }
    }
    private static void usuarioMasLector() {
        int maxPrestamos = -1;
        Usuario usuarioMasLector=null;
        for (Usuario u : usuarios) {
            int contador = 0;
            for (Prestamo p : prestamos) {
                if (p.getUsuarioPrestado().getDni().equals(u.getDni())) {
                    contador++;
                }
            }
            for (Prestamo p : prestamosHistorico) {
                if (p.getUsuarioPrestado().getDni().equals(u.getDni())) {
                    contador++;
                }
            }
            if (contador > maxPrestamos) {
                maxPrestamos = contador;
                usuarioMasLector = u;
            }
        }

        if (usuarioMasLector != null) {
            System.out.println("El usuario más lector es: " + usuarioMasLector.getNombre()+" con " + maxPrestamos + " libros leidos.");
        }
    }
    private static void librosPrestadosActualmente() {
        System.out.print("ISBN del libro para consultar prestamos:");
        String isbn=sc.next();
        int posicion=buscarLibro(isbn);
        if (posicion==-1) {
            System.out.println("Ese ISBN no existe en la biblioteca"); 
        }else{
            System.out.println("Prestamos activos de " + libros.get(posicion).getTitulo());   
            int cuentaActivos=0;
            for (Prestamo p:prestamos) {
                if(p.getLibroPrestado().equals(libros.get(posicion))){
                    System.out.println(p);
                    cuentaActivos++;
                }
            }
            System.out.println(libros.get(posicion).getTitulo()+ " tiene " + cuentaActivos + " prestamos actualmente");
        }
    }
    private static void librosNuncaPrestados() {
        ArrayList <Prestamo> prestamosExistentes=new ArrayList();
        for (Prestamo p:prestamos) {
            prestamosExistentes.add(p);
        }
        for (Prestamo p : prestamosHistorico) {
            prestamosExistentes.add(p);
        }
        for (Libro l: libros){
            boolean prestado=false;
            for (Prestamo p: prestamosExistentes){
                if (l.getIsbn().equals(p.getLibroPrestado().getIsbn())) {
                    prestado=true;
                }
            }
            if (prestado==false) {
                System.out.println("Los libros que nunca han sido prestados son: "+l);

            }
        }
    }
    private static void usuariosPrestamosActivos() {
        for (Usuario u : usuarios) {
            boolean prestado=false;
            int cuentaActivos=0;
            for (Prestamo p : prestamos) {
                if (p.getUsuarioPrestado().getDni().equals(u.getDni())) {
                   prestado=true; 
                   cuentaActivos++;
                }
            }
            if (prestado==true) {
                System.out.println("Los usuarios con al menos 1 libro prestado son: "+u+" con "+cuentaActivos+" prestamos");
            }
        }    
    }
    private static void fueraPlazo() {
        LocalDate hoy= LocalDate.now();
        for (Usuario u : usuarios) {
            boolean fueraPlazo=false;
            for (Prestamo p : prestamos) {
                if (p.getUsuarioPrestado().equals(u) && p.getFechaDevolucion().isBefore(hoy)) {
                   fueraPlazo=true; 
                }
            }
            if (fueraPlazo==true) {
                System.out.println("Los usuarios con un prestamo fuera de plazo son: "+u);
            }
        }    
    }
    private static void prestadosNoviembre() {
        System.out.println("Los libros prestados en Noviembre son los siguientes");
        for (Prestamo p:prestamos){
            if (p.getFechaPrestamo().getMonthValue()==11) {
                System.out.println(p);
            }
        }
        for (Prestamo p:prestamosHistorico){
            if (p.getFechaPrestamo().getMonthValue()==11) {
                System.out.println(p);
            }
        }
    }
    private static int stockLibro(String isbn)throws LibroNoExiste,LibroNoDisponible{
        int posicion=buscarLibro(isbn);
        if (posicion==-1) {
            throw new LibroNoExiste("El libro con la referencia "+isbn+" no se encuentra en esta biblioteca");
            }else{
            if (libros.get(posicion).getEjemplares()==0) {
                String cadena=("No hay stock disponible de "+libros.get(posicion).getTitulo()+"\nPrestamos del libro pendientes de devolucion");
                for (Prestamo p : prestamos) {
                    if (p.getLibroPrestado().getIsbn().equals(isbn)) {
                        cadena=cadena+"\n"+p.getFechaDevolucion();
                    }
                }
                throw new LibroNoDisponible(cadena);
            }
        }
        return posicion;
    }
    
}