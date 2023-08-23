package co.edu.uniquindio.biblioteca;
import co.edu.uniquindio.biblioteca.model.Libro;
public class Main {

    public static void main(String[] args) {
        //Crecion de las instancias de los libros
        Libro libro1 = new Libro();
        Libro libro2 = new Libro();
        Libro libro3 = new Libro();
        Libro libro4 = new Libro();
        Libro libro5 = new Libro();

        setLibros(libro1, libro2, libro3, libro4, libro5);

        System.out.println(listNombres(libro1, libro2, libro3, libro4, libro5));
        updateTitle(libro1, libro2, libro3, libro4, libro5);
        System.out.println(listNombres(libro1, libro2, libro3, libro4, libro5));

        int numTerror = countTerror(libro1, libro2, libro3, libro4, libro5);
        System.out.println("La cantidad de libros con genero terror es de "+numTerror+"\n");

        System.out.println(listNumeroPaginas(libro1, libro2, libro3, libro4, libro5));
        updateNumeroPaginas(libro1, libro2, libro3, libro4, libro5);
        System.out.println(listNumeroPaginas(libro1, libro2, libro3, libro4, libro5));

        System.out.println("Lista de Libros:\n"+listLibro(libro1, libro2, libro3, libro4, libro5));
        
        System.out.println("La cantidad de libros que comienzan por vocal son "+countVocal(libro1, libro2, libro3, libro4, libro5)+"\nLa cantidad de libros que comienzan por consonante son "+(5-countVocal(libro1, libro2, libro3, libro4, libro5)));
    }
    public static void setLibros(Libro libro1, Libro libro2, Libro libro3, Libro libro4, Libro libro5) {

        libro1.setNombre("El principito");
        libro1.setGenero("Infantil");
        libro1.setAutor("Valentina Fuentes");
        libro1.setAnioPublicacion(1995);
        libro1.setEditorial("Prey");
        libro1.setNumeroPaginas(500);

        libro2.setNombre("El mas alla");
        libro2.setGenero("Terror");
        libro2.setAutor("Leonardo Marin");
        libro2.setAnioPublicacion(2009);
        libro2.setEditorial("Clastle Down");
        libro2.setNumeroPaginas(700);

        libro3.setNombre("Exilio");
        libro3.setGenero("Drama");
        libro3.setAutor("Estefania E");
        libro3.setAnioPublicacion(2014);
        libro3.setEditorial("Prey");
        libro3.setNumeroPaginas(655);

        libro4.setNombre("Calculo 5");
        libro4.setGenero("Academico");
        libro4.setAutor("Pitagoras B");
        libro4.setAnioPublicacion(2000);
        libro4.setEditorial("MatematicasP");
        libro4.setNumeroPaginas(1100);

        libro5.setNombre("Buscando a nemo");
        libro5.setGenero("Infantil");
        libro5.setAutor("Pitgraf");
        libro5.setAnioPublicacion(2010);
        libro5.setEditorial("Disney");
        libro5.setNumeroPaginas(120);
    }
    public static char extraerPrimerCaracter(String cadena){
        String lowerCase = cadena.toLowerCase();
        return lowerCase.charAt(0);
    }
    public static int countVocal(Libro libro1, Libro libro2, Libro libro3, Libro libro4, Libro libro5){
        int vocal = 0;
        char caracterLibro1 = extraerPrimerCaracter(libro1.getNombre());
        if (caracterLibro1=='a'||caracterLibro1=='e'||caracterLibro1=='i'||caracterLibro1=='o'||caracterLibro1=='u'){
            vocal+=1;
        }
        char caracterLibro2 = extraerPrimerCaracter(libro2.getNombre());
        if (caracterLibro2=='a'||caracterLibro2=='e'||caracterLibro2=='i'||caracterLibro2=='o'||caracterLibro2=='u'){
            vocal+=1;
        }
        char caracterLibro3 = extraerPrimerCaracter(libro3.getNombre());
        if (caracterLibro3=='a'||caracterLibro3=='e'||caracterLibro3=='i'||caracterLibro3=='o'||caracterLibro3=='u'){
            vocal+=1;
        }
        char caracterLibro4 = extraerPrimerCaracter(libro4.getNombre());
        if (caracterLibro4=='a'||caracterLibro4=='e'||caracterLibro4=='i'||caracterLibro4=='o'||caracterLibro4=='u'){
            vocal+=1;
        }
        char caracterLibro5 = extraerPrimerCaracter(libro5.getNombre());
        if (caracterLibro5=='a'||caracterLibro5=='e'||caracterLibro5=='i'||caracterLibro5=='o'||caracterLibro5=='u'){
            vocal+=1;
        }
        return vocal;
    }
    public static  String  listNombres(Libro libro1, Libro libro2, Libro libro3, Libro libro4, Libro libro5){
        String nombres = "";
        nombres += "\n\tNombres Libros: \n";
        nombres += libro1.getNombre()+"\n";
        nombres += libro2.getNombre()+"\n";
        nombres += libro3.getNombre()+"\n";
        nombres += libro4.getNombre()+"\n";
        nombres += libro5.getNombre()+"\n";
        return nombres;
    }
    public static  String  listNumeroPaginas(Libro libro1, Libro libro2, Libro libro3, Libro libro4, Libro libro5){
        String nombres = "";
        nombres += "\n\tNumero de Paginas Libros: \n";
        nombres += libro1.getNumeroPaginas()+"\n";
        nombres += libro2.getNumeroPaginas()+"\n";
        nombres += libro3.getNumeroPaginas()+"\n";
        nombres += libro4.getNumeroPaginas()+"\n";
        nombres += libro5.getNumeroPaginas()+"\n";
        return nombres;
    }
    public static  int  countTerror(Libro libro1, Libro libro2, Libro libro3, Libro libro4, Libro libro5){
        int numTerror = 0;
        if (libro1.getGenero().equalsIgnoreCase("Terror")){
            numTerror+=1;
        }
        if (libro2.getGenero().equalsIgnoreCase("Terror")) {
            numTerror+=1;
        }
        if (libro3.getGenero().equalsIgnoreCase("Terror")){
            numTerror+=1;
        }
        if (libro4.getGenero().equalsIgnoreCase("Terror")) {
            numTerror+=1;
        }
        if (libro5.getGenero().equalsIgnoreCase("Terror")) {
            numTerror+=1;
        }
        return numTerror;
    }
    public static  void  updateTitle(Libro libro1, Libro libro2, Libro libro3, Libro libro4, Libro libro5){
        if (libro1.getNombre().equalsIgnoreCase("calculo 5")){
            libro1.setNombre("Calculo 2");
        }
        if (libro2.getNombre().equalsIgnoreCase("calculo 5")) {
            libro2.setNombre("Calculo 2");
        }
        if (libro3.getNombre().equalsIgnoreCase("calculo 5")){
            libro3.setNombre("Calculo 2");
        }
        if (libro4.getNombre().equalsIgnoreCase("calculo 5")) {
            libro4.setNombre("Calculo 2");
        }
        if (libro5.getNombre().equalsIgnoreCase("calculo 5")) {
            libro5.setNombre("Calculo 2");
        }
    }
    public static  void  updateNumeroPaginas(Libro libro1, Libro libro2, Libro libro3, Libro libro4, Libro libro5) {
        if (libro1.getNumeroPaginas()==1100) {
            libro1.setNumeroPaginas(1125);
        }
        if (libro2.getNumeroPaginas()==1100) {
            libro2.setNumeroPaginas(1125);
        }
        if (libro3.getNumeroPaginas()==1100) {
            libro3.setNumeroPaginas(1125);
        }
        if (libro4.getNumeroPaginas()==1100) {
            libro4.setNumeroPaginas(1125);
        }
        if (libro5.getNumeroPaginas()==1100) {
            libro5.setNumeroPaginas(1125);
        }
    }
    public static  String  listLibro(Libro libro1, Libro libro2, Libro libro3, Libro libro4, Libro libro5){
        String listado = "";
        listado += "\n\tLibro Numero 1: \n\n"+libro1.getNombre()+"\n"+libro1.getGenero()+"\n"+libro1.getAutor()+"\n"+libro1.getEditorial()+"\n"+libro1.getAnioPublicacion()+"\n"+libro1.getNumeroPaginas()+"\n";
        listado += "\n\tLibro Numero 2: \n\n"+libro2.getNombre()+"\n"+libro2.getGenero()+"\n"+libro2.getAutor()+"\n"+libro2.getEditorial()+"\n"+libro2.getAnioPublicacion()+"\n"+libro2.getNumeroPaginas()+"\n";
        listado += "\n\tLibro Numero 3: \n\n"+libro3.getNombre()+"\n"+libro3.getGenero()+"\n"+libro3.getAutor()+"\n"+libro3.getEditorial()+"\n"+libro3.getAnioPublicacion()+"\n"+libro3.getNumeroPaginas()+"\n";
        listado += "\n\tLibro Numero 4: \n\n"+libro4.getNombre()+"\n"+libro4.getGenero()+"\n"+libro4.getAutor()+"\n"+libro4.getEditorial()+"\n"+libro4.getAnioPublicacion()+"\n"+libro4.getNumeroPaginas()+"\n";
        listado += "\n\tLibro Numero 5: \n\n"+libro5.getNombre()+"\n"+libro5.getGenero()+"\n"+libro5.getAutor()+"\n"+libro5.getEditorial()+"\n"+libro5.getAnioPublicacion()+"\n"+libro5.getNumeroPaginas()+"\n";
        return listado;
    }
}