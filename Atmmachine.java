import java.util.*;

class Atmmachine
{
float avlbalance=35000;

void ui()
{
System.out.println("###################################################"); 
System.out.println("#         **** WELLCOME TO SBI ATM ****           #"); 
System.out.println("#                                                 #"); 
System.out.println("#       ENTER ANY OF THE FOLLOWING OPTIONS        #"); 
System.out.println("#                                                 #"); 
System.out.println("#     PRESS 1:    CHECK BANLANCE                  #"); 
System.out.println("#                                                 #"); 
System.out.println("#     PRESS 2:    DEPOSIT CASH                    #");
System.out.println("#                                                 #"); 
System.out.println("#     PRESS 3:    WITHDRAW CASH                   #"); 
System.out.println("#                                                 #"); 
System.out.println("#     PRESS 4:    FUND TRANSFER                   #");
System.out.println("#                                                 #"); 
System.out.println("#     PRESS 5:    EXIT                            #"); 
System.out.println("#                                                 #"); 
System.out.println("###################################################");
}
void selection()
{
int option;
do
{
System.out.print("Enter your option:  ");
Scanner o=new Scanner(System.in);
option=o.nextInt();
switch(option)
{
case 1:
check_bal();
break;
case 2:
Depositcash();
break;
case 3:
withdraw();
break;
case 4:
fundtran();
break;
case 5:
System.exit(1);
break;
default:
System.out.println("You entered wrong Choice! Press 1 2 3 4 or 5 ");
}
}
while(option!=5);

}


 void check_bal()
{
System.out.println("***************************************************");
System.out.println("*                                                 *");
System.out.printf("    Your Avialable balance is : %f \n",avlbalance);
System.out.println("*                                                 *");
System.out.println("***************************************************");
}

void Depositcash()
{
float add;
System.out.println("***************************************************");
System.out.println("*                                                 *");
System.out.println("      Enter Amount to be Deposited:");
Scanner dp=new Scanner(System.in);
add=dp.nextFloat();
System.out.printf("   Rs  %f Amount deposited to your Account\n",add);
System.out.println("              Transaction completed     ");
avlbalance=avlbalance+add;
}



void withdraw()
{
float withdraw;
Scanner amt=new Scanner(System.in);
System.out.println("***************************************");
System.out.print("  Enter the amount to be Withdrawn :    ");
withdraw=amt.nextFloat();
if(withdraw>avlbalance-1000)
{
System.out.println("insuficent balance");
}
else
{
System.out.printf("Withdrawing Rs.%2f ....\n",withdraw);
System.out.println("Transaction completed");
avlbalance=avlbalance-withdraw;
}
}


void fundtran()
{
String acno,amt;
System.out.println("***************************************************");
System.out.println("*                                                 *");
System.out.print("  Enter 14 Digits Account Number : ");
Scanner ft=new Scanner(System.in);
acno=ft.nextLine();
System.out.print("   Enter Amount to be transfered:  ");
amt=ft.nextLine();
System.out.printf("    Rs %s   Transfered to %s A/c ",amt,acno);
}

public static void main(String args[])
{
int atempt=4,pin=2511,enteredpin;
Atmmachine call=new Atmmachine();
Scanner p=new Scanner(System.in);
for(int i=0;i<=4;i++)
{
System.out.printf("\nEnter Your 4 digits PIN to continue :");
enteredpin=p.nextInt();
if(enteredpin==pin)
{
call.ui();
call.selection();
}
else
{
System.out.printf("\n -- You entered Wrong Pin! %d atempts left \n",atempt);
atempt--;
}
}
}
}