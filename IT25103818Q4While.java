Public class IT25103818Q4While {
    public static void main(String[] args) {

        int i = 1;

        while (i <= 5) {          // rows
            int j = 1;
            while (j <= 5) {      // columns
                System.out.print("* ");
                j++;
            }
            System.out.println(); // new line
            i++;
        }
    }
}


