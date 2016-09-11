# How the program runs
---
##This is a simple JDBC example which allows you to extract data from the database.

###DatabaseConnection.java  
This class is used to bridge the java file with a database file. OR it is programmed to establish a connection between a java file and a database file.  

```
Connection con = null;
        try {
           Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/office", "root", "");
           // System.out.println("Server Connected");

        } catch (Exception e) {
            System.out.println("Error occured:" + e);
        }
        return con;
    }
```

Here,
```
    Class.forName("com.mysql.jdbc.Driver");    
```    
This code is used to load the JDBC Driver.  
```
con = DriverManager.getConnection("jdbc:mysql://localhost:3306/office", "root", "");
```
This code is used to establish a connection with the database where the url in the bracket is the location of the file.  


###employeeinfo.java
This class is used to send SQL commands from the program to the database using the connection class and it is executed using the PrepareStatement.  

```
    public employeeinfo() {
        con = DatabaseConnection.getConnection();
        try {
            pstat = con.prepareStatement("Select * from tbl_employee");
            rs = pstat.executeQuery();
            while (rs.next()) {
                System.out.print(rs.getString(1) + " ");
                System.out.print(rs.getString(2) + " ");
                System.out.println(rs.getString(3));
            }
        } catch (SQLException ex) {
            System.err.println("Error occured:" + ex);
        }

    }
```
Here,

```
pstat = con.prepareStatement("Select * from tbl_employee");
```
This code used to create a SQL statement which is sent to the database programme.

```
System.out.println(rs.getString(3));
```  
This code is used to execute the prepared Statement.


###JDBCemployee.java  
This class is simply used to ask the user for input. In this programmes case, it asks the user to input the username and password.


###Login.java  
This class is used to extract data from the database and compare the user input value to the value in the database.



