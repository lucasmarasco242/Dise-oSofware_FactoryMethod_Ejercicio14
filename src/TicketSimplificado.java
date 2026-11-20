public class TicketSimplificado implements GeneradorFactura {
    public boolean validarImporte(double subtotal) {
        return subtotal > 0 && subtotal <= 50000.0;
    }

    public void generar(String numero, double subtotal) {
        double impuesto = subtotal * 0.10;
        double total = subtotal + impuesto;
        System.out.println("--- TICKET [" + numero + "] ---");
        System.out.println("Subtotal: $" + subtotal + " | Impuesto: $" + impuesto + " | Total: $" + total);
    }
}