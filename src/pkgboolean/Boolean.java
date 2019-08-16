
package pkgboolean;
public class Boolean {
    public static void main(String[] args) {
        boolean a, b;
        boolean r1, r2, r3, r4;
        a =true;
        b = false;
        
        r1 = (a||b && a||!b);
        r2 = (!(a||!b)&&(a||b));
        r3 = (a&&b) && (!a||!b);
        r4 = (!a||b||a||!b);
        
        System.out.println(r1);
        System.out.println(r2);
        System.out.println(r3);
        System.out.println(r4);
        
    }
    
}
