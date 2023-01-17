import java.util.*;

public class ArrayNumberExercise {

    public static void main(String[] args) {

        ArrayList<Integer> arrayList = new ArrayList<>();
        input(arrayList);
        display(arrayList);
        System.out.println();
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
        System.out.printf("Dãy số 3 ở cuối: ");
        for (int index = 0; index < length; index++) {
            if ((list.get(index) %10 ) == 0  || searchNumber(list.get(index)) == 3) {
                System.out.printf(list.get(index) + " ");
            }
        }
    }

    public static int searchNumber(int number) {
        int check = number % 10;
        return check;
    }
}