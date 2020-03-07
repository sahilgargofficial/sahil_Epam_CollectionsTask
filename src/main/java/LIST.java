import java.util.Scanner;

public class LIST {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int ch =0;
        ListImplemetation listImplemetation = new ListImplemetation();
        while(ch!=-1)
        {
            System.out.println("Enter 1 to add element to list, 2 to fetch element from list," +
                    "3 to remove element from list, 4 to print whole list, -1 to exit program");
            ch = sc.nextInt();
            switch (ch)
            {
                case 1 :
                    System.out.println("Enter element to add in list");
                    listImplemetation.add(sc.nextInt());
                    break;
                case 2:
                    System.out.println("Enter element of which to fetch the position");
                    int pos = listImplemetation.fetch(sc.nextInt());
                    if(pos>=0)
                    System.out.println("The position element in the list is "+pos);
                    else
                        System.out.println("Element is not present in the list");
                    break;
                case 3 :
                    System.out.println("Enter the element to remove from list");
                    listImplemetation.remove(sc.nextInt());
                    break;
                case 4:
                    System.out.println("The list is");
                    listImplemetation.print();
                    break;
                case -1:
                    break;

            }

        }
    }
}
