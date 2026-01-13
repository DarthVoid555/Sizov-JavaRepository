В этой работе демонстрируются принципы проектирования SOLID на примере Java:

S (Single Responsibility Principle) - каждый класс выполняет только одну задачу (ReportManager, ReportCalculator, ConsoleReportPrinter, FileReportSaver).
O (Open/Closed Principle) - новые типы скидок добавляются через расширение классов, без изменения существующего кода (DiscountCalculator, DiscountPolicy, RegularDiscount, VipDiscount, SuperVipDiscount).
L (Liskov Substitution Principle) - подклассы не ломают поведение базовых классов (Bird / Sparrow / Penguin, разделены на летающих и нелетающих птиц).
I (Interface Segregation Principle) - классы реализуют только нужные интерфейсы (Printer, Scanner, Fax).
D (Dependency Inversion Principle) - зависимости строятся через абстракции, а не конкретные реализации (NotificationService + MessageSender, EmailSender, SmsSender).
