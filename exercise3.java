
/**
 * Write a description of exercise3 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class exercise3 {
public void test(){
    int n=0, y =0, x = 1;
    while (n == 0){
        y = y + x;
        x++;
        if (x>5) n = 1;
        System.out.println(n);
        System.out.println(x);
        System.out.println(y);
    }
}
}
