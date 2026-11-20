public abstract class CreadorFactura {
    protected abstract GeneradorFactura instanciarGenerador();

    public GeneradorFactura crearGeneradorValidado(double subtotal) {
        GeneradorFactura generador = instanciarGenerador();
        if (!generador.validarImporte(subtotal)) {
            System.out.println("Importe inválido para el formato seleccionado: $" + subtotal);
            return null;
        }
        return generador;
    }

    public void procesarFactura(String numero, double subtotal) {
        GeneradorFactura generador = crearGeneradorValidado(subtotal);
        if (generador != null) {
            generador.generar(numero, subtotal);
        }
    }
}