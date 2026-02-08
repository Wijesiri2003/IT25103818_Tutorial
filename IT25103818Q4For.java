Public class IT25103818Q4For {
    public static void main(String[] args) {

        for (int row = 1; row <= 5; row++) {

            // spaces
            for (int space = 1; space <= 5 - row; space++) {
                System.out.print(" ");
            }

            // stars
            for (int star = 1; star <= row; star++) {
                System.out.print("* ");
            }

            System.out.println(); // new line
        }
    }
}


