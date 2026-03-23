public class Activity1 extends IntegerManager implements PrintPretty {
    public static void main(String[] args) throws Exception {
        Activity1 thingy = new Activity1();
        thingy.buildList();
        thingy.printPretty();
        thingy.shuffle();
        thingy.printPretty();
        thingy.selectionSort();
        thingy.printPretty();
        thingy.shuffle();
        thingy.insertionSort();
        thingy.printPretty();
        thingy.shuffle();
        thingy.insertionSort(true);
        thingy.printPretty();
        
    }

    @Override
    void buildList(){
        nums = new int[20];
        for(int i = 0; i < nums.length; i++){
            int rand = (int)(Math.random() * 100);
            nums[i] = rand;
            System.out.println(nums[i]);
        }
        
    }

    public void printPretty(){
        String name;
        System.out.print("[ ");
        for(int num : nums){
            System.out.print(num + " ");
        }
        System.out.println("]");
    }
    
    @Override
    void shuffle(){
        //loop thru all nums, index i
        //pick random spot, r
        //3 part swap, r-> temp -> i
        for(int i = 0; i < nums.length; i++){
            int r = (int)(Math.random() * (20));
            int temp = nums[i];
            nums[i] = nums[r];
            nums[r] = temp;
        }
    }
    
    @Override
    void insertionSort(){

        for(int i = 1; i < nums.length; i++){
            int abcdefghijklnmopqrstuvwxyz = nums[i];
            int j = i - 1;
            while(j > -1 && nums[j] > abcdefghijklnmopqrstuvwxyz){
                nums[j+1] = nums[j];
                j--;
            }
            nums[j+1] = abcdefghijklnmopqrstuvwxyz;
        }
        System.out.println("Insertion Sort");
    }

    void insertionSort(boolean highToLow){
        if(!highToLow) insertionSort();
        else{
            for(int i = 1; i < nums.length; i++){
                int temp = nums[i];
                int j = i - 1;
                while(j > -1 && nums[j] < temp){
                    nums[j+1] = nums[j];
                    j--;
                }
                nums[j+1] = temp;
            }
            System.out.println("Insertion Sort High to Low");
        }
    }

    void selectionSort(boolean highToLow){
        if(!highToLow) selectionSort();
    }
    
    @Override
    void selectionSort(){

        //outer loop
        for(int i = 0; i < nums.length; i++){
        //find da smol
            int smolspot = i;
            int smol = nums[i];
            for(int k = i + 1; k < nums.length; k++){
                if(nums[k] < smol){
                    smol = nums[k];
                    smolspot = k;
                }
            }
        //three part swap cuz good
        int temp = nums[i];
        nums[i] = nums[smolspot];
        nums[smolspot] = temp;
        }
        System.out.println("Selection Sort");
    }

    @Override
    void mergeSort(){
    }

    @Override
    int pickRandom(){
        return 0;
    }
}
