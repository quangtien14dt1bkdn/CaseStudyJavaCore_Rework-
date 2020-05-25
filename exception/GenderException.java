package exception;

public class GenderException extends Exception {
    public GenderException(String s) {
        super(s);
    }

    public static String genderException(String gender) throws GenderException {
      String regex="^male$|^female$";
      gender=gender.toLowerCase(); // chuyen tat ca ki tu trong String ve lowerCase
        if (gender.matches(regex)) { // match regex
           char[] characters=gender.toCharArray(); // chuyen String thanh array
           characters[0]=Character.toUpperCase(characters[0]); // chuyen ki tu dau tien trong chuoi thanh UperCase
           gender=new String(characters); // convert array thanh String
            return gender;
        } else {
            throw new GenderException("Gender không hợp lệ");
        }
    }
}
