class Main {
    // Function to insert a given key in the array. This function returns n+1 if insertion is successful, else n.
    static int insertEnd(int arr[], int n, int key, int capacity) {
        // Cannot insert more elements if n is already more than or equal to capacity
        if (n >= capacity) {
            System.out.println("Insertion failed: array is full.");
            return n;
        }
        
        arr[n] = key; // Insert the key at the end of the array
        return n + 1; // Return new size of the array
    }
    
    public static void main(String[] args) {
        int[] arr = new int[20]; // Create an array with a capacity of 20
        arr[0] = 12;
        arr[1] = 16; 
        arr[2] = 20;
        arr[3] = 40;
        arr[4] = 50;
        arr[5] = 70;
        
        int capacity = 20;
        int n = 6; // Current number of elements in the array
        int key = 26; // Key to be inserted
        
        // Print the array before insertion
        System.out.print("Before Insertion: ");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        
        // Inserting key
        n = insertEnd(arr, n, key, capacity);
        
        // Print the array after insertion
        System.out.print("\nAfter insertion: ");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
