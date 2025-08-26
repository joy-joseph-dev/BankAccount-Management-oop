class AccountManagement{
  private  String  accountnumber;
   public  String getaccountnumber()
   {
    return accountnumber;
   }
   public boolean  setaccountnumber(String accountnumber)
   {
    if(accountnumber!=null&&accountnumber.matches("\\d{10}")){
    this.accountnumber=accountnumber;
    return true;}
    else {
      return false;
   }
   }
  private double balance;
    public double getbalance()
  {
    return balance;
  }
  public boolean setbalance(double balance)
  {
    if(balance>=0){
    this.balance=balance;
    return true;}
    else{
      return false;
    }
  }
 public double deposit;
  double getdeposit()
  {
    return deposit;
  }
  public boolean setdeposit(double deposit)
  {
    if(deposit>=0){
    this.deposit=deposit;
   return true;
  }
    else{
      return false;
    }
  }
  double withdraw;
  public double getwithdraw()
  {
    return withdraw;
  }
  public boolean setwithdraw(double withdraw)
  {
    if(withdraw>=0&&withdraw<=currentbalance+balance+deposit){
    this.withdraw=withdraw;
    return true;}
    else{
      return false;
    }
  }
  double currentbalance;
  double getcurrentbalance()
  {
    return currentbalance;
  }
   void setcurrentbalance( double currentbalance)
   {
    this.currentbalance=balance+deposit+currentbalance-withdraw;
  }
   }
class BankAccount{
  public static void main(String[]args){
    AccountManagement obj=new AccountManagement();
    if(obj.setaccountnumber("1234567890")){
    System.out.println("AccountNumber"+obj.getaccountnumber());}
    else{
        System.out.println("Account number must be 10 digit");}
    if(obj.setbalance(100)){
    System.out.println("Balance"+obj.getbalance());}
    else{
        System.out.println("Nill balance");}
    if(obj.setdeposit(200)){
    System.out.println("Deposit"+obj.getdeposit());}
    else{
        System.out.println("Enter Amount Greater than 0");}
    if(obj.setwithdraw(200)){
        System.out.println("withdraw"+obj.getwithdraw());}
    else{
    System.out.println("withdraw Amount shouldn'nt exceed");}
    obj.setcurrentbalance(0);
    System.out.println("CurrentBalance"+obj.getcurrentbalance());
}
}