public class ExpenseReport {
    private final double expenses;
    private final boolean planned;

    public ExpenseReport(double expenses, boolean planned) {
        this.expenses = expenses;
        this.planned = planned;
    }

    public double getExpenses() {
        return expenses;
    }

    public boolean isPlanned() {
        return planned;
    }

}
