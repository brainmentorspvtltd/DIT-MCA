package Array;

import java.util.Scanner;

public class P1_ArrayCRUD {
    int currentSize;
    int arr[];

    P1_ArrayCRUD(int capacity) {
        this.arr = new int[capacity];
        currentSize = 0;
    }

    void insert(int index, int value) {
        if(index > currentSize) {
            throw new RuntimeException("Index cannot be greater than current size");
        }

        if(currentSize == arr.length) {
            System.out.println("Array is full...Cannot add more elements...");
            return;
        }

        for(int i = currentSize - 1; i >= index; i--) {
            arr[i+1] = arr[i];
        }

        arr[index] = value;
        currentSize++;
        System.out.println("Element Added...");
        print();
    }

    void delete(int index) {
        if(currentSize == 0) {
            System.out.println("Array is Empty...");
            return;
        }

        for(int i = index; i < currentSize - 1; i++) {
            arr[i] = arr[i+1];
        }        

        arr[currentSize-1] = 0;
        currentSize--;
        System.out.println("Element Removed...");
        print();
    }

    // Linear Search
    int search(int value) {
        for(int i = 0; i < arr.length; i++) {
            if(arr[i] == value) {
                return i;
            }
        }
        System.out.println("Not Found...");
        return -1;
    }

    void update(int valueToSearch, int valueToUpdate) {
        int index = search(valueToSearch);
        if(index == -1) {
            return;
        }
        else {
            arr[index] = valueToUpdate;
            System.out.println("Value Updated...");
            print();
        }
    }

    void print() {
        for(int e : arr) {
            System.out.print(e + ",");
        }
        System.out.println("\n=======================");
    }

    public static void main(String[] args) {
        P1_ArrayCRUD obj = new P1_ArrayCRUD(6);
        // obj.insert(0, 11);
        // obj.insert(1, 15);
        // obj.insert(2, 20);
        // obj.insert(1, 12);
        // obj.delete(1);

        Scanner scanner = new Scanner(System.in);
        int choice;
        int index;
        int value;

        while(true) {
            System.out.println("Array CRUD Operations...");
            System.out.println("1. Insert Operation");
            System.out.println("2. Delete Operation");
            System.out.println("3. Search Operation");
            System.out.println("4. Update Operation");
            System.out.println("5. Print Operation");
            System.out.println("6. Exit Operation");
            choice = scanner.nextInt();
            ArrayOperations enumChoice = ArrayOperations.values()[choice - 1];
            switch (enumChoice) {
                case INSERT:
                    System.out.print("Enter the index : ");
                    index = scanner.nextInt();
                    System.out.print("Enter the value : ");
                    value = scanner.nextInt();
                    obj.insert(index, value);
                    break;
                case DELETE:
                    System.out.print("Enter the index : ");
                    index = scanner.nextInt();
                    obj.delete(index);
                    break;
                
                case SEARCH:
                    break;
                
                case UPDATE:
                    break;
                
                case PRINT:
                    break;

                default:
                    System.out.println("Invalid Choice...");
            }
        }

    }
}

// enum - represents the group of constant
enum ArrayOperations {
    INSERT, DELETE, SEARCH, PRINT, UPDATE, EXIT
}