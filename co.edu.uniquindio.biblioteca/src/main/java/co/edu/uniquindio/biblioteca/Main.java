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

        System.out.println(libro4.getNombre());
        updateTitle(libro4);
        System.out.println(libro4.getNombre()+"\n");

        int numTerror = countTerror(libro1, libro2, libro3, libro4, libro5);
        System.out.println("La cantidad de libros con genero terror es de "+numTerror+"\n");

        System.out.println(libro4.getNumeroPaginas());
        updateNumeroPaginas(libro4);
        System.out.println(libro4.getNumeroPaginas()+"\n");

        System.out.println("Lista de Libros:\n"+listLibro(libro1, libro2, libro3, libro4, libro5));
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

    public static  int  countTerror(Libro libro1, Libro libro2, Libro libro3, Libro libro4, Libro libro5){
        int numTerror = 0;
        if (libro1.getGenero()=="Terror"){
            numTerror+=1;
        }
        if (libro2.getGenero()=="Terror") {
            numTerror+=1;
        }
        if (libro3.getGenero()=="Terror"){
            numTerror+=1;
        }
        if (libro4.getGenero()=="Terror") {
            numTerror+=1;
        }
        if (libro5.getGenero()=="Terror") {
            numTerror+=1;
        }
        return numTerror;
    }
    public static  void  updateTitle(Libro libro4){
        libro4.setNombre("Calculo 2");
    }

    public static  void  updateNumeroPaginas(Libro libro4){
        libro4.setNumeroPaginas(1125);
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