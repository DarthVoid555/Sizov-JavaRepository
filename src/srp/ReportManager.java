package srp;

import java.util.List;

public class ReportManager {

    private final ReportCalculator calculator;
    private final ConsoleReportPrinter printer;
    private final FileReportSaver saver;

    public ReportManager(List<Integer> data) {
        this.calculator = new ReportCalculator(data);
        this.printer = new ConsoleReportPrinter();
        this.saver = new FileReportSaver();
    }

    public void generateReport() {
        int sum = calculator.calculateSum();
        double avg = calculator.calculateAverage();
        printer.printReport(sum, avg);
        saver.saveReport(sum, avg);
    }
}
