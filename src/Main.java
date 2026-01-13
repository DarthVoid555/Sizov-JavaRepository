import dip.NotificationService;
import dip.EmailSender;
import dip.SmsSender;
import isp.ModernScanner;
import isp.FaxMachine;
import isp.Printer;
import isp.Fax;
import isp.Scanner;
import isp.OldPrinter;
import lsp.Bird;
import lsp.FlyingBird;
import lsp.Penguin;
import lsp.Sparrow;
import ocp.DiscountCalculator;
import ocp.RegularDiscount;
import ocp.VipDiscount;
import ocp.SuperVipDiscount;
import srp.ReportManager;

import java.util.List;

public class Main {
    public static void main(String[] args) {

        // ---------- S ---------- SRP
        ReportManager manager = new ReportManager(List.of(5, 10, 15, 20));
        manager.generateReport();

        // ---------- O ---------- OCP
        DiscountCalculator calculator = new DiscountCalculator(new RegularDiscount());
        System.out.println("Regular: " + calculator.calculateDiscount(1000));

        calculator = new DiscountCalculator(new VipDiscount());
        System.out.println("VIP: " + calculator.calculateDiscount(1000));

        calculator = new DiscountCalculator(new SuperVipDiscount());
        System.out.println("Super VIP: " + calculator.calculateDiscount(1000));

        // ---------- L ---------- LSP
        displayBird(new Sparrow());
        displayBird(new Penguin());

        // ---------- I ---------- ISP
        // ---------- Старый принтер ----------
        Printer printer = new OldPrinter();
        printer.print("Отчёт за неделю");

        // ---------- Современный сканер ----------
        Scanner scanner = new ModernScanner();
        scanner.scan("Документ для сканирования");

        // ---------- Факс ----------
        Fax fax = new FaxMachine();
        fax.fax("Отправка факса: отчёт");

        // ---------- D ---------- DIP
        // Отправка письма
        NotificationService emailService = new NotificationService(new EmailSender());
        emailService.send("Ваш заказ готов к выдаче!");

        // Отправка SMS
        NotificationService smsService = new NotificationService(new SmsSender());
        smsService.send("Ваш заказ готов к выдаче!");
    }

    public static void displayBird(Bird bird) {
        bird.eat();
        if (bird instanceof FlyingBird flyingBird) {
            flyingBird.fly();
        }
    }
}
