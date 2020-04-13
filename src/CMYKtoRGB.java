public class CMYKtoRGB {
        public static void main(String[] args) {
            if (args.length != 4) {
                System.out.println("add four numbers (CMYK)");
                return;
            }
            double c = Double.parseDouble(args[0]);
            double m = Double.parseDouble(args[1]);
            double y = Double.parseDouble(args[2]);
            double k = Double.parseDouble(args[3]);

            boolean validc = isValid(c, "c");
            boolean validm = isValid(m, "m");
            boolean validy = isValid(y, "y");
            boolean validk = isValid(k, "k");

            if (!validc || !validm || !validy || !validk) {
                return;
            }

            System.out.printf("%f, %f, %f, %f\n", c, m, y, k);

            double white = 1.0 - k;
            double red = 255.0 * white * (1.0 - c);
            double blue = 255.0 * white * (1.0 - m);
            double green = 255.0 * white * (1.0 - y);

            System.out.printf("Red: %d Blue: %d Green: %d\n", Math.round(red), Math.round(blue), Math.round(green));
        }

        static boolean isValid(double val, String name) {
            if (val > 1 || val < 0) {
                System.out.printf("Error: the input %s [%f] must be between 0 and 1\n", name, val);
                return false;
            }
            return true;
        }
    }
