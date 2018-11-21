
package bank;

import javax.swing.JTextArea;
import javax.swing.JOptionPane;

/**
 *
 * @author admin
 */
public class GUI extends javax.swing.JFrame {
       String action = "";
       String account = "";
       String br = System.getProperty("line.separator"); // new line       
       String _userName = login.UserName; // display username
       
       int amount;
       
    public GUI() {
        
        initComponents();    
        with.setEnabled(false);
        dep.setEnabled(false);
        withLimit.setEnabled(false);
        interest.setEnabled(false);
        
            }
    ////////////////////////////////////account//////////////////////////////////////
    public class savingAcc    { //saving
        int balance = 1000;
        
        public void savingDisplay(){
        String savingDis = "Welcome " + _userName + br+
                           "Account number :181-232-333" +br+
                           "Account type : Saving" +br+
                           "Balance : "+balance +br+
                           "*****************************"+br+
                           "You can change withdraw limit and get daily interests"+br;
                           
        display.setText(savingDis);
    }
        
    }
     public class netsaveAcc    //net saving
     {
         int balance = 2000;
       public void netsave()
    {
        String savingDis = "Welcome " + _userName + br+
                           "Account number :456-232-333" +br+
                           "Account type : Net saving" +br+
                           "Balance : "+balance +br+
                           "*****************************"+br+
                           "You cannot change withdraw limit but you will get monthly" +br+
                           "interests"+br;
                           
                       
        display.setText(savingDis);
    }
     }
     
     
     public class chequeAcc    //cheque acc
     { 
         int balance = 3000;
    public void cheque()
    {
        String savingDis = "Welcome " + _userName + br+
                           "Account number :811-562-333" +br+
                           "Account type : Cheque" +br+
                           "Balance : "+balance +br+
                           "*****************************"+br+
                           "You don't have withdraw limit and np interests"+br;
                           
                       
        display.setText(savingDis);
    }
     }
     
      public class fixAcc    // fix acc
      {
          int balance = 4000;
    public void fix()
    {
        String savingDis = "Welcome " + _userName + br+
                           "Account number :111-232-365" +br+
                           "Account type : Fixed" +br+
                           "Balance : "+balance +br+
                           "*****************************"+br+
                           "You have fixed period to withdraw, have no limit and get"+br+
                           "the biggest interests"+br;
                           
                       
        display.setText(savingDis);
    }
      }
      public void limit(String account, String action) // withdraw limit
    {
        String limit;
        if(account.equals("saving"))
            
    {    if(action.equals("withlimit"))
    {
        limit = input.getText();
         limit = "How much would you like to set your withdraw limit?"+ limit +br; 
         
         display.setText(limit); 
    }
    }
    else if(account.equals("netsaving"))
    {
        if(action.equals("withlimit"))
    {
         limit = "500";
         limit = "Your withdraw limit : "+limit +br; 
         
         display.setText(limit); 
    }
    }       
    }
    
    
    public void interest(String account)  //interest
    {
        double dailyIn;
        double monthly;
        double biggest;
        if(account.equals("saving"))
        {   int balance =1000;
            dailyIn = (balance*0.20)/100; 
            String showIn = "Your interests now :" + dailyIn + br;
            
            display.setText(showIn);                 
        }
        else if(account.equals("netsaving"))
        {
      String m;
      int month;
               
     m = JOptionPane.showInputDialog("How long have you had this account ? (month)");  
     month = Integer.parseInt(m);
        
     monthly = month*0.50;  
     
     String showInMonth = "Your interests now : "+monthly; 
     
     display.setText(showInMonth); 
        }
        else if(account.equals("fix"))
        {
            int balance = 4000;
            biggest = (balance*0.80)/100;
            
            String showInBig = "Your interests now : "+biggest; 
     
     display.setText(showInBig); 
        }
    }
  
public void depositfunc(String account)  // display deposit 
{
    if(account.equals("saving"))
    { int balance =1000;
         String sav = "Now your balance is " +balance+ br+
                        "How much would you like to deposit?"+br;
      
      display.setText(sav); 
    }
    else if(account.equals("netsaving"))
    { int balance = 2000;
        String ns = "Now your balance is " +balance+ br+
                     "How much would you like to deposit?"+br;
      
      display.setText(ns);
    }
    else if(account.equals("cheque"))
    { int balance =3000;
        String ch = "Now your balance is " +balance+ br+
                     "How much would you like to deposit?"+br;
      
      display.setText(ch);
    }
    else if(account.equals("fix"))
    { int balance = 4000;
        String fx = "Now your balance is " +balance+ br+
                     "How much would you like to deposit?"+br;
      
      display.setText(fx);
    }

}

public void withdrawfunc(String account) // display withdraw
{
    if(account.equals("saving"))
    { int balance =1000;
         String sav = "Now your balance is " +balance+ br+
                       "How much would you like to withdraw?"+br;
      
      display.setText(sav); 
    }
    else if(account.equals("netsaving"))
    { int balance = 2000;
        String ns = "Now your balance is " +balance+ br+
                    "How much would you like to withdraw?"+br;
      
      display.setText(ns);
    }
    else if(account.equals("cheque"))
    { int balance =3000;
        String ch = "Now your balance is " +balance+ br+
                     "How much would you like to withdraw?"+br;
      
      display.setText(ch);
    }
    else if(account.equals("fix"))
    { int balance = 4000;
        String fx = "Now your balance is " +balance+ br+
                     "How much would you like to withdraw?"+br;
      
      display.setText(fx);
    }
}
        
