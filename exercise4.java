
/**
 * Write a description of exercise4 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class exercise4 {
public void Sumto10(){
    int Total = 0;
    String compo = "1";
    for (int i = 1; i <=10; i++){
        Total += i;
        if (i==1){
        System.out.println(Total);
        }
        if (i>1){
        compo += "+ " + i+ " ";
        System.out.println(Total + " ("+compo+") ");
    }
    }
}
public void SumMore100(){
    int Total = 0;
    String compo = "1";
    
    for (int i = 1; i < 9999999; i++){
        Total += i;
        if (i==1){
        System.out.println(Total);
        }
        if (i>1){
        compo += "+ " + i+ " ";
        System.out.println(Total + " ("+compo+") ");
        }
        if (Total >100){
        break;}
    }

}}
