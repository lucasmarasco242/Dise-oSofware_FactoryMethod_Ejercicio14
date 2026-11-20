public class CreadorFacturaPDF extends CreadorFactura {
    protected GeneradorFactura instanciarGenerador() {
        return new FacturaEstandarPDF();
    }
}