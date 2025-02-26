public class Task2_1_9 extends Object {
    public static void main(String[] args) {

        ComplexNumber a = new ComplexNumber(1.11, 1.01);
        ComplexNumber b = new ComplexNumber(1, 1.12);

        System.out.println(a.equals(b));
        System.out.println(a.hashCode() + " " + b.hashCode());
    }

    public static class ComplexNumber {
        private double re;
        private double im;

        public ComplexNumber(double re, double im) {
            this.re = re;
            this.im = im;
        }

        public double getRe() {
            return re;
        }

        public double getIm() {
            return im;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) {
                return true;
            }

            if (o == null || getClass() != o.getClass()) {
                return false;
            }

            ComplexNumber that = (ComplexNumber) o;

            return Double.compare(that.re, re) == 0 && Double.compare(that.im, im) == 0;
        }

        @Override
        public int hashCode() {
            return java.util.Objects.hash(re, im);
        }

    }
}

