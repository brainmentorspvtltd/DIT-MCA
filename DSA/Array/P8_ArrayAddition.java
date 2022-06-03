package Array;

public class P8_ArrayAddition {
    public static void main(String[] args) {
        int first[] = {9,1,8,9,2};
        int second[] =  {9,1,2,7};
        int n1 = first.length;
        int n2 = second.length;
        int n3 = (n1 > n2) ? n1 : n2;
        int third[] = new int[n3];
        int carry = 0;
        int sum = 0;
        int i = n1 - 1;
        int j = n2 - 1;
        int k = n3 - 1;
        while(k >= 0) {
            if(i >= 0 && j >= 0) {
                sum = first[i] + second[j] + carry;
            }
            else if(i >= 0 && j < 0) {
                sum = first[i] + carry;
            }
            else if(j >= 0 && i < 0) {
                sum = second[j] + carry;
            }

            carry = sum / 10;
            sum = sum % 10;
            third[k] = sum;
            i--;
            j--;
            k--;
        }

        if(carry != 0) {
            System.out.print(carry);
        }
        for(int e : third) {
            System.out.print(e);
        }
        System.out.println();
    }
}
