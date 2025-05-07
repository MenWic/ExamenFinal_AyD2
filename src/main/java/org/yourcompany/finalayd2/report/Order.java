package org.yourcompany.finalayd2.report;

import java.util.List;

public class Order {

    private final String customerName;
    private final List<String> items;
    private final double total;

    public Order(String customerName, List<String> items, double total) {
        this.customerName = customerName;
        this.items = items;
        this.total = total;
    }

    public void printSummary() {
        ReportGenerator generator = new ReportGenerator();
        generator.printHeader(customerName);
        items.forEach(generator::printLineItem);
        generator.printTotal(total);
    }
}
