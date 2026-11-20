public class Main {
    public static void main(String[] args) {
        CreadorFactura creadorPDF = new CreadorFacturaPDF();
        creadorPDF.procesarFactura("FAC-001", 10000.0);

        CreadorFactura creadorTicket = new CreadorFacturaTicket();
        creadorTicket.procesarFactura("TCK-002", 2500.0);

        CreadorFactura creadorInvalido = new CreadorFacturaPDF();
        creadorInvalido.procesarFactura("FAC-003", -100.0);
    }
}