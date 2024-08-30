// class Main {
//     public static void main(String args[]) {
//         int x;
//         try {
//             throw x;
//         } catch (int e) {
//             System.out.println("Got the Exception" + e);
//         }
//     }
// }
// class Test extends Exception {
// }

// class Main {
//     public static void main(String args[]) {
//         try {
//             throw new Test();
//         } catch (Test t) {
//             System.out.println("Got the Test Exception");
//         } finally {
//             System.out.println("Inside finally block ");
//         }
//     }
// }
// public class Main {

//     // Example demonstrating ArrayIndexOutOfBoundsException
//     public static void main(String[] args) {
//         int[] numbers = { 1, 2, 3 };
//         try {
//             System.out.println(numbers[3]); // Accessing an index beyond the array size
//         } catch (ArrayIndexOutOfBoundsException e) {
//             System.out.println("Caught ArrayIndexOutOfBoundsException: " + e.getMessage());
//         }
//     }
// }/
// import java.util.ArrayList;
// import java.util.*;

// public class Main {
//     public static void main(String[] args) {
//         System.out.println("Welcome to Java Program to find the length of array list");
//         ArrayList<String> listOfBanks = new ArrayList<>();
//         int size = listOfBanks.size();
//         System.out.println("size of array list after creating: " + size);
//         listOfBanks.add("Citibank");
//         listOfBanks.add("Chase");
//         listOfBanks.add("Bank of America");
//         size = listOfBanks.size();
//         System.out.println("length of ArrayList after adding elements: " + size);
//         listOfBanks.clear();
//         size = listOfBanks.size();
//         System.out.println("size of ArrayList after clearing elements: " + size);
//     }
// }
import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.SwingUtilities;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

// public class Test extends JFrame {
//     private final JButton upload = new JButton("Upload");
//     private final JButton save = new JButton("Save");

//     public Test() {
//         super("JFileChooser Example - Open Save File Dialong in Java");
//         setLayout(new FlowLayout());
//         upload.addActionListener(new ActionListener() {
//             @Override
//             public void actionPerformed(ActionEvent arg0) {
//                 showSelectFileDialong();
//             }
//         });
//         getContentPane().add(upload);
//         setSize(300, 100);
//         setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//         setVisible(true);

//     }

//     public static void main(String[] args) {
//         try {
//             UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
//         } catch (ClassNotFoundException
//                 | InstantiationException
//                 | IllegalAccessException
//                 | UnsupportedLookAndFeelException e) {
//         }
//         SwingUtilities.invokeLater(new Runnable() {
//             @Override
//             public void run() {
//                 Test t = new Test();
//             }
//         });
//     }

//     private void showSelectFileDialong() {

//         JFileChooser fileChooser = new JFileChooser();
//         fileChooser.setDialogTitle("Choose a File to upload");
//         // pass reference of your JFrame here
//         int response = fileChooser.showSaveDialog(this);
//         if (response == JFileChooser.APPROVE_OPTION) {
//             File selectedFile = fileChooser.getSelectedFile();
//             System.out.println("Save as file: " + selectedFile.getAbsolutePath());
//         }
//     }
// }

import java.util.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.*;

// public class MySQLTest {
//     public static void main(String args[]) {
//         String dbURL = "jdbc:mysql://localhost:3306/test";
//         String username = "root";
//         String password = "root";
//         Connection dbCon = null;
//         Statement stmt = null;
//         ResultSet rs = null;
//         String query = "select count(*) from stock";
//         try {
//             dbCon = DriverManager.getConnection(dbURL, username, password);
//             stmt = dbCon.prepareStatement(query);
//             rs = stmt.executeQuery(query);
//             while (rs.next()) {
//                 int count = rs.getInt(1);
//                 System.out.println("count of stock : " + count);
//             }
//         } catch (SQLException ex) {

//             Logger.getLogger(CollectionTest.class.getName()).log(Level.SEVERE, null, ex);

//         }
//     }
// }

// import java.sql.CallableStatement;
// import java.sql.Connection;
// import java.sql.DriverManager;
// import java.sql.ResultSet;

// public class Test {

//     public static void main(String args[]) {
//         Connection con = null;
//         try {
//             Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
//             String url = "jdbc:sqlserver://localhost:42588;";
//             con = DriverManager.getConnection(url, "username", "pw");
//         } catch (Exception e) {
//             e.printStackTrace();
//         }
//         String SQL = "{call Books.dbo.usp_BookDetails_Get(?)}";
//         CallableStatement cs = con.prepareCall(SQL);
//         cs.setString(1, "978-0132778046");
//         cs.setString(2, "978-0132778047");
//         ResultSet rs = cs.executeQuery();
//         while (rs.next()) {
//             System.out.println(rs.getString(1));
//         }
//         rs.close();
//     }
// }

public class Test {
    public static void main(String[] args) {
        Connection connection = null;
        Statement statement = null;
        ResultSet resultSet = null;

        try {
            // Load the MySQL JDBC driver
            Class.forName("com.mysql.cj.jdbc.Driver");

            // Establish the connection
            String url = "jdbc:mysql://localhost:3306/mydatabase";
            String username = "username";
            String password = "password";
            connection = DriverManager.getConnection(url, username, password);

            // Create a statement
            statement = connection.createStatement();

            // Execute a query
            resultSet = statement.executeQuery("SELECT * FROM mytable");

            // Process the result set
            while (resultSet.next()) {
                // Retrieve data from the result set
                int id = resultSet.getInt("id");
                String name = resultSet.getString("name");
                // Process the data...
            }
        } catch (SQLException | ClassNotFoundException e) {
            e.printStackTrace();
        } finally {
            // Close the resources
            try {
                if (resultSet != null)
                    resultSet.close();
                if (statement != null)
                    statement.close();
                if (connection != null)
                    connection.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
}