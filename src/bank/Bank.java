package bank;

import javax.swing.JOptionPane;
/**
 *
 * @author Nantawan 6010
 */
abstract class Account // abstract class //
{
    public String accName, accType;
    public int accNo, accBal;

    
    abstract public void interest();
    abstract public void bal();
    abstract public void deposit();
    abstract public void withdraw();
    abstract public void accNo();
}
////////////////////////////////////////////////////////////////////////////////

class SavingAcc extends Account   //// Savings Acc  /////
   {
     int limitation;
     double accBal,money;
     double dailyIn;           //can change withdrawal limit // daily interest

   public void bal(){ // show balance
    
    //String showBal = "Your balance : "+accBal; 

    }
    
   public void withdraw() //withdraw
   {
       
       String amount;
       
       double with;
       
        amount = JOptionPane.showInputDialog("Please put the amount of money");
        with = Double.parseDouble(amount);
        
       if(with <= limitation){  //cheack withdrawal limit
           
           accBal = accBal - with;
        JOptionPane.showMessageDialog(null, "Your account balance now = "+accBal);

       }
       else{
               
        JOptionPane.showMessageDialog(null,"Your withdraw is over your limitation now");
        
       }
   }
   
   public void deposit() //deposit
   {
       String amount;
       
       amount = JOptionPane.showInputDialog("Please put the amount of money");
       money = Double.parseDouble(amount);
       
       accBal = accBal + money;
   
       dailyIn = (money*0.20)/100;
       JOptionPane.showMessageDialog(null, "Your account balance now = "+accBal+ "\nYour interest today = "+dailyIn); 
   
   } 
   public void interest(){
    
    dailyIn = (money*0.20)/100; 
    
    JOptionPane.showMessageDialog(null, "Your interest today = "+dailyIn);    //interest daily
   
    }
    
    public void limit(){
        
        String limi;
        
        limi = JOptionPane.showInputDialog("You can set your own limit here");
        limitation = Integer.parseInt(limi);   
    }
    
    public void accNo()
    {
        String accNo = "112-333-433";
    }
}

//////////////////////////////////////////////////////////////////////////////////////////

class NetSaveAcc extends Account   //// Net savings Acc  /////
   {
     double accBal,money, monthlyIn;
     private int limi = 500; //cannot change withdrawal limit // monthly interest
     
    public void bal(){ //balance
    
         JOptionPane.showMessageDialog(null, "Your account balance now = "+accBal);
    }
    
   public void withdraw() //withdraw
   {
           String amount;
           int with= 0;
           
        JOptionPane.showMessageDialog(null,"Your withdraw limit is 500 ");

        amount = JOptionPane.showInputDialog("Please put the amount of money");
        with = Integer.parseInt(amount);
      
        if(with < limi)
        {
            accBal = accBal - with;
        JOptionPane.showMessageDialog(null, "Your account balance now = "+accBal);
            
        }
        else{
        JOptionPane.showMessageDialog(null,"Your withdraw is over your limitation now");
        }
   }
  
   public void deposit() //deposit
   {
    String amount;
       
    amount = JOptionPane.showInputDialog("Please put the amount of money");
    money = Double.parseDouble(amount);
       
    accBal = accBal + money;
    JOptionPane.showMessageDialog(null, "Your account balance now = "+accBal);   
   } 
   
     public void interest(){ //interest monthly
         
      String m;
      int month;
               
     m = JOptionPane.showInputDialog("How long have you had this account ? (month)");  
     month = Integer.parseInt(m);
        
     monthlyIn = month*0.50;  
     
     JOptionPane.showMessageDialog(null, "Your account balance now = "+monthlyIn); 
     
     }  
     public void accNo()
    {
        String accNo = "112-333-500";
    }
}

////////////////////////////////////////////////////////////////////////////////

class ChequeAcc extends Account      //// cheque Acc  /////
   {
       double accBal,money;      // no interest // no withdrawal limit

     public void bal(){
    
        JOptionPane.showMessageDialog(null, "Your account balance now = "+accBal);  
    }
    
   public void withdraw()
   {
       String amount;
       
       amount = JOptionPane.showInputDialog("Please put the amount of money");
       money = Double.parseDouble(amount);
       
       accBal = accBal - money;
       JOptionPane.showMessageDialog(null, "Your account balance now = "+accBal);
  
   }
   public void deposit()
   {
       String amount;
       
       amount = JOptionPane.showInputDialog("Please put the amount of money");
       money = Double.parseDouble(amount);
       
       accBal = accBal + money;
       JOptionPane.showMessageDialog(null, "Your account balance now = "+accBal); 
   }
  
   public void interest(){
       
     //no interest
   }
   public void accNo()
    {
        String accNo = "112-333-899";
    }
}

////////////////////////////////////////////////////////////////////////////////

   class FixAcc extends Account  //// Fix Acc  /////
   {
    double accBal,money;    // Fixed period to withdraw // no daily withdraw // biggest interest 0.8**
    double bigIn;
    int fixtime = 3; // 3 months
             
    public void bal(){
    
    JOptionPane.showMessageDialog(null, "Your account balance now = "+accBal);
      
    }
    
   public void withdraw()
   {
    String amount,m;
    int month;
    int ans;
    double money, interest = 0;
 
    JOptionPane.showMessageDialog(null, "Your fixed period is 3 months, if you withdraw before that you won't get any interest");
    
    m = JOptionPane.showInputDialog("How long have you had this account ? (month)");  
    month = Integer.parseInt(m);
    
    if(month >=fixtime){
        
        bigIn = month*0.80;   //interest
        
        amount = JOptionPane.showInputDialog("Please put the amount of money");
        money = Double.parseDouble(amount);
       
        accBal = accBal - money; //balance
        JOptionPane.showMessageDialog(null, "Your account balance now = "+accBal+"\n Your interest now = "+bigIn); 
    }
    
    else{  
    
       ans = JOptionPane.showConfirmDialog(null,"Are you sure you want to withdraw now ? you won't get any interest");

       if(ans == JOptionPane.YES_OPTION)
        {
         
        amount = JOptionPane.showInputDialog("Please put the amount of money");
        money = Double.parseDouble(amount);
       
        accBal = accBal - money;
        
        JOptionPane.showMessageDialog(null, "Your account balance now = "+accBal+"\n Your interest now = "+interest);   
        
        }
    }   
    }
   
   public void deposit()
   {
   String amount;
       
       amount = JOptionPane.showInputDialog("Please put the amount of money");
       money = Double.parseDouble(amount);
       
   accBal = accBal + money;
   JOptionPane.showMessageDialog(null, "Your account balance now = "+accBal); 
   
   } 
    
    public void interest(){
    
      JOptionPane.showMessageDialog(null,"Your interest now is = "+bigIn);
}
    public void accNo()
    {
        String accNo = "112-333-546";
    }
}



public class Bank {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
               
       login _login = new login(); // start program with login page
        
       _login.setVisible(true);
  
    }
    
}
