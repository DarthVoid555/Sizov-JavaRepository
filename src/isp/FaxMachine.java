package isp;

public class FaxMachine implements Fax {
    @Override
    public void fax(String document) {
        System.out.println("Отправляю факс: " + document);
    }
}
