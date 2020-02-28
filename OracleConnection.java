/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oracleconnection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.awt.*;
import java.awt.event.*;
import java.awt.event.ActionEvent; 


import javax.swing.*;
/**
 *
 * @author YEMI
 */
public class OracleConnection {

    /**
     * @param args the command line arguments
     */
       public static void main(String[] args)throws Exception {
           Connection con = null;
           String o = null;
        try {
            Class.forName("oracle.jdbc.driver.OracleDriver");
            String host = "jdbc:oracle:thin:@localhost:1521:orcl";
            String uName = "system";
            String uPass = "system";
            
            con = DriverManager.getConnection(host, uName, uPass); 
            
            
      
    }catch (Exception err){
        
    }    
        
         if (con == null){
             
     String[] listener = new String[] {
        "cmd",
        "/K",
        "start",
        "cmd",
        "/K",
        "C:\\Windows\\System32\\runas.exe /env /user:administrator \"C:\\app\\Raph\\product\\12.1.0\\dbhome_1\\BIN\\lsnrctl.exe"
             + " \"start\""
       };

     String[] oracleStartup = new String[] {
        "cmd",
        "/K",
        "start",
        "cmd",
        "/K",
        "\"C:\\app\\Raph\\product\\12.1.0\\dbhome_1\\BIN\\sqlplus.exe \"/ as sysdba \""
      };
     
     String[] tomcat = new String[] {
        "cmd",
        "/K",
        "start",
        "cmd",
        "/K",
        "\"C:\\Tomcat9\\apache-tomcat-9.0.30\\bin\\startup.bat"
      };
     
      String[] sqlDeveloper = new String[] {
        "cmd",
        "/K",
        "start",
        "cmd",
        "/K",
        "C:\\app\\Raph\\product\\12.1.0\\dbhome_1\\sqldeveloper\\sqldeveloper.exe"
};
     
   //Process listen = Runtime.getRuntime().exec(listener);
   //Process startupOracle = Runtime.getRuntime().exec(oracleStartup);
   //Process tom = Runtime.getRuntime().exec(tomcat); 
   //Process process = Runtime.getRuntime().exec(sqlDeveloper);
} else{
          Runing gui = new Runing();
gui.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
gui.setVisible(true);
gui.setSize(400, 300);
gui.setTitle("DEVTORAL");   
        };
        
        
                 Remove gu = new Remove();

     
//String[] tomcat1 = new String[]{"cmd ", " /K start cmd /K "
//+ "\"" + " chcp 1251 " + " &C:\\Tomcat9\\apache-tomcat-9.0.30\\bin\\startup.bat "};


 
}
 public static class Runing extends JFrame{
    JButton SQLPlus,Tomcat,SQLDeveloper, Listener;
    JLabel status;
    
    public Runing(){
        setLayout(new GridBagLayout());
        GridBagConstraints c = new GridBagConstraints();
        
        
        status = new JLabel("Oracle Database already runing, you can open any of the following ");
        c.fill = GridBagConstraints.HORIZONTAL;
        c.gridx = 0;
        c.gridy = 0;
        c.gridwidth = 3;
        add(status, c);
        
        SQLPlus = new JButton("SQLPlus");
        c.fill = GridBagConstraints.HORIZONTAL;
        c.gridx = 1;
        c.gridy = 2;
        add(SQLPlus, c);
        
        Tomcat = new JButton("Tomcat");
        c.fill = GridBagConstraints.HORIZONTAL;
        c.gridx = 1;
        c.gridy = 4;
        add(Tomcat, c);
        
        SQLDeveloper = new JButton("SQLDeveloper");
        c.fill = GridBagConstraints.HORIZONTAL;
        c.gridx = 1;
        c.gridy = 6;
        add(SQLDeveloper, c);
        
        Listener = new JButton("Listener");
        c.fill = GridBagConstraints.HORIZONTAL;
        c.gridx = 1;
        c.gridy = 8;
        add(Listener, c);
        
        event a = new event();
        SQLPlus.addActionListener(a);
        SQLDeveloper.addActionListener(a);
        Tomcat.addActionListener(a);
        Listener.addActionListener(a);
    }
    
    
    public class event implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent a) {
            
            String o = a.getActionCommand();
            if (o.equals("SQLPlus")){
                try{
                String[] oracleStartup = new String[] {
        "cmd",
        "/K",
        "start",
        "cmd",
        "/K",
        "\"C:\\app\\Raph\\product\\12.1.0\\dbhome_1\\BIN\\sqlplus.exe \"/ as sysdba \""
      };
                Process startupOracle = Runtime.getRuntime().exec(oracleStartup);
                }
                catch(Exception e){
                    
                }
                
            }
            
            if (o.equals("Listener")){
                try{
                String[] listener = new String[] {
        "cmd",
        "/K",
        "start",
        "cmd",
        "/K",
        "C:\\Windows\\System32\\runas.exe /env /user:administrator \"C:\\app\\Raph\\product\\12.1.0\\dbhome_1\\BIN\\lsnrctl.exe"
             + " \"start\""
       };
                Process startupOracle = Runtime.getRuntime().exec(listener);
                }
                catch(Exception e){
                    
                }
                
            }
            
            if (o.equals("Tomcat")){
                try{
                String[] tomcat = new String[] {
        "cmd",
        "/K",
        "start",
        "cmd",
        "/K",
        "\"C:\\Tomcat9\\apache-tomcat-9.0.30\\bin\\startup.bat"
      };
                Process startupOracle = Runtime.getRuntime().exec(tomcat);
                }
                catch(Exception e){
                    
                }
                
            }
            
            if (o.equals("SQLDeveloper")){
                try{
                 String[] sqlDeveloper = new String[] {
        "cmd",
        "/K",
        "start",
        "cmd",
        "/K",
        "C:\\app\\Raph\\product\\12.1.0\\dbhome_1\\sqldeveloper\\sqldeveloper.exe"
};
                Process startupOracle = Runtime.getRuntime().exec(sqlDeveloper);
                }
                catch(Exception e){
                    
                }
                
            }
           
        }
    }
}
 
 
 
 public static class Remove extends JFrame{
    JButton RTom, RLis;
    JLabel status;
    
    public Remove(){
        setLayout(new GridBagLayout());
        GridBagConstraints d = new GridBagConstraints();
        
        status = new JLabel("Stop tomcat or Listener ");
        d.fill = GridBagConstraints.HORIZONTAL;
        d.gridx = 0;
        d.gridy = 0;
        d.gridwidth = 3;
        add(status, d);
        
        RTom = new JButton("RTom");
        d.fill = GridBagConstraints.HORIZONTAL;
        d.gridx = 0;
        d.gridy = 0;
        add(RTom, d);
        
        RLis = new JButton("RLis");
        d.fill = GridBagConstraints.HORIZONTAL;
        d.gridx = 0;
        d.gridy = 2;
        add(RLis, d);
        
        event a = new event();
        RTom.addActionListener(a);
        RLis.addActionListener(a);
    }
    
    
    public class event implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent a) {
            
            String o = a.getActionCommand();
            
            if (o.equals("Tomcat") || o.equals("Listener")){
                 Remove gu = new Remove();
                    gu.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                    gu.setVisible(true);
                    gu.setSize(400, 300);
                    gu.setTitle("REMOVE");  
             }
        }
    }
}
 
        }
       
    
        
   
    
    
    

