
/**
 *  Un objeto de esta clase representa a una sencilla
 *  hoja de cálculo. La hoja tiene hasta un máximo de 3 filas (no más)
 *  En cada fila la empresa "apunta" los ingresos y gastos en 
 *  una determinada fecha
 * 
 * @author - Anthonny Troya Arevalo
 *  
 */
public class HojaCalculo
{
    private String nombre;
    private Fila fila1;
    private Fila fila2;
    private Fila fila3;

    /**
     * Constructor  
     * Crea la hoja de cálculo con el nombre indicado 
     * e inicializa las filas al valor null (inicialmente
     * la hoja se crea sin filas)
     */
    public HojaCalculo(String nombre)    {
        this.nombre = nombre;
        this.fila1 = null;
        this.fila2 = null;
        this.fila3 = null;

    }

    /**
     * accesor para el nombre de la hoja
     */
    public String getNombre() {
        return this.nombre;

    }

    /**
     * accesor para la fila1
     */
    public Fila getFila1() {
        return fila1;

    }

    /**
     * accesor para la fila2
     */
    public Fila getFila2() {
        return fila2;

    }

    /**
     * accesor para la fila3
     */
    public Fila getFila3() {
        return fila3;

    }

    /**
     * Devuelve el nº de filas de la hoja
     * (dependerá de cuántas filas estén a null)
     */
    public int getNumeroFilas() {
        int contador = 0;

        if (fila1 != null){
            contador++;
        }
        if (fila2 != null){
            contador++;
        }  if (fila3 != null){
            contador++;
        }
        return contador;

    }

    /**
     * Devuelve true si la hoja está completa
     * (tiene exactamente 3 filas)
     */
    public boolean hojaCompleta() {
        if (getNumeroFilas() == 3) {
            return true;

        }   else {
            return false;
        }

    }

    /**
     * Se añade una nueva fila a la hoja
     * Si la hoja está completa se muestra el mensaje "FilaX no se puede añadir en HOJAX"
     * Si no está completa se añade la fila a la hoja teniendo en cuenta
     * si se añade como primera, segunda o tercera fila (no han de quedar huecos)
     */
    public void addFila(Fila fila) {
        if (hojaCompleta()) {
            System.out.println(fila.getId() + " no se puede añadir en " + this.nombre);
        }

        if (getNumeroFilas() == 2) {
            fila3 = fila;
        }
        if (getNumeroFilas() == 1) {
            fila2 = fila;
        }
        if (getNumeroFilas() == 0) {
            fila1 = fila;
        }
    }

    /**
     * Dada la información a guardar en una fila el método
     * crea la fila y la añade a la hoja
     * (evita repetir código)
     */
    public void addFila(String id, Fecha fecha, double ingresos, double gastos) {
        addFila(new Fila(id, fecha, ingresos, gastos));
    }

    /**
     * Calcula y devuelve el total de ingresos entre
     * todas las filas que incluye la hoja
     */
    public double getTotalIngresos() {
        double totalIngresos = 0;
        switch (this.getNumeroFilas()) {
            case 3: totalIngresos += fila3.getIngresos();
            case 2: totalIngresos+= fila2.getIngresos();
            case 1: totalIngresos += fila1.getIngresos(); 
            break;
        }
        return totalIngresos;
    }

    /**
     * Calcula y devuelve el total de gastos
     * entre todas las filas que incluye la hoja
     */
    public double getTotalGastos() {
        int totalGastos = 0;
        switch (this.getNumeroFilas()) {
            case 3: totalGastos += fila3.getGastos();
            case 2: totalGastos += fila2.getGastos();
            case 1: totalGastos += fila1.getGastos(); 
            break;
        } return totalGastos;
    }

    /**
     * Calcula y devuelve el total del beneficio
     * entre todas las filas que incluye la hoja
     */
    public double getBeneficio() {
        double total = 0;
        switch (this.getNumeroFilas()) {
            case 3: total += fila3.getBeneficio();
            case 2: total += fila2.getBeneficio();
            case 1: total += fila1.getBeneficio(); 
            break;
        }
        return total;

    }

    /**
     * Representación textual de la hoja
     * con el formato exacto que indica el enunciado
     */
    public String toString() {

        String str = String.format("%s \n%8s%15s%15s%15s%15s", this.nombre, "", "FECHA",
                "INGRESOS", "GASTOS", "BENEFICIO");
        String varFila1 = "";
        String varFila2 = "";
        String varFila3 = "";

        switch (getNumeroFilas()) {
            case 3: varFila3 += "\n" + this.fila3.toString();
            case 2: varFila2 += "\n" + this.fila2.toString();
            case 1: varFila1 += "\n" + this.fila1.toString(); 
            break;
        }
        str += varFila1 + varFila2 + varFila3;
        str += "\n---------------------------------------------------------------------------";
        str += "\n" + String.format("%23s%14.2f€%14.2f€%14.2f€", "", this.getTotalIngresos(),
            this.getTotalGastos(), this.getBeneficio());
        return str;

    }

    /**
     * Devuelve un duplicado de la hoja actual.
     * El nombre de la hoja duplicada será "Duplicada HojaX"
     * Al duplicar la hoja se duplicarán también las filas que contenga
     */
    public HojaCalculo duplicarHoja() {

        HojaCalculo hojaDuplicada = new HojaCalculo("Duplicada " + this.getNombre());
        hojaDuplicada.addFila(this.fila1);
        hojaDuplicada.addFila(this.fila2);
        hojaDuplicada.addFila(this.fila3);
        return hojaDuplicada;
    }

}
