package Oops;
public class CarnivalBooth {

    public static String canServe(int[] customers) {
        int count10 = 0;
        int count20 = 0;

        for (int bill : customers) {
            if (bill == 10) {
                count10++;
            }
            else if (bill == 20) {
                if (count10 >= 1) {
                    count10--;
                    count20++;
                } else {
                    return "No";
                }
            }
            else if (bill == 50) {
                if (count20 >= 1 && count10 >= 1) {
                    count20--;
                    count10--;
                }
                else if (count10 >= 3) {
                    count10 -= 3;
                } else {
                    return "No";
                }
            }
        }
        return "Yes";
    }

    public static void main(String[] args) {
        int[] order1 = {10, 10, 10, 20, 50};
        int[] order2 = {10, 10, 20, 50};
        int[] order3 = {20, 10};

        System.out.println("Order 1: " + canServe(order1));
        System.out.println("Order 2: " + canServe(order2));
        System.out.println("Order 3: " + canServe(order3));
    }
}

