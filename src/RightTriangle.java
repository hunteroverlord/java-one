public class RightTriangle {

    public static void main(String[] args) {
        if (args.length != 3) {
            System.out.println("add Three numbers.");
            return;
        }

        int x = Integer.parseInt(args[0]);
        int y = Integer.parseInt(args[1]);
        int z = Integer.parseInt(args[2]);

        if ( x <= 0 || y <= 0 || z <= 0) {
            System.out.println("all three numbers must be greater than or equal to zero.");
            return;
        }

        if ( x * x + y * y == z *z) {
            System.out.printf("The dimensions; %d, %d, %d will make a right angle triangle.", x, y, z);
        } else {
            System.out.printf("The dimensions; %d, %d, %d will not make a right angle triangle", x, y, z);
        }
    }
}
