public class XMLPrinter extends PrinterDecorator{

    public XMLPrinter(Printer printer) {
        super(printer);
    }

    @Override
    public void print(String message) {

        // change to XML format
        message = "<message>" + message + "</message>";

        super.print(message);
    }
}
