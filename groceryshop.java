 import java.util.*;
 public class groceryshop {
    // first a person came to shopkeeper 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("welocme to sagar general store");
        ArrayList<String> list = new ArrayList<>();    
        list.add("rice");
        list.add("rock_salt");
        list.add("sugar");
        list.add("cumin");
        list.add("mustard_seeds");
        list.add("dry_chilli");
        list.add("fried_gram ");
        list.add("atta");
        list.add("cornflour");
        list.add("turmeric_powder");
        list.add("milk");

      

      System.out.println("the no.of item may available in our shop: " +list.size());
      System.out.println("display the no.of available item in the shop:"+list);
   
        System.out.println("Enter the name of item you want to buy:\n");
        String itemName=sc.nextLine();
        double price=0;
         int index = list.indexOf(itemName);
          if (index == -1){     
              System.out.println("The given  product is not available in our store.\n");    
           } else{                  
        
             switch(list.get(index)){
                case  "rice":price=50.99;break;
                case "rock_salt" : price=35.46; break;
                case "sugar": price=42.00;break  ;
                case     "cumin" : price=8.75;  
                case  "mustard_seeds": price=12.50;
                break;
               case  "dry_chilli" : price=15.50;
               break;   
               case   "cornflour" : price=75.00;
               break;
               case  "turmeric_powder" : price=18.00;
               break;      
               case  "atta" : price=210.00;
               break;
               case   "milk": price=25.00;
               break;
                default: 
                System.out.println("you entered item not available in shop\n") ; 
                }
               System.out.printf("Price for  1 kg \t" +itemName+"\t"+ "is @rs \t"+price+"\n");   
               System.out.print("How much do you want to buy?\n");    
               int qty = sc.nextInt();  
               System.out.printf("Total amount payable by you is: Rs.%.2f\n",qty*price);      
               }
               System.out.println("Thank you,Visit again");
    }
        
        
    }
    

