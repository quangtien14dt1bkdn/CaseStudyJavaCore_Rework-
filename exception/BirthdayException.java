package exception;

import java.time.LocalDate;

public class BirthdayException extends Exception {
    public BirthdayException(String message) {
        super(message);
    }

    public static String birthdayException(String birthdayCustomer) throws GenderException {
        String regex = "^(3[01]|[12][0-9]|0[1-9])/(1[0-2]|0[1-9])/[0-9]{4}$";
            LocalDate date = LocalDate.now();
            if (birthdayCustomer.matches(regex)) {
                String temp = "";
                for (int i = birthdayCustomer.length() - 4; i < birthdayCustomer.length(); i++) {
                    temp += birthdayCustomer.charAt(i);
                } // lay 4 vi tri cuoi cung tuong ung voi year = String temp
                Integer year=new Integer(temp); // ep kieu temp sang interger
                if (date.getYear() - year >= 18 && year>1900 ) {
                    return birthdayCustomer;
                } else {
                    throw new GenderException("Năm sinh phải > 1900 và nhỏ hơn năm hiện tại 18 năm.");
                }

            } else {
                throw new GenderException("Birthday không đúng định dạng");
            }
        }
}
