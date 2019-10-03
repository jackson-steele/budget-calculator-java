package budgetcalculator;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.ArrayList;

public class Budget {
    public static void main(String[] args) {

    }

    ArrayList<BudgetItem> mainBudget = new ArrayList<BudgetItem>();

    public Budget() {
    }

    public ArrayList<BudgetItem> fillSQLtable() throws SQLException {
        ArrayList<BudgetItem> budgets;
        Connection connection = null;

        try {

        } catch (/*SQLException ex*/) {

        } finally {
            if (connection != null) {
                connection.close();
            }
        }
    }

    public Budget(ArrayList<BudgetItem> mainBudget) {
        this.mainBudget = mainBudget;
    }

    public ArrayList<BudgetItem> getMainBudget() {
        return mainBudget;
    }

    public void setMainBudget(ArrayList<BudgetItem> mainBudget) {
        this.mainBudget = mainBudget;
    }
}
