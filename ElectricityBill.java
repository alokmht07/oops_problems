import java.util.*; 
class ElectricityBill{
    public static void main(String args[]) { 
        int choice;
        long units, consumer_no, current_reading, previous_reading; 
        String consumer_name;
        Scanner sc=new Scanner(System.in); 
        System.out.println("Enter Consumer Number:"); consumer_no=sc.nextLong(); 
        System.out.println("Enter Consumer Name:"); 
        consumer_name=sc.next(); 
        System.out.println("Enter Current Reading:"); 
        current_reading=sc.nextLong(); 
        System.out.println("Enter Previous Reading:"); 
        previous_reading=sc.nextLong(); 
        System.out.println("Type of EB connection"); 
        System.out.println("1. Domestic"); System.out.println("2. Commercial"); 
        System.out.println("Select the EB connection"); 
        choice=sc.nextInt();
        double billpay=0;
        units=current_reading-previous_reading;
         
        switch(choice)
        {
            case 1 :
            if(units<100) 
                billpay=units*1; 
            else if(units<200)
                billpay=100*1+(units-100)*2.50; 
            else if(units<500)
                billpay=100*1+ 100*2.50+(units-200)*4; 
            else if(units>500)
                billpay=100*1+100*2.50+300*4+(units-500)*6;
            System.out.println("\nConsumer Number :" +consumer_no+"\nConsumer Name : "+consumer_name+"\nPrevious Reading : " +previous_reading+"\nCurrent Reading : "+current_reading); 
            System.out.println("\nTotal units consumed : "+units); 
            System.out.println("Bill to pay : " + billpay);
            break; 
            
            case 2 :
            if(units<100) 
                billpay=units*2; 
            else if(units<200)
                billpay=100*2+(units-100)*4.50; 
            else if(units<500)
                billpay=100*2+ 100*4.50+(units-200)*6; 
            else if(units>500)
                billpay=100*2+100*4.50+300*6+(units-500)*7;
            System.out.println("\nConsumer Number :" +consumer_no+"\nConsumer Name : "+consumer_name+ "\nPrevious Reading : " +previous_reading+"\nCurrent Reading : "+current_reading);
            System.out.println("\nTotal units consumed : "+units); 
            System.out.println("Bill to pay : " + billpay);
            break; default :
            System.out.println("wrong reading");
        }
        sc.close();
    }
}
