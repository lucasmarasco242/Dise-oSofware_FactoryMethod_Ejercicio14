public class CreadorFacturaTicket extends CreadorFactura {
    protected GeneradorFactura instanciarGenerador() {
        return new TicketSimplificado();
    }
}