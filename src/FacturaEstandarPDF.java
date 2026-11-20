public class FacturaEstandarPDF implements GeneradorFactura {
    public boolean validarImporte(double subtotal) {
        return subtotal > 0;
    }

    public void generar(String numero, double subtotal) {
        double impuesto = subtotal * 0.21;
        double total = subtotal + impuesto;
        System.out.println("=== FACTURA PDF [" + numero + "] ===");
        System.out.println("Subtotal: $" + subtotal + " | IVA (21%): $" + impuesto + " | Total: $" + total);
    }
}