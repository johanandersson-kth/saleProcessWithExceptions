package se.kth.iv1350.saleProcessWithExAndDesPat.view;

import se.kth.iv1350.saleProcessWithExAndDesPat.model.RevenueObserver;

/**
 * Displays the total amount of revenue
 */
public class TotalRevenueView implements RevenueObserver {
    private double totalRevenue;

    /**
     * Creates a new instance.
     */
    public TotalRevenueView() {
        totalRevenue = 0;
    }

    /**
     * Adds the total of the sale to the total revenue
     * @param sale The sale to be added to the revenue counter
     */
    @Override
    public void newSale(double totalWithTaxes) {
        totalRevenue += totalWithTaxes;
        printCurrentState();
    }

    private void printCurrentState() {
        System.out.println("CURRENT TOTAL REVENUE: " + totalRevenue);
    }
}
