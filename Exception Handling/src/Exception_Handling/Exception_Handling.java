package Exception_Handling;

public class Exception_Handling {

    public static void main(String[] args) {

        try {
            int x = 10;
            int y = 0;
            int[] a = new int[4];
            a[4] = 10;
            int result = x / y;
            System.out.println("Result: " + result);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Exception :" + e);
        } catch (ArithmeticException e2) {
            System.out.println("Exception :" + e2);
        }
        catch (Exception e3) {
            System.out.println("Exception :" + e3);
        }finally {
            System.out.println("Lat line of the program.");

        }
    }
}
