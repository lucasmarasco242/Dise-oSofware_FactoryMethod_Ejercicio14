Ejercicio 14 - Fábrica de Generadores de Facturas Comerciales

Explicación del programa

En este ejercicio se implementó el patrón de diseño Factory Method para generar comprobantes comerciales en formato PDF y Ticket simplificado con validación previa de importes y cálculo de impuestos, sin utilizar librerías externas ni imports.
El programa cuenta con:
- Una interfaz GeneradorFactura con los métodos validarImporte(double subtotal) y generar(String numero, double subtotal).
- Dos clases concretas (FacturaEstandarPDF y TicketSimplificado) que validan montos, calculan impuestos y formatean cada comprobante.
- Una clase abstracta CreadorFactura con el método de fábrica instanciarGenerador(), el método crearGeneradorValidado(double subtotal) y el flujo procesarFactura(String numero, double subtotal).
- Dos clases creadoras concretas (CreadorFacturaPDF y CreadorFacturaTicket) que instancian cada generador.

Luego, dentro del método main, se prueban facturas válidas en ambos formatos y un caso con importe inválido.

Lógica utilizada

La lógica del programa consiste en:
- Definir una interfaz común GeneradorFactura para validar importes y emitir comprobantes.
- Combinar en CreadorFactura la creación del generador con la validación previa del importe.
- Encapsular en cada clase concreta las reglas de cálculo de impuestos y el formato de salida.

Resultado de la ejecución

La ejecución del programa muestra en la consola lo siguiente:
=== FACTURA PDF [FAC-001] ===
Subtotal: $10000.0 | IVA (21%): $2100.0 | Total: $12100.0
--- TICKET [TCK-002] ---
Subtotal: $2500.0 | Impuesto: $250.0 | Total: $2750.0
Importe inválido para el formato seleccionado: $-100.0

Captura de pantalla

<img width="817" height="292" alt="image" src="https://github.com/user-attachments/assets/6b9f0818-cc83-4ce0-8f3e-c5943ebcefac" />
