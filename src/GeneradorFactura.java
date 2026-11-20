public interface GeneradorFactura {
    boolean validarImporte(double subtotal);
    void generar(String numero, double subtotal);
}