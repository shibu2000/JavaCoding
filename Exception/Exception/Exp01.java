package Exception;
import java.sql.SQLException;
import java.util.Scanner;
public class Exp01 {
    static void checkPwd(String orPwd, String inPwd)throws SQLException{
        if(orPwd.equals(inPwd)){
            System.out.println("Successfully Authenticate");
        }
        else{
            throw new SQLException("Password mismatch");
        }
    }
    public static void main(String[] args) throws SQLException {
        String orPwd="Shibu@2022";
        Scanner foo = new Scanner(System.in);
        System.out.println("Enter you password: ");
        String inPwd=foo.nextLine();
        checkPwd(orPwd, inPwd);
        
    }
}
