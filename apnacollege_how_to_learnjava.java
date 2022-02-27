import java.util.Arrays;
import java.util.Scanner;                                                 // agulo sob package jagulo class r jnno necessary
import javax.lang.model.util.ElementScanner14;
import javax.sound.sampled.SourceDataLine;
public class apnacollege_how_to_learnjava 
{    public static void main(String[] args) 
    {
        //----strings------------------------------------------------------
        //String name = "sanmay";
        //String name1 =name + " " + "das";
          //System.out.println(name.length());
          //System.out.println(name.charAt(3));  //charector print
          // String name2 = name.replace('o','o');
        //System.out.println(name1);
        //System.out.println(name.substring(1,3));
        //----arrays--------------------------------------------------------
        //int[] marks = new int[3];                                 
        //marks[0]=97;
        //marks[1]=98;                    // or int[] marks= {97,98,95};
        //marks[2]=95;
        //int[][] finalmarks = {{93,94,95},{96,97,98}};              // 2d array
        //System.out.print(finalmarks[0][1]);
        //System.out.println(marks[2]);
        //Arrays.sort(marks);
        //System.out.println(marks[2]);
        //----casting--------------------------------------------------------
        //int price =100 ;
        //int finalprice= price + (int)18.10;         //explicit casting = jetake java allow krena jor kre krte hoi bakita mne implicit casting dekhte hle ==https://www.youtube.com/watch?v=UmnCZ7-9yDY&t=2865s er casting position e jate hbe
        //System.out.print(finalprice);
        //----constant-------------------------------------------------------
        //final float PI = 3.14F;                     //constant define by [ final ] keyword .... ai line tar por kono line e PI ke new kno number intialize lra jabena...
        //----operaters-------------------------------------------------------
        //double a = 10;
        //double b = 6;
        //double modulo = a % b;                        // many others like.. + - * / [ is a araithmatic operater].
        //System.out.println(modulo);
        //int num= 2;
        //System.out.println(num--);                     //  --- iska output ha 2 because ya postfix ha and num pahale print ho jayga then 1 minus hoga
        //System.out.println(num);                       // ----iska outout ha 1 because pichle line num 1 minus hogaya[ -- or ++ is a unary operater]
        //----Math class-------------------------------------------------------
        //System.out.println(Math.max(5,6));               //akhne max hlo Math class r akta function jta maximum number print kre[ similarly min is a funtion ]
        //System.out.println(Math.random());                              // random number = 0.0 thake 1.0 r modhe jakno random number return kre r ata by default float e thake
        //----taking input-------------------------------------------------------
        //Scanner sc = new Scanner(System.in);
          //System.out.println("enter your name :");
          ///String name= sc.next();                                      // ai format tai actually main trpr jadi String r ajigai onno k6u hoi th sai data typr taki hbe
          //System.out.println(name);

          //System.out.println("enter your age :");
          //int age = sc.nextInt();                                      // akhne 2 bar data type use hbe 2toi same thakbe so.. float o jadi hoi th tkhn paser ta Float hbe
          //System.out.println(age);

          //System.out.println("enter your name:");
          //String name= sc.nextLine();                                      // sudhu next hle sta aktai token nai mne single word r string r full sentence print krar jnno nextLine function likhte hoi 
          //System.out.println(name);
        //----comparission operater-------------------------------------------------------  
        //a==b; a!= b;                                                    // many others like <,>,<=,>=,
        //----conditional statements-------------------------------------------------------
        //boolean issunup= false;
        //if(issunup == true)                 // akhne (issunup == true) er jaigai sudhu (issunup) likhlao hoto  becouse opore boolean a6e tai rrrr jadi (!issunup) thakto thle night print hoto
        //  System.out.println("day");                                
        //else
        //  System.out.println("night");  
        //----logical operater-------------------------------------------------------
        //----- like [ a < 10 && b > 15 ] ,, [ a >= 3 || b != 8] akhne && and || hlo operater
        //Scanner sc = new Scanner(System.in);
        //System.out.println("enter the cash amount :");
        //int cash= sc.nextInt();
        //if(cash<10)
        //{
        //  System.out.println("cannot buy anything ");
        //  System.out.println("get more cash !!");
        //}
        //else if(cash > 10 && cash<40)
        //{
        // System.out.println("can get one thing");
        //}
        //else 
        //{
        //  System.out.println("can get more than one thing ");
        // }
        // ----conditional ststement(switch)------------------------------------------------------
        // int day= 5;      // 1-nonday 2-tuesday
        // switch(day)
        // {
        //   case 1:
        //     System.out.println("monday");
        //     break;
        //   case 2:
        //     System.out.println("tuesday");
        //     break;
        //   default:
        //     System.out.println("sun - sat");
        // }
        //----Loops-------------------------------------------------------
        // print 100 to 1
        // int i = 100, j=100;
        // //three types of loop are available for , while , do-while
        // while(i>=1)
        // {
        //   System.out.println(i);
        //   i--;
        // }
        // do                                                ///notice::: while e while lekhar por kno semicolone dte h66na but do-while e dte h66
        // {
        //   System.out.println(i);
        //   i--;
        // }while(i>=1);
        //----break nad continue-------------------------------------------------------
        // int i = 0;
        // // while(true)
        // // {
        // //   if(i==3)
        // //   {
        // //     i=i+1;
        // //     continue;
        // //   }                                             // continue r break r mdhe diffarence holo break totaly break kre dai loop take r continue sudhu oi iteration ta skip kre
        // //   System.out.println(i);
        // //   i=i+1;                                                
        // //   if(i>5)
        // //   {
        // //     break;
        // //   }
        // // }/
        //----constant-------------------------------------------------------
        //catch keyword for catch handaling for farther quary https://www.youtube.com/watch?v=UmnCZ7-9yDY&t=3883s
        //----Function & Methods-------------------------------------------------------
        //printsanmay();                                      //function toirir 1 no method e use hbe
        // printsanmay("hello sanmay");                          //function toirir 2 no method e use hbe   
        //printsum(1,5);                                           //function toiror 3 no method e use hbe
    }
    // public static void printsanmay()
    // {
    //   System.out.println("hello sanamy");                           //[[ 1 ]] normal function creation
    // }
    // public static void printsanmay(String name)
    //  {
    //    System.out.println(name);                           // [[ 2 ]]  function creation .. je function e input dte hbe then execute hbe..
    //  }
    // public static void printsum(int a,int b)                    //[[ 3 ]]  akhne 2 to input dte hbe
    // {
    //   int sum = a+b;
    //   System.out.println(sum);
    // }
}

