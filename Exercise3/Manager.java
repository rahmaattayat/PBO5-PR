import java.util.Calendar;
import java.util.GregorianCalendar;

class Manager extends Employee {
    private String secretaryName;

    public Manager(String n, double s, int d, int m, int y) {
        super(n, s, d, m, y);
        this.secretaryName = "";
    }

    @Override
    public void raiseSalary(double byPercent) {
        // Tambahan bonus 0.5% per tahun masa kerja
        GregorianCalendar todaysDate = new GregorianCalendar();
        int currentYear = todaysDate.get(Calendar.YEAR);
        double years = currentYear - hireYear();
        double bonusPercent = 0.5 * years; 

        // Gabungkan persentase kenaikan: byPercent + bonusPercent
        super.raiseSalary(byPercent + bonusPercent);
    }

    public String getSecretaryName() {
        return secretaryName;
    }

    public void setSecretaryName(String secretaryName) {
        this.secretaryName = secretaryName;
    }
}
