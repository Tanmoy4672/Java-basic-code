package mangamentSystem.model;

public class Payment {

    private final String student_id;
    private final String account_no;
    private final String amount;
    private final String account_type;
    private final String date;

    public Payment(String student_id, String account_no, String amount, String account_type, String date) {
        this.student_id = student_id;
        this.account_no = account_no;
        this.amount = amount;
        this.account_type = account_type;
        this.date = date;
    }

    public String getStudent_id() {
        return student_id;
    }

    public String getAccount_no() {
        return account_no;
    }

    public String getAmount() {
        return amount;
    }

    public String getAccount_type() {
        return account_type;
    }

    public String getDate() {
        return date;
    }

}
