import java.util.*;

public class Main {

    public static void main(String[] args) {

        ArrayList<Integer> arrayList = new ArrayList<>();
        input(arrayList);
        arrangeNumber(arrayList);
        display(arrayList);
    }

    public static void input(ArrayList<Integer> list) {
        System.out.println("Nhập số phần tử trong mảng");
        int length;
        Scanner sc = new Scanner(System.in);
        length = sc.nextInt();
        ArrayList<Integer> arrayList = list;
        System.out.println("Nhập các phần từ có trong mảng là: ");
        for (int index = 0; index < length; index++) {
            arrayList.add(sc.nextInt());
        }
    }

    public static ArrayList<Integer> arrangeNumber(ArrayList<Integer> list) {
        ArrayList<Integer> arrayList = list;
        arrayList.sort(Comparator.naturalOrder());
        return arrayList;
    }

    public static void display(ArrayList<Integer> list) {
        int length = list.size();
        System.out.printf("Dãy số được nhập: ");
        for (int index = 0; index < length; index++) {
            System.out.printf(list.get(index) + " ");

        }
        System.out.println();
        System.out.printf("Dãy số chứa số 1 ở đầu hoặc số 3 ở cuối: ");
        for (int index = 0; index < length; index++) {
            if (searchNumber1AtTheTop(list.get(index)) == 1
                    || searchNumber3AtTheEnd(list.get(index)) == 3) {// điều kiện để kiểm tra số đó
                System.out.printf(list.get(index) + " ");
            }
        }

    }

    public static int searchNumber3AtTheEnd(int number) {

        int check = number % 10;
        return check;

    }

    public static int searchNumber1AtTheTop(int number) {
        int check = 0;

        while (number > 0) {
            check = number % 10;
            number /= 10;
        }

        return check;
    }
}