    public void function(String action) // deposit and withdraw function
    {
        if(account.equals("saving")) // for saving
        {
            int balance=1000;
        
            if(action.equals("with"))
        {
            int m;
            String amount;
        
            amount = input.getText();
            m = Integer.parseInt(amount);
      
            balance = balance - m;
            String updateDep = "Now your balance is " +balance+ br+
                               "How much would you like to withdraw?"+br;
      
            display.setText(updateDep); 
        }
            else if (action.equals("dep"))
        {
            int m;
            String amount;
            amount = input.getText();
            m = Integer.parseInt(amount);
      
            balance = balance + m;
            String updateDep = "Now your balance is " +balance+ br+
                               "How much would you like to deposit?"+br;
            display.setText(updateDep); 
        }
            else if (action.equals("withlimit"))
        {
            String with = input.getText();
  
            String updatewith = "Your withdraw limit now : " +with +br;
      
            display.setText(updatewith); 
        }
        }
        else if (account.equals("netsaving")) // for net saving
        {
            int balance=2000;
            if(action.equals("with"))
        {
            int m;
            String amount;
        
            amount = input.getText();
            m = Integer.parseInt(amount);
      
            balance = balance - m;
            String updateDep = "Now your balance is " +balance+ br+
                               "How much would you like to withdraw?"+br;
      
            display.setText(updateDep); 
        }
            else if (action.equals("dep"))
        {
           
            int m;
            String amount;
            amount = input.getText();
            m = Integer.parseInt(amount);
      
            balance = balance + m;
            String updateDep = "Now your balance is " +balance+ br+
                        "How much would you like to deposit?"+br;
      
            display.setText(updateDep); 
        }
            else if (action.equals("withlimit"))
        {
            
            int with = 500;
  
            String updatewith = "Your withdraw limit now : " +with +br;
      
            display.setText(updatewith);
            withLimit.setEnabled(false);
        }
        }
        else if (account.equals("cheque")) // for cheque 
        {
            int balance=3000;
            if(action.equals("with"))
        {
            int m;
            String amount;
        
            amount = input.getText();
            m = Integer.parseInt(amount);
      
            balance = balance - m;
            String updateDep = "Now your balance is " +balance+ br+
                        "How much would you like to withdraw?"+br;
      
            display.setText(updateDep); 
        }
            else if (action.equals("dep"))
        {
           
            int m;
            String amount;
            amount = input.getText();
            m = Integer.parseInt(amount);
      
            balance = balance + m;
            String updateDep = "Now your balance is " +balance+ br+
                        "How much would you like to deposit?"+br;
      
            display.setText(updateDep); 
        }
        
        }
        else if (account.equals("fix")) // for fixx
        {
            int balance=4000;
            if(action.equals("with"))
        {
            int m;
            String amount;
        
            amount = input.getText();
            m = Integer.parseInt(amount);
      
            balance = balance - m;
            String updateDep = "Now your balance is " +balance+ br+
                        "How much would you like to withdraw?"+br;
      
            display.setText(updateDep); 
        }
            else if (action.equals("dep"))
        {
           
            int m;
            String amount;
            amount = input.getText();
            m = Integer.parseInt(amount);
      
            balance = balance + m;
            String updateDep = "Now your balance is " +balance+ br+
                               "How much would you like to deposit?"+br;
      
            display.setText(updateDep); 
        }
            else if (action.equals("withlimit"))
        {
            
            String updatewith = "You will be able to withdraw after 4 months" +br;
      
            display.setText(updatewith); 
        }
         
        }

    }
     
 
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        butt1 = new javax.swing.JButton();
        butt3 = new javax.swing.JButton();
        butt7 = new javax.swing.JButton();
        butt4 = new javax.swing.JButton();
        butt2 = new javax.swing.JButton();
        butt8 = new javax.swing.JButton();
        butt6 = new javax.swing.JButton();
        butt9 = new javax.swing.JButton();
        butt5 = new javax.swing.JButton();
        buttCancel = new javax.swing.JButton();
        butt0 = new javax.swing.JButton();
        buttEnter = new javax.swing.JButton();
        buttClear = new javax.swing.JButton();
        Saving = new javax.swing.JButton();
        fix = new javax.swing.JButton();
        netSaving = new javax.swing.JButton();
        Cheque = new javax.swing.JButton();
        with = new javax.swing.JButton();
        interest = new javax.swing.JButton();
        withLimit = new javax.swing.JButton();
        dep = new javax.swing.JButton();
        buttspot = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        display = new javax.swing.JTextArea();
        input = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("ATM");
        setBackground(new java.awt.Color(255, 255, 204));

