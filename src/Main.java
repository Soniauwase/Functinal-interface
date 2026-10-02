import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        FileWriter writer=new FileWriter("practice.txt");
        writer.write(" hello class , this is java class!");
        writer.close();

        FileReader reader=new FileReader("practice.txt");
        int letter= reader.read();
         while (reader.read()!=-1){
             System.out.println((char) letter);
         }
         reader.close();
        BufferedWriter bufferedWriter=new BufferedWriter(new FileWriter("practice.txt",true));
        bufferedWriter.write("fddfhrejfnwfwndmmdfndmnnsmansdmjnrjnje cmd czcmdnfjnejemnmwemmmmm,wemnenkqqne emmemwq  ejq mq j4q wqj eqj4 jqwjrjrqnq nq d mememq dmd");
        writer.close();
        BufferedReader reader1=new BufferedReader(new FileReader("practice.txt"));
         String line ;
         while ((line = reader1.readLine())!=null){
             System.out.println(line);
         }

    }
}












//import java.io.FileWriter;
//import java.io.IOException;
//import java.util.ArrayList;
//import java.util.Arrays;
//import java.util.UUID;
//import java.util.function.Function;
//import java.util.function.Predicate;
//import java.util.function.Supplier;
//import java.util.List;
//
//public  class Main{
//
//
//    public static void main(String[] args) throws IOException {
//
//        Transaction transaction= new Transaction(12000.00,"EUR","EUROPE","SOFTWARE",true);
//        System.out.println(transaction);
//        PaymentRouter router = (transaction1)->transaction1.getOriginCountry().equals("US") ?"ACH_NETWORK":"SWIFT_NETWORK" ;
//        System.out.println(router.route(transaction));
//        Transaction transaction1= new Transaction(100.1,"RWF","RWANDA","GAMBLING",true);
//        Supplier<String>Traceid=()-> UUID.randomUUID().toString();
//
//        List<Transaction>transactions= new ArrayList<>();
//        transactions.add(transaction1);
//        transactions.add(transaction);
//        for(Transaction t: transactions) {
//            t.setTransactionID(Traceid.get());
//        }
//        System.out.println(transactions);
//        Predicate<Transaction>isFlagged=( t)->t.getAmount()>10000;
//        System.out.println(isFlagged.or(t->t.getMerchantCategory().equals("GAMBLING")).test(transaction));
//
////
////            Function<Transaction,Double> feeCalculation=(t)->
//////                double feeCharge;
//////                if (isFlagged.test(t)) {
//////                    feeCharge = t.getAmount()+ 50000;
//////                }
//////                else {
//////                    feeCharge = t.getAmount() + (t.getAmount()* 0.025);
//////                }
//////                return feeCharge;
//////            };
//        Function<Transaction,Double>feeCalculation=(t)->isFlagged.or(t1->t1.getMerchantCategory().equals("GAMBLING")).test(t)?t.getAmount()+50000:t.getAmount()+(t.getAmount()*0.025);
//
//  System.out.println("FEE CHARGES TO BE PAID :" +feeCalculation.apply(transaction1));
//
//
//
//
//
//
//
//
//    }
//}
