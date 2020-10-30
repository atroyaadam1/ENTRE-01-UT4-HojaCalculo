
/**
 *  Clase con código para probar el resto de clases
 * 
 * @author - Anthonny Troya
 *  
 */
public class TestHojaCalculo
{

    /**
     * Constructor  
     */
    public TestHojaCalculo()    {

    }

    /**
     * Define y crea todos los objetos necesarios para obtener
     * en pantalla la hoja de cálculo indicada en la figura 1
     * incluyendo la hoja duplicada
     * La fila4 que no se podrá guardar puedes crearla con el primer constructor  
     * de fila  
     */
    public void test1() {

        HojaCalculo hoja = new HojaCalculo("HOJA1");
        hoja.addFila("Fila1",new Fecha(4,10,2020), 25.50, 132);
        hoja.addFila("Fila2",new Fecha(5,10,2020), 300 , 350);
        hoja.addFila(new Fila("Fila3"));
        hoja.addFila(new Fila("Fila4"));
        System.out.println(hoja.toString());
        System.out.println(hoja.duplicarHoja());

    }
    /**
     * Define y crea todos los objetos necesarios para obtener
     * en pantalla la hoja de cálculo indicada en la figura 2 
     * incluyendo la hoja duplicada
     *  
     */
    public void test2() {

        HojaCalculo hoja = new HojaCalculo("HOJA2");
        hoja.addFila("Fila1",new Fecha(7,10,2020), 260, 125);
        hoja.addFila("Fila2",new Fecha(8,10,2020), 125 , 245);
        System.out.println(hoja.toString());
        System.out.println(hoja.duplicarHoja());
    }

    /**
     * Define y crea todos los objetos necesarios para obtener
     * en pantalla la hoja de cálculo indicada en la figura 3
     * incluyendo la hoja duplicada
     *  
     */
    public void test3() {
        HojaCalculo hoja = new HojaCalculo("HOJA3");
        hoja.addFila("Fila1",new Fecha(8,10,2020), 670, 234);
        System.out.println(hoja.toString());
        System.out.println(hoja.duplicarHoja());

    }

}
