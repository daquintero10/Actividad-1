
public class Producto {
	/**
     * Indica el codigo del producto.
     */
	private int codigo;
	
	/**
     * Indica el nombre del producto.
     */
	private String nombre;
	
	/**
     * Indica el tipo de producto.
     */
	private String tipo;
	
	/**
     * Indica la fecha de expedición del producto.
     */
	private Fecha fechaExp;
	
	/**
     * Indica el nombre del fabricante.
     */
	private String nombreFrabic;
	
	/**
     * Indica la cantidad del producto en inventario.
     */
	private int cantidadInvent;
	
	/**
     * Indica el precio del producto.
     */
	private double precio;

	/**
	 * ============ METODOS ============
	 */
	
	
	/**
     * Retorna el codigo del producto.
     * @return el codigo del producto.
     */
    public int darCodigo( )
    {
        return codigo;
    }
    
    /**
     * Retorna el nombre del producto.
     * @return el nombre del producto.
     */
    public String darNombre( )
    {
        return nombre;
    }
    
    /**
     * Retorna el tipo de producto.
     * @return el tipo de producto.
     */
    public String darTipo( )
    {
        return tipo;
    }
    
    /**
     * Retorna la fecha de expedición del producto.
     * @return la fecha de expedición del producto.
     */
    public Fecha darFechaExp( )
    {
        return fechaExp;
    }
    
    /**
     * Retorna el nombre del fabricante.
     * @return el nombre del fabricante.
     */
    public String darNombreFabric( )
    {
        return nombreFrabic;
    }
    
    /**
     * Retorna la cantidad del producto en inventario.
     * @return la cantidad del producto en inventario.
     */
    public int darCantidadInvent( )
    {
        return cantidadInvent;
    }
    
    /**
     * Retorna el precio del producto.
     * @return el precio del producto.
     */
    public double darPrecio( )
    {
        return precio;
    }


}
