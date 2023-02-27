package ru.job4j.inheritance;

/**
 * @author sveet
 * @date 27.02.2023
 */
public class ReportUsage {

    public static void main(String[] args) {
        TextReport report = new TextReport();
        String text = report.generate("Report's name", "Report's body");
        System.out.println(text);
        HtmlReport hReport = new HtmlReport();
        String hText = hReport.generate("Report's name", "Report's body");
        System.out.println(hText);
    }
}
