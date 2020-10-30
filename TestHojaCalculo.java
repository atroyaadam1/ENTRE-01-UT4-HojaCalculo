
/**
 *  Clase con código para probar el resto de clases
 * 
 * @author - Anthonny Troya Arevalo
 *  
 */
public class TestHojaCalculo
{
    Fila fila4;
    /**
     * Constructor  
     */
    public TestHojaCalculo()    {
        fila4 = new Fila("Fila4");
    }

    /**
     * Define y crea todos los objetos necesarios para obtener
     * en pantalla la hoja de cálculo indicada en la figura 1
     * incluyendo la hoja duplicada
     * La fila4 que no se podrá guardar puedes crearla con el primer constructor  
     * de fila  
     */
    public void test1() {
       HojaCalculo hoja1 = new HojaCalculo("HOJA1");
       hoja1.addFila("Fila1", new Fecha(4, 10, 2020), 25.5, 132);
       hoja1.addFila("Fila2", new Fecha(5, 10, 2020), 300, 350);
       hoja1.addFila(new Fila("Fila3"));
       hoja1.addFila(fila4);
       HojaCalculo hojaDuplicada1 = hoja1.duplicarHoja();
       System.out.println(hoja1.toString());
       System.out.println(hojaDuplicada1.toString());
    }

    /**
     * Define y crea todos los objetos necesarios para obtener
     * en pantalla la hoja de cálculo indicada en la figura 2 
     * incluyendo la hoja duplicada
     *  
     */
    public void test2() {
       HojaCalculo hoja2 = new HojaCalculo("HOJA2");
       hoja2.addFila("Fila1", new Fecha(7, 10, 2020), 260, 125);
       hoja2.addFila("Fila2", new Fecha(8, 10, 2020), 125, 245);
       HojaCalculo hojaDuplicada = hoja2.duplicarHoja();
       System.out.println(hoja2.toString());
       System.out.println(hojaDuplicada.toString());
    }

    /**
     * Define y crea todos los objetos necesarios para obtener
     * en pantalla la hoja de cálculo indicada en la figura 3
     * incluyendo la hoja duplicada
     *  
     */
    public void test3() {
       HojaCalculo hoja3 = new HojaCalculo("HOJA3");
       hoja3.addFila("Fila1", new Fecha(8, 10, 2020), 670, 234);
       HojaCalculo hojaDuplicada = hoja3.duplicarHoja();
       System.out.println(hoja3.toString());
       System.out.println(hojaDuplicada.toString());
            

    }

}