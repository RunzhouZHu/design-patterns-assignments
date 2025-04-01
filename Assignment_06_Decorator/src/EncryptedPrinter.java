public class EncryptedPrinter extends PrinterDecorator {

    public EncryptedPrinter(Printer printer) {
        super(printer);
    }

    @Override
    public void print(String message) {

        //encryption
        StringBuilder encrypt_message = new StringBuilder();
        for (int i = 0; i < message.length(); i++) {
            encrypt_message.append((char)(message.charAt(i) + 2)); // 2 is the shift of the encryption, can be changed
        }

        super.print(encrypt_message.toString());
    }
}