        butt1.setBackground(new java.awt.Color(153, 153, 153));
        butt1.setText("1");
        butt1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                butt1ActionPerformed(evt);
            }
        });

        butt3.setBackground(new java.awt.Color(153, 153, 153));
        butt3.setText("3");
        butt3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                butt3ActionPerformed(evt);
            }
        });

        butt7.setBackground(new java.awt.Color(153, 153, 153));
        butt7.setText("7");
        butt7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                butt7ActionPerformed(evt);
            }
        });

        butt4.setBackground(new java.awt.Color(153, 153, 153));
        butt4.setText("4");
        butt4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                butt4ActionPerformed(evt);
            }
        });

        butt2.setBackground(new java.awt.Color(153, 153, 153));
        butt2.setText("2");
        butt2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                butt2ActionPerformed(evt);
            }
        });

        butt8.setBackground(new java.awt.Color(153, 153, 153));
        butt8.setText("8");
        butt8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                butt8ActionPerformed(evt);
            }
        });

        butt6.setBackground(new java.awt.Color(153, 153, 153));
        butt6.setText("6");
        butt6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                butt6ActionPerformed(evt);
            }
        });

        butt9.setBackground(new java.awt.Color(153, 153, 153));
        butt9.setText("9");
        butt9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                butt9ActionPerformed(evt);
            }
        });

        butt5.setBackground(new java.awt.Color(153, 153, 153));
        butt5.setText("5");
        butt5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                butt5ActionPerformed(evt);
            }
        });

        buttCancel.setBackground(new java.awt.Color(255, 0, 0));
        buttCancel.setText("Cancel");
        buttCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttCancelActionPerformed(evt);
            }
        });

        butt0.setBackground(new java.awt.Color(153, 153, 153));
        butt0.setText("0");
        butt0.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                butt0ActionPerformed(evt);
            }
        });

        buttEnter.setBackground(new java.awt.Color(51, 204, 0));
        buttEnter.setText("Enter");
        buttEnter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttEnterActionPerformed(evt);
            }
        });

        buttClear.setBackground(new java.awt.Color(255, 255, 0));
        buttClear.setText("Clear");
        buttClear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttClearActionPerformed(evt);
            }
        });

        Saving.setBackground(new java.awt.Color(255, 102, 102));
        Saving.setText(" Saving acc");
        Saving.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SavingActionPerformed(evt);
            }
        });

        fix.setBackground(new java.awt.Color(255, 102, 102));
        fix.setText("Fix acc");
        fix.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fixActionPerformed(evt);
            }
        });

        netSaving.setBackground(new java.awt.Color(255, 102, 102));
        netSaving.setText("Net saving acc");
        netSaving.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                netSavingActionPerformed(evt);
            }
        });

        Cheque.setBackground(new java.awt.Color(255, 102, 102));
        Cheque.setText("Cheque acc");
        Cheque.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ChequeActionPerformed(evt);
            }
        });

        with.setBackground(new java.awt.Color(0, 204, 204));
        with.setText("Withdraw");
        with.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                withActionPerformed(evt);
            }
        });

        interest.setBackground(new java.awt.Color(0, 204, 204));
        interest.setActionCommand("Interest");
        interest.setLabel("Interests");
        interest.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                interestActionPerformed(evt);
            }
        });

        withLimit.setBackground(new java.awt.Color(0, 204, 204));
        withLimit.setLabel("Withdraw limit");
        withLimit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                withLimitActionPerformed(evt);
            }
        });

        dep.setBackground(new java.awt.Color(0, 204, 204));
        dep.setText("Deposit");
        dep.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                depActionPerformed(evt);
            }
        });

        buttspot.setBackground(new java.awt.Color(153, 153, 153));
        buttspot.setText(".");
        buttspot.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttspotActionPerformed(evt);
            }
        });

        display.setColumns(20);
        display.setRows(5);
        jScrollPane1.setViewportView(display);

        input.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel1.setText("Amount :");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(netSaving, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(Saving, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 352, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(Cheque, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(fix, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(216, 216, 216)
                        .addComponent(jLabel1)
                        .addGap(18, 18, 18)
                        .addComponent(input, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(22, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(butt4, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(butt5, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(butt6, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(buttClear, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(butt1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(butt2, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(butt3, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(buttCancel, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(butt7, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(butt0, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(buttspot, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(butt8, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(butt9, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(buttEnter, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addGap(166, 166, 166))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(with, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(dep, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(withLimit)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(interest, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(99, 99, 99))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(with)
                    .addComponent(dep)
                    .addComponent(withLimit)
                    .addComponent(interest))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addComponent(Saving, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(netSaving, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addComponent(Cheque, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(fix, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(input, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(butt1, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(butt2, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(butt3, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(buttCancel, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(butt4, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(butt5, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(butt6, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(buttClear, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(butt7, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(butt8, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(butt9, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(buttEnter, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(butt0, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(buttspot, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void butt2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_butt2ActionPerformed
      input.setText(input.getText() + "2");
    }//GEN-LAST:event_butt2ActionPerformed

    private void butt1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_butt1ActionPerformed
        input.setText(input.getText() + "1");
    }//GEN-LAST:event_butt1ActionPerformed

    private void butt6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_butt6ActionPerformed
         input.setText(input.getText() + "6");
    }//GEN-LAST:event_butt6ActionPerformed

    private void butt9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_butt9ActionPerformed
         input.setText(input.getText() + "9");
    }//GEN-LAST:event_butt9ActionPerformed

    private void buttClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttClearActionPerformed
        input.setText(null);
    }//GEN-LAST:event_buttClearActionPerformed

    private void butt0ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_butt0ActionPerformed
         input.setText(input.getText() + "0");
    }//GEN-LAST:event_butt0ActionPerformed

    private void butt8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_butt8ActionPerformed
         input.setText(input.getText() + "8");
    }//GEN-LAST:event_butt8ActionPerformed

    private void butt3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_butt3ActionPerformed
        input.setText(input.getText() + "3");
    }//GEN-LAST:event_butt3ActionPerformed

    private void butt4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_butt4ActionPerformed
        input.setText(input.getText() + "4");
    }//GEN-LAST:event_butt4ActionPerformed

    private void butt5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_butt5ActionPerformed
         input.setText(input.getText() + "5");
    }//GEN-LAST:event_butt5ActionPerformed

    private void butt7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_butt7ActionPerformed
         input.setText(input.getText() + "7");
    }//GEN-LAST:event_butt7ActionPerformed

    private void netSavingActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_netSavingActionPerformed
        account = "netsaving";
        netsaveAcc _netSave = new netsaveAcc();
        _netSave.netsave(); // display acc detail
       
        with.setEnabled(true);
        dep.setEnabled(true);
        interest.setEnabled(true);
        withLimit.setEnabled(true);
        
    }//GEN-LAST:event_netSavingActionPerformed

    private void SavingActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SavingActionPerformed
       account = "saving";
       savingAcc _saving = new savingAcc();
      _saving.savingDisplay(); // display acc detail
        with.setEnabled(true);
        dep.setEnabled(true);
        interest.setEnabled(true);
        withLimit.setEnabled(true);
    }//GEN-LAST:event_SavingActionPerformed

    private void buttCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttCancelActionPerformed
          System.exit(0);
    }//GEN-LAST:event_buttCancelActionPerformed

    private void withActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_withActionPerformed
        action = "with";        
        withdrawfunc(account);
    }//GEN-LAST:event_withActionPerformed

    private void depActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_depActionPerformed
        action = "dep";
        depositfunc(account);
    }//GEN-LAST:event_depActionPerformed

    private void withLimitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_withLimitActionPerformed
       action = "withlimit";
       limit(account,action);
    }//GEN-LAST:event_withLimitActionPerformed

    private void interestActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_interestActionPerformed
         action = "inter";
         interest(account);
         
    }//GEN-LAST:event_interestActionPerformed

    private void buttspotActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttspotActionPerformed
        input.setText(input.getText() + ".");
    }//GEN-LAST:event_buttspotActionPerformed

    private void fixActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fixActionPerformed
        account = "fix";
        fixAcc _fixxAcc = new fixAcc();
        _fixxAcc.fix(); // display acc detail
        with.setEnabled(true);
        dep.setEnabled(true);
        interest.setEnabled(true);
        withLimit.setEnabled(false);
        
    }//GEN-LAST:event_fixActionPerformed

    private void ChequeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ChequeActionPerformed
        account = "cheque"; 
        chequeAcc _chequeAcc = new chequeAcc();
        _chequeAcc.cheque(); // display acc detail
        with.setEnabled(true);
        dep.setEnabled(true);
        interest.setEnabled(false);
        withLimit.setEnabled(false);
    }//GEN-LAST:event_ChequeActionPerformed

    private void buttEnterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttEnterActionPerformed
        if(!input.equals("")) function(action);        
    }//GEN-LAST:event_buttEnterActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Cheque;
    private javax.swing.JButton Saving;
    private javax.swing.JButton butt0;
    private javax.swing.JButton butt1;
    private javax.swing.JButton butt2;
    private javax.swing.JButton butt3;
    private javax.swing.JButton butt4;
    private javax.swing.JButton butt5;
    private javax.swing.JButton butt6;
    private javax.swing.JButton butt7;
    private javax.swing.JButton butt8;
    private javax.swing.JButton butt9;
    private javax.swing.JButton buttCancel;
    private javax.swing.JButton buttClear;
    private javax.swing.JButton buttEnter;
    private javax.swing.JButton buttspot;
    private javax.swing.JButton dep;
    private javax.swing.JTextArea display;
    private javax.swing.JButton fix;
    private javax.swing.JTextField input;
    private javax.swing.JButton interest;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton netSaving;
    private javax.swing.JButton with;
    private javax.swing.JButton withLimit;
    // End of variables declaration//GEN-END:variables
}